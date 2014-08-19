package uk.co.epii.stephenson.parser;

import uk.co.epii.stephenson.cif.IntermediateLocation;
import uk.co.epii.stephenson.cif.Timetable;
import uk.co.epii.stephenson.cif.Train;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * User: James Robinson
 * Date: 18/08/2014
 * Time: 00:50
 */
public class TimetableMemoryImpl implements Timetable {

  private final Set<Train> allTrains;
  private final HashMap<String, Set<Train>> allTrainsGroupedByStop;

  public TimetableMemoryImpl() {
    allTrains = new HashSet<Train>();
    allTrainsGroupedByStop = new HashMap<String, Set<Train>>();
  }

  void addTrain(Train train) {
    allTrains.add(train);
    getStoppingAt(train.getOriginLocation().getLocation()).add(train);
    for (IntermediateLocation intermediateLocation : train.getIntermediateStops()) {
      getStoppingAt(intermediateLocation.getLocation()).add(train);
    }
    getStoppingAt(train.getTerminatingLocation().getLocation()).add(train);
  }

  private Set<Train> getStoppingAt(String station) {
    Set<Train> stopAt = allTrainsGroupedByStop.get(station);
    if (stopAt == null) {
      stopAt = new HashSet<Train>();
      allTrainsGroupedByStop.put(station, stopAt);
    }
    return stopAt;
  }

  @Override
  public Set<Train> getTrains(String... stations) {
    if (stations.length == 0) {
      return allTrains;
    }
    HashSet<Train> stoppingEverywhere = new HashSet<Train>();
    for (Train train : getStoppingAt(stations[0])) {
      if (train.stops(stations)) {
        stoppingEverywhere.add(train);
      }
    }
    return stoppingEverywhere;
  }

  @Override
  public int size() {
    return allTrains.size();
  }


}
