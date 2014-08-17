package uk.co.epii.stephenson.cif;

import java.util.Set;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 22:38
 */
public interface Timetable {
  public Set<Train> getTrains(String... stations);
}
