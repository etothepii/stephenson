package uk.co.epii.stephenson.cif;

import java.io.Serializable;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 15:38
 */
public interface IntermediateLocation extends Serializable {

  public String getRecordIdentity();
  public String getLocation();
  public NationalRailTime getScheduledArrival();
  public NationalRailTime getScheduledDeparture();
  public NationalRailTime getScheduledPass();
  public NationalRailTime getPublicArrival();
  public NationalRailTime getPublicDeparture();
  public String getPlatform();
  public String getLine();
  public String getPath();
  public String getActivity();
  public String getEngineeringAllowance();
  public String getPathingAllowance();
  public String getPerformanceAllowance();
  public String getSpare();


}
