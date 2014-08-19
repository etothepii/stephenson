package uk.co.epii.stephenson.cif;

import java.io.Serializable;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 15:01
 */
public interface OriginLocation extends Serializable {

  public String getRecordIdentity();
  public String getLocation();
  public NationalRailTime getScheduledDeparture();
  public NationalRailTime getPublicDeparture();
  public String getPlatform();
  public String getLine();
  public String getEngineeringAllowance();
  public String getPathingAllowance();
  public String getActivity();
  public String getPerformanceAllowance();
  public String getSpare();

}
