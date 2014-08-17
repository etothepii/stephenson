package uk.co.epii.stephenson.parser;

import org.junit.Before;
import org.junit.Test;
import uk.co.epii.stephenson.cif.IntermediateLocation;
import uk.co.epii.stephenson.cif.NationalRailTime;
import uk.co.epii.stephenson.cif.OriginLocation;

import static org.junit.Assert.assertEquals;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 15:05
 */
public class IntermediateLocationParserTest {

  private static final String EXAMPLE_INTERMEDIATE_LOCATION = "LIPSEA    2211 2212      221122121  UML   T";
  private static final String EXAMPLE_THROUGH_INTERMEDIATE_LOCATION = "LIPCRKJN            2220 00000000";

  private IntermediateLocationParser intermediateLocationParser;

  @Before
  public void setUp() {
    intermediateLocationParser = new IntermediateLocationParser(new NationalRailTimeParser(), new NationalRailTimeParser());
  }

  @Test
  public void parsesExampleIntermediateLocationTest() {
    IntermediateLocation actual = intermediateLocationParser.parse(EXAMPLE_INTERMEDIATE_LOCATION);
    assertEquals("Record Identity","LI",actual.getRecordIdentity());
    assertEquals("Location","PSEA    ",actual.getLocation());
    assertEquals("Scheduled Arrival",new NationalRailTimeImpl(0,22,11,0),actual.getScheduledArrival());
    assertEquals("Scheduled Departure",new NationalRailTimeImpl(0,22,12,0),actual.getScheduledDeparture());
    assertEquals("Scheduled Pass",null,actual.getScheduledPass());
    assertEquals("Public Arrival",new NationalRailTimeImpl(0,22,11,0),actual.getPublicArrival());
    assertEquals("Public Departure",new NationalRailTimeImpl(0,22,12,0),actual.getPublicDeparture());
    assertEquals("Platform","1  ",actual.getPlatform());
    assertEquals("Line","UML",actual.getLine());
    assertEquals("Path","   ",actual.getPath());
    assertEquals("Activity","T           ",actual.getActivity());
    assertEquals("Engineering Allowance","  ",actual.getEngineeringAllowance());
    assertEquals("Pathing Allowance","  ",actual.getPathingAllowance());
    assertEquals("Performance Allowance","  ",actual.getPerformanceAllowance());
    assertEquals("Spare","                    ",actual.getSpare());
  }

  @Test
  public void parsesExampleIntermediateThroughLocationTest() {
    IntermediateLocation actual = intermediateLocationParser.parse(EXAMPLE_THROUGH_INTERMEDIATE_LOCATION);
    assertEquals("Record Identity","LI",actual.getRecordIdentity());
    assertEquals("Location","PCRKJN  ",actual.getLocation());
    assertEquals("Scheduled Arrival",null,actual.getScheduledArrival());
    assertEquals("Scheduled Departure",null,actual.getScheduledDeparture());
    assertEquals("Scheduled Pass",new NationalRailTimeImpl(0,22,20,0),actual.getScheduledPass());
    assertEquals("Public Arrival",null,actual.getPublicArrival());
    assertEquals("Public Departure",null,actual.getPublicDeparture());
    assertEquals("Platform","   ",actual.getPlatform());
    assertEquals("Line","   ",actual.getLine());
    assertEquals("Path","   ",actual.getPath());
    assertEquals("Activity","            ",actual.getActivity());
    assertEquals("Engineering Allowance","  ",actual.getEngineeringAllowance());
    assertEquals("Pathing Allowance","  ",actual.getPathingAllowance());
    assertEquals("Performance Allowance","  ",actual.getPerformanceAllowance());
    assertEquals("Spare","                    ",actual.getSpare());
  }

}
