package uk.co.epii.stephenson.parser;

import uk.co.epii.stephenson.cif.*;

import java.util.ArrayList;
import java.util.List;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 17:09
 */
class TrainImpl implements Train {

  private BasicSchedule basicSchedule;
  private BasicScheduleExtraDetails basicScheduleExtraDetails;
  private OriginLocation originLocation;
  private List<IntermediateLocation> intermediateLocations;
  private List<IntermediateLocation> intermediateStops;
  private TerminatingLocation terminatingLocation;

  TrainImpl() {
    intermediateLocations = new ArrayList<IntermediateLocation>();
    intermediateStops = new ArrayList<IntermediateLocation>();
  }

  TrainImpl(BasicSchedule basicSchedule, BasicScheduleExtraDetails basicScheduleExtraDetails,
                   OriginLocation originLocation, List<IntermediateLocation> intermediateLocations,
                   List<IntermediateLocation> intermediateStops, TerminatingLocation terminatingLocation) {
    this.basicSchedule = basicSchedule;
    this.basicScheduleExtraDetails = basicScheduleExtraDetails;
    this.originLocation = originLocation;
    this.intermediateLocations = intermediateLocations;
    this.intermediateStops = intermediateStops;
    this.terminatingLocation = terminatingLocation;
  }

  public BasicSchedule getBasicSchedule() {
    return basicSchedule;
  }

  public void setBasicSchedule(BasicSchedule basicSchedule) {
    this.basicSchedule = basicSchedule;
  }

  public BasicScheduleExtraDetails getBasicScheduleExtraDetails() {
    return basicScheduleExtraDetails;
  }

  public void setBasicScheduleExtraDetails(BasicScheduleExtraDetails basicScheduleExtraDetails) {
    this.basicScheduleExtraDetails = basicScheduleExtraDetails;
  }

  public OriginLocation getOriginLocation() {
    return originLocation;
  }

  public void setOriginLocation(OriginLocation originLocation) {
    this.originLocation = originLocation;
  }

  public List<IntermediateLocation> getIntermediateLocations() {
    return intermediateLocations;
  }

  public void setIntermediateLocations(List<IntermediateLocation> intermediateLocations) {
    this.intermediateLocations = intermediateLocations;
  }

  public List<IntermediateLocation> getIntermediateStops() {
    return intermediateStops;
  }

  public void setIntermediateStops(List<IntermediateLocation> intermediateStops) {
    this.intermediateStops = intermediateStops;
  }

  public TerminatingLocation getTerminatingLocation() {
    return terminatingLocation;
  }

  public void setTerminatingLocation(TerminatingLocation terminatingLocation) {
    this.terminatingLocation = terminatingLocation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    TrainImpl train = (TrainImpl) o;

    if (basicSchedule != null ? !basicSchedule.equals(train.basicSchedule) : train.basicSchedule != null) return false;
    if (basicScheduleExtraDetails != null ? !basicScheduleExtraDetails.equals(train.basicScheduleExtraDetails) : train.basicScheduleExtraDetails != null)
      return false;
    if (intermediateLocations != null ? !intermediateLocations.equals(train.intermediateLocations) : train.intermediateLocations != null)
      return false;
    if (intermediateStops != null ? !intermediateStops.equals(train.intermediateStops) : train.intermediateStops != null)
      return false;
    if (originLocation != null ? !originLocation.equals(train.originLocation) : train.originLocation != null)
      return false;
    if (terminatingLocation != null ? !terminatingLocation.equals(train.terminatingLocation) : train.terminatingLocation != null)
      return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = basicSchedule != null ? basicSchedule.hashCode() : 0;
    result = 31 * result + (basicScheduleExtraDetails != null ? basicScheduleExtraDetails.hashCode() : 0);
    result = 31 * result + (originLocation != null ? originLocation.hashCode() : 0);
    result = 31 * result + (intermediateLocations != null ? intermediateLocations.hashCode() : 0);
    result = 31 * result + (intermediateStops != null ? intermediateStops.hashCode() : 0);
    result = 31 * result + (terminatingLocation != null ? terminatingLocation.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "TrainImpl{" +
            "\nbasicSchedule=" + basicSchedule +
            ", \nbasicScheduleExtraDetails=" + basicScheduleExtraDetails +
            ", \noriginLocation=" + originLocation +
            ", \nintermediateLocations=" + intermediateLocations +
            ", \nintermediateStops=" + intermediateStops +
            ", \nterminatingLocation=" + terminatingLocation +
            '}';
  }
}
