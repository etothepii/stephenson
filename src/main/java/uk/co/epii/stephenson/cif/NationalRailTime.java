package uk.co.epii.stephenson.cif;

import java.io.Serializable;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 14:17
 */
public interface NationalRailTime extends Comparable<NationalRailTime>, Serializable {

  public int getAdditionalDays();
  public int getHours();
  public int getMinutes();
  public int getSeconds();

}
