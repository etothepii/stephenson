package uk.co.epii.stephenson.parser;

import uk.co.epii.stephenson.cif.NationalRailTime;
import uk.co.epii.stephenson.cif.OriginLocation;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 15:12
 */
public class OriginLocationImpl implements OriginLocation {

  private String recordIdentity;
  private String location;
  private NationalRailTime scheduledDeparture;
  private NationalRailTime publicDeparture;
  private String platform;
  private String line;
  private String engineeringAllowance;
  private String pathingAllowance;
  private String activity;
  private String performanceAllowance;
  private String spare;

  public OriginLocationImpl() {
  }

  public OriginLocationImpl(String recordIdentity, String location, NationalRailTime scheduledDeparture,
                            NationalRailTime publicDeparture, String platform, String line, String engineeringAllowance,
                            String pathingAllowance, String activity, String performanceAllowance, String spare) {
    this.recordIdentity = recordIdentity;
    this.location = location;
    this.scheduledDeparture = scheduledDeparture;
    this.publicDeparture = publicDeparture;
    this.platform = platform;
    this.line = line;
    this.engineeringAllowance = engineeringAllowance;
    this.pathingAllowance = pathingAllowance;
    this.activity = activity;
    this.performanceAllowance = performanceAllowance;
    this.spare = spare;
  }

  public String getRecordIdentity() {
    return recordIdentity;
  }

  public void setRecordIdentity(String recordIdentity) {
    this.recordIdentity = recordIdentity;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public NationalRailTime getScheduledDeparture() {
    return scheduledDeparture;
  }

  public void setScheduledDeparture(NationalRailTime scheduledDeparture) {
    this.scheduledDeparture = scheduledDeparture;
  }

  public NationalRailTime getPublicDeparture() {
    return publicDeparture;
  }

  public void setPublicDeparture(NationalRailTime publicDeparture) {
    this.publicDeparture = publicDeparture;
  }

  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public String getLine() {
    return line;
  }

  public void setLine(String line) {
    this.line = line;
  }

  public String getEngineeringAllowance() {
    return engineeringAllowance;
  }

  public void setEngineeringAllowance(String engineeringAllowance) {
    this.engineeringAllowance = engineeringAllowance;
  }

  public String getPathingAllowance() {
    return pathingAllowance;
  }

  public void setPathingAllowance(String pathingAllowance) {
    this.pathingAllowance = pathingAllowance;
  }

  public String getActivity() {
    return activity;
  }

  public void setActivity(String activity) {
    this.activity = activity;
  }

  public String getPerformanceAllowance() {
    return performanceAllowance;
  }

  public void setPerformanceAllowance(String performanceAllowance) {
    this.performanceAllowance = performanceAllowance;
  }

  public String getSpare() {
    return spare;
  }

  public void setSpare(String spare) {
    this.spare = spare;
  }
}
