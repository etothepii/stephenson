package uk.co.epii.stephenson.parser;

import uk.co.epii.stephenson.cif.*;

import java.util.ArrayList;
import java.util.HashMap;
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
  private final List<IntermediateLocation> intermediateLocations;
  private final List<IntermediateLocation> intermediateStops;
  private final HashMap<String, Integer> orderedStations;
  private TerminatingLocation terminatingLocation;

  TrainImpl() {
    intermediateLocations = new ArrayList<IntermediateLocation>();
    intermediateStops = new ArrayList<IntermediateLocation>();
    orderedStations = new HashMap<String, Integer>();
  }

  TrainImpl(BasicSchedule basicSchedule, BasicScheduleExtraDetails basicScheduleExtraDetails,
                   OriginLocation originLocation, List<IntermediateLocation> intermediateLocations,
                   List<IntermediateLocation> intermediateStops, TerminatingLocation terminatingLocation) {
    this();
    this.basicSchedule = basicSchedule;
    this.basicScheduleExtraDetails = basicScheduleExtraDetails;
    setOriginLocation(originLocation);
    for (IntermediateLocation location : intermediateLocations) {
      addIntermediateLocation(location);
    }
    for (IntermediateLocation stop : intermediateStops) {
      addIntermediateStop(stop);
    }
    setTerminatingLocation(terminatingLocation);
  }

  void addIntermediateStop(IntermediateLocation stop) {
    orderedStations.put(stop.getLocation(), intermediateStops.size());
    intermediateStops.add(stop);
  }

  public void addIntermediateLocation(IntermediateLocation location) {
    intermediateLocations.add(location);
  }

  @Override
  public String getUniqueIdentifier() {
    return basicSchedule.getTrainUniqueIdentifier();
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
    orderedStations.put(originLocation.getLocation(), -1);
  }

  public Iterable<IntermediateLocation> getIntermediateLocations() {
    return intermediateLocations;
  }

  public Iterable<IntermediateLocation> getIntermediateStops() {
    return intermediateStops;
  }

  public TerminatingLocation getTerminatingLocation() {
    return terminatingLocation;
  }

  @Override
  public boolean stops(String... stations) {
    Integer previous = null;
    for (String station : stations) {
      Integer stopIndex = orderedStations.get(station);
      if (stopIndex == null) {
        return false;
      }
      if (previous == null || stopIndex > previous) {
        previous = stopIndex;
      }
      else {
        return false;
      }
    }
    return true;
  }

  public void setTerminatingLocation(TerminatingLocation terminatingLocation) {
    this.terminatingLocation = terminatingLocation;
    orderedStations.put(terminatingLocation.getLocation(), Integer.MAX_VALUE);
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
