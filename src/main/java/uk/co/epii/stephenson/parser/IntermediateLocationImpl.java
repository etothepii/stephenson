package uk.co.epii.stephenson.parser;

import uk.co.epii.stephenson.cif.IntermediateLocation;
import uk.co.epii.stephenson.cif.NationalRailTime;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 16:06
 */
public class IntermediateLocationImpl implements IntermediateLocation {

  private String recordIdentity;
  private String location;
  private NationalRailTime scheduledArrival;
  private NationalRailTime scheduledDeparture;
  private NationalRailTime scheduledPass;
  private NationalRailTime publicArrival;
  private NationalRailTime publicDeparture;
  private String platform;
  private String line;
  private String path;
  private String activity;
  private String engineeringAllowance;
  private String pathingAllowance;
  private String performanceAllowance;
  private String spare;

  public IntermediateLocationImpl() { }

  public IntermediateLocationImpl(String recordIdentity, String location, NationalRailTime scheduledArrival,
                                  NationalRailTime scheduledDeparture, NationalRailTime scheduledPass,
                                  NationalRailTime publicArrival, NationalRailTime publicDeparture, String platform,
                                  String line, String path, String activity, String engineeringAllowance,
                                  String pathingAllowance, String performanceAllowance, String spare) {
    this.recordIdentity = recordIdentity;
    this.location = location;
    this.scheduledArrival = scheduledArrival;
    this.scheduledDeparture = scheduledDeparture;
    this.scheduledPass = scheduledPass;
    this.publicArrival = publicArrival;
    this.publicDeparture = publicDeparture;
    this.platform = platform;
    this.line = line;
    this.path = path;
    this.activity = activity;
    this.engineeringAllowance = engineeringAllowance;
    this.pathingAllowance = pathingAllowance;
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

  public NationalRailTime getScheduledArrival() {
    return scheduledArrival;
  }

  public void setScheduledArrival(NationalRailTime scheduledArrival) {
    this.scheduledArrival = scheduledArrival;
  }

  public NationalRailTime getScheduledDeparture() {
    return scheduledDeparture;
  }

  public void setScheduledDeparture(NationalRailTime scheduledDeparture) {
    this.scheduledDeparture = scheduledDeparture;
  }

  public NationalRailTime getScheduledPass() {
    return scheduledPass;
  }

  public void setScheduledPass(NationalRailTime scheduledPass) {
    this.scheduledPass = scheduledPass;
  }

  public NationalRailTime getPublicArrival() {
    return publicArrival;
  }

  public void setPublicArrival(NationalRailTime publicArrival) {
    this.publicArrival = publicArrival;
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

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public String getActivity() {
    return activity;
  }

  public void setActivity(String activity) {
    this.activity = activity;
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
