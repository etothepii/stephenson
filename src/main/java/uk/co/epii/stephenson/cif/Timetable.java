package uk.co.epii.stephenson.cif;

import java.io.Serializable;
import java.util.Set;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 22:38
 */
public interface Timetable extends Serializable {
  public Set<Train> getTrains(String... stations);
  public int size();
}
