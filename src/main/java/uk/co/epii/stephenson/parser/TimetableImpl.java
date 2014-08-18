package uk.co.epii.stephenson.parser;

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
public class TimetableImpl implements Timetable {

  private final Set<Train> allTrains;

  public TimetableImpl() {
    allTrains = new HashSet<Train>();
  }

  void addTrain(Train train) {
    allTrains.add(train);
  }

  @Override
  public Iterable<Train> getTrains(String... stations) {
    return null;
  }

  @Override
  public int size() {
    return allTrains.size();
  }


}
