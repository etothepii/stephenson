package uk.co.epii.stephenson.cif;

import java.util.Date;
import java.util.Map;

/**
 * User: James Robinson
 * Date: 24/08/2014
 * Time: 16:23
 */
public interface Flow {

  public String getUpdateMarker();
  public String getRecordType();
  public String getOriginCode();
  public String getDestinationCode();
  public String getRouteCode();
  public String getStatusCode();
  public String getUsageCode();
  public String getDescription();
  public Date getEndDate();
  public Date getStartDate();
  public String getTrainOperatingCode();
  public int getCrossLondonIndicator();
  public int getNonStandardDiscountIndicator();
  public boolean getPublicationIndicator();
  public String getFlowId();
  public Map<String, FareRecord> getFares();

}
