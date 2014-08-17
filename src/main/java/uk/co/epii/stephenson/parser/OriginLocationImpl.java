package uk.co.epii.stephenson.parser;

import uk.co.epii.stephenson.cif.NationalRailTime;
import uk.co.epii.stephenson.cif.OriginLocation;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 15:12
 */
class OriginLocationImpl implements OriginLocation {

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

  OriginLocationImpl() {
  }

  OriginLocationImpl(String recordIdentity, String location, NationalRailTime scheduledDeparture,
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    OriginLocationImpl that = (OriginLocationImpl) o;

    if (activity != null ? !activity.equals(that.activity) : that.activity != null) return false;
    if (engineeringAllowance != null ? !engineeringAllowance.equals(that.engineeringAllowance) : that.engineeringAllowance != null)
      return false;
    if (line != null ? !line.equals(that.line) : that.line != null) return false;
    if (location != null ? !location.equals(that.location) : that.location != null) return false;
    if (pathingAllowance != null ? !pathingAllowance.equals(that.pathingAllowance) : that.pathingAllowance != null)
      return false;
    if (performanceAllowance != null ? !performanceAllowance.equals(that.performanceAllowance) : that.performanceAllowance != null)
      return false;
    if (platform != null ? !platform.equals(that.platform) : that.platform != null) return false;
    if (publicDeparture != null ? !publicDeparture.equals(that.publicDeparture) : that.publicDeparture != null)
      return false;
    if (recordIdentity != null ? !recordIdentity.equals(that.recordIdentity) : that.recordIdentity != null)
      return false;
    if (scheduledDeparture != null ? !scheduledDeparture.equals(that.scheduledDeparture) : that.scheduledDeparture != null)
      return false;
    if (spare != null ? !spare.equals(that.spare) : that.spare != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = recordIdentity != null ? recordIdentity.hashCode() : 0;
    result = 31 * result + (location != null ? location.hashCode() : 0);
    result = 31 * result + (scheduledDeparture != null ? scheduledDeparture.hashCode() : 0);
    result = 31 * result + (publicDeparture != null ? publicDeparture.hashCode() : 0);
    result = 31 * result + (platform != null ? platform.hashCode() : 0);
    result = 31 * result + (line != null ? line.hashCode() : 0);
    result = 31 * result + (engineeringAllowance != null ? engineeringAllowance.hashCode() : 0);
    result = 31 * result + (pathingAllowance != null ? pathingAllowance.hashCode() : 0);
    result = 31 * result + (activity != null ? activity.hashCode() : 0);
    result = 31 * result + (performanceAllowance != null ? performanceAllowance.hashCode() : 0);
    result = 31 * result + (spare != null ? spare.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "OriginLocationImpl{" +
            "recordIdentity='" + recordIdentity + '\'' +
            ", location='" + location + '\'' +
            ", scheduledDeparture=" + scheduledDeparture +
            ", publicDeparture=" + publicDeparture +
            ", platform='" + platform + '\'' +
            ", line='" + line + '\'' +
            ", engineeringAllowance='" + engineeringAllowance + '\'' +
            ", pathingAllowance='" + pathingAllowance + '\'' +
            ", activity='" + activity + '\'' +
            ", performanceAllowance='" + performanceAllowance + '\'' +
            ", spare='" + spare + '\'' +
            '}';
  }
}
