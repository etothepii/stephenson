package uk.co.epii.stephenson.cif;

import java.io.Serializable;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 16:20
 */
public interface TerminatingLocation extends Serializable {

  public String getRecordIdentity();
  public String getLocation();
  public NationalRailTime getScheduledArrival();
  public NationalRailTime getPublicArrival();
  public String getPlatform();
  public String getPath();
  public String getActivity();
  public String getSpare();

}
