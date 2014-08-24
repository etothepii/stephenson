package uk.co.epii.stephenson.parser;

import uk.co.epii.stephenson.cif.IntermediateLocation;
import uk.co.epii.stephenson.cif.Timetable;
import uk.co.epii.stephenson.cif.Train;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

/**
 * User: James Robinson
 * Date: 18/08/2014
 * Time: 00:50
 */
public class TimetableDiskImpl implements LoadableTimetable {

  private final File folder;
  private final Set<String> allTrains;
  private final HashMap<String, Set<String>> allTrainsGroupedByStop;
  private final ObjectLoader<Train> trainLoader = new ObjectLoader<Train>();

  public TimetableDiskImpl(File folder) {
    this.folder = folder;
    allTrains = new HashSet<String>();
    allTrainsGroupedByStop = new HashMap<String, Set<String>>();
  }

  @Override
  public void addTrain(Train train) {
    saveWithUniqueIdentifier(train);
    allTrains.add(train.getUniqueIdentifier());
    getStoppingAt(train.getOriginLocation().getLocation()).add(train.getUniqueIdentifier());
    for (IntermediateLocation intermediateLocation : train.getIntermediateStops()) {
      getStoppingAt(intermediateLocation.getLocation()).add(train.getUniqueIdentifier());
    }
    getStoppingAt(train.getTerminatingLocation().getLocation()).add(train.getUniqueIdentifier());
  }

  private Set<String> getStoppingAt(String station) {
    Set<String> stopAt = allTrainsGroupedByStop.get(station);
    if (stopAt == null) {
      stopAt = new HashSet<String>();
      allTrainsGroupedByStop.put(station, stopAt);
    }
    return stopAt;
  }

  @Override
  public Set<Train> getTrains(String... stations) {
    if (stations.length == 0) {
      throw new UnsupportedOperationException("There are too many trains to return all of them");
    }
    HashSet<Train> stoppingEverywhere = new HashSet<Train>();
    for (String trainUID : getStoppingAt(stations[0])) {
      Train train = loadFromUniqueIdentifier(trainUID);
      if (train.stops(stations)) {
        stoppingEverywhere.add(train);
      }
    }
    return stoppingEverywhere;
  }

  private Train loadFromUniqueIdentifier(String trainUniqueIdentifier) {
    File loadFrom = new File(folder, String.format("%s.train", trainUniqueIdentifier));
    return trainLoader.load(loadFrom);
  }

  private void saveWithUniqueIdentifier(Train train) {
    File saveTo = new File(folder, String.format("%s.train", train.getUniqueIdentifier()));
    trainLoader.save(saveTo, train);
  }

  @Override
  public int size() {
    return allTrains.size();
  }

}
