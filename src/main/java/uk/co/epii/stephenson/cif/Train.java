package uk.co.epii.stephenson.cif;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 16:39
 */
public interface Train {

  public BasicSchedule getBasicSchedule();
  public BasicScheduleExtraDetails getBasicScheduleExtraDetails();
  public OriginLocation getOriginLocation();
  public Iterable<IntermediateLocation> getIntermediateLocations();
  public Iterable<IntermediateLocation> getIntermediateStops();
  public TerminatingLocation getTerminatingLocation();

}
