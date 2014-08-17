package uk.co.epii.stephenson.parser;

import uk.co.epii.stephenson.cif.IntermediateLocation;
import uk.co.epii.stephenson.cif.NationalRailTime;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 16:06
 */
class IntermediateLocationImpl implements IntermediateLocation {

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

  IntermediateLocationImpl() { }

  IntermediateLocationImpl(String recordIdentity, String location, NationalRailTime scheduledArrival,
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    IntermediateLocationImpl that = (IntermediateLocationImpl) o;

    if (activity != null ? !activity.equals(that.activity) : that.activity != null) return false;
    if (engineeringAllowance != null ? !engineeringAllowance.equals(that.engineeringAllowance) : that.engineeringAllowance != null)
      return false;
    if (line != null ? !line.equals(that.line) : that.line != null) return false;
    if (location != null ? !location.equals(that.location) : that.location != null) return false;
    if (path != null ? !path.equals(that.path) : that.path != null) return false;
    if (pathingAllowance != null ? !pathingAllowance.equals(that.pathingAllowance) : that.pathingAllowance != null)
      return false;
    if (performanceAllowance != null ? !performanceAllowance.equals(that.performanceAllowance) : that.performanceAllowance != null)
      return false;
    if (platform != null ? !platform.equals(that.platform) : that.platform != null) return false;
    if (publicArrival != null ? !publicArrival.equals(that.publicArrival) : that.publicArrival != null) return false;
    if (publicDeparture != null ? !publicDeparture.equals(that.publicDeparture) : that.publicDeparture != null)
      return false;
    if (recordIdentity != null ? !recordIdentity.equals(that.recordIdentity) : that.recordIdentity != null)
      return false;
    if (scheduledArrival != null ? !scheduledArrival.equals(that.scheduledArrival) : that.scheduledArrival != null)
      return false;
    if (scheduledDeparture != null ? !scheduledDeparture.equals(that.scheduledDeparture) : that.scheduledDeparture != null)
      return false;
    if (scheduledPass != null ? !scheduledPass.equals(that.scheduledPass) : that.scheduledPass != null) return false;
    if (spare != null ? !spare.equals(that.spare) : that.spare != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = recordIdentity != null ? recordIdentity.hashCode() : 0;
    result = 31 * result + (location != null ? location.hashCode() : 0);
    result = 31 * result + (scheduledArrival != null ? scheduledArrival.hashCode() : 0);
    result = 31 * result + (scheduledDeparture != null ? scheduledDeparture.hashCode() : 0);
    result = 31 * result + (scheduledPass != null ? scheduledPass.hashCode() : 0);
    result = 31 * result + (publicArrival != null ? publicArrival.hashCode() : 0);
    result = 31 * result + (publicDeparture != null ? publicDeparture.hashCode() : 0);
    result = 31 * result + (platform != null ? platform.hashCode() : 0);
    result = 31 * result + (line != null ? line.hashCode() : 0);
    result = 31 * result + (path != null ? path.hashCode() : 0);
    result = 31 * result + (activity != null ? activity.hashCode() : 0);
    result = 31 * result + (engineeringAllowance != null ? engineeringAllowance.hashCode() : 0);
    result = 31 * result + (pathingAllowance != null ? pathingAllowance.hashCode() : 0);
    result = 31 * result + (performanceAllowance != null ? performanceAllowance.hashCode() : 0);
    result = 31 * result + (spare != null ? spare.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "IntermediateLocationImpl{" +
            "recordIdentity='" + recordIdentity + '\'' +
            ", location='" + location + '\'' +
            ", scheduledArrival=" + scheduledArrival +
            ", scheduledDeparture=" + scheduledDeparture +
            ", scheduledPass=" + scheduledPass +
            ", publicArrival=" + publicArrival +
            ", publicDeparture=" + publicDeparture +
            ", platform='" + platform + '\'' +
            ", line='" + line + '\'' +
            ", path='" + path + '\'' +
            ", activity='" + activity + '\'' +
            ", engineeringAllowance='" + engineeringAllowance + '\'' +
            ", pathingAllowance='" + pathingAllowance + '\'' +
            ", performanceAllowance='" + performanceAllowance + '\'' +
            ", spare='" + spare + '\'' +
            '}';
  }
}
