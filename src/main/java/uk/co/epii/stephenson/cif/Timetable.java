package uk.co.epii.stephenson.cif;

import java.util.Set;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 22:38
 */
public interface Timetable {
  public Iterable<Train> getTrains(String... stations);
  public int size();
}
