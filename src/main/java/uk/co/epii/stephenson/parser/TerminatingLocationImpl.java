package uk.co.epii.stephenson.parser;

import uk.co.epii.stephenson.cif.NationalRailTime;
import uk.co.epii.stephenson.cif.TerminatingLocation;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 16:28
 */
public class TerminatingLocationImpl implements TerminatingLocation {

  private String recordIdentity;
  private String location;
  private NationalRailTime scheduledArrival;
  private NationalRailTime publicArrival;
  private String platform;
  private String path;
  private String activity;
  private String spare;

  public TerminatingLocationImpl() {
  }

  public TerminatingLocationImpl(String recordIdentity, String location, NationalRailTime scheduledArrival,
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
}
