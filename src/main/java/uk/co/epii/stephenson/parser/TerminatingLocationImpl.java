package uk.co.epii.stephenson.parser;

import uk.co.epii.stephenson.cif.NationalRailTime;
import uk.co.epii.stephenson.cif.TerminatingLocation;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 16:28
 */
class TerminatingLocationImpl implements TerminatingLocation {

  private String recordIdentity;
  private String location;
  private NationalRailTime scheduledArrival;
  private NationalRailTime publicArrival;
  private String platform;
  private String path;
  private String activity;
  private String spare;

  TerminatingLocationImpl() {
  }

  TerminatingLocationImpl(String recordIdentity, String location, NationalRailTime scheduledArrival,
                                 NationalRailTime publicArrival, String platform, String path, String activity,
                                 String spare) {
    this.recordIdentity = recordIdentity;
    this.location = location;
    this.scheduledArrival = scheduledArrival;
    this.publicArrival = publicArrival;
    this.platform = platform;
    this.path = path;
    this.activity = activity;
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

  public NationalRailTime getPublicArrival() {
    return publicArrival;
  }

  public void setPublicArrival(NationalRailTime publicArrival) {
    this.publicArrival = publicArrival;
  }

  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
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

    TerminatingLocationImpl that = (TerminatingLocationImpl) o;

    if (activity != null ? !activity.equals(that.activity) : that.activity != null) return false;
    if (location != null ? !location.equals(that.location) : that.location != null) return false;
    if (path != null ? !path.equals(that.path) : that.path != null) return false;
    if (platform != null ? !platform.equals(that.platform) : that.platform != null) return false;
    if (publicArrival != null ? !publicArrival.equals(that.publicArrival) : that.publicArrival != null) return false;
    if (recordIdentity != null ? !recordIdentity.equals(that.recordIdentity) : that.recordIdentity != null)
      return false;
    if (scheduledArrival != null ? !scheduledArrival.equals(that.scheduledArrival) : that.scheduledArrival != null)
      return false;
    if (spare != null ? !spare.equals(that.spare) : that.spare != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = recordIdentity != null ? recordIdentity.hashCode() : 0;
    result = 31 * result + (location != null ? location.hashCode() : 0);
    result = 31 * result + (scheduledArrival != null ? scheduledArrival.hashCode() : 0);
    result = 31 * result + (publicArrival != null ? publicArrival.hashCode() : 0);
    result = 31 * result + (platform != null ? platform.hashCode() : 0);
    result = 31 * result + (path != null ? path.hashCode() : 0);
    result = 31 * result + (activity != null ? activity.hashCode() : 0);
    result = 31 * result + (spare != null ? spare.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "TerminatingLocationImpl{" +
            "recordIdentity='" + recordIdentity + '\'' +
            ", location='" + location + '\'' +
            ", scheduledArrival=" + scheduledArrival +
            ", publicArrival=" + publicArrival +
            ", platform='" + platform + '\'' +
            ", path='" + path + '\'' +
            ", activity='" + activity + '\'' +
            ", spare='" + spare + '\'' +
            '}';
  }
}
