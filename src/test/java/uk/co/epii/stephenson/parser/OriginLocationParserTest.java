package uk.co.epii.stephenson.parser;

import org.junit.Before;
import org.junit.Test;
import uk.co.epii.stephenson.cif.NationalRailTime;
import uk.co.epii.stephenson.cif.OriginLocation;

import static org.junit.Assert.assertEquals;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 15:05
 */
public class OriginLocationParserTest {

  private static final String EXAMPLE_ORIGIN_LOCATION = "LOPHBR    2205 22054       3 TB";

  private OriginLocationParser originLocationParser;

  @Before
  public void setUp() {
    originLocationParser = new OriginLocationParser();
  }

  @Test
  public void parsesExampleOriginLocationTest() {
    OriginLocation actual = originLocationParser.parse(EXAMPLE_ORIGIN_LOCATION);
    assertEquals("Record Identity","LO",actual.getRecordIdentity());
    assertEquals("Location","PHBR    ",actual.getLocation());
    assertEquals("Scheduled Departure",new NationalRailTimeImpl(0, 22, 5, 0),actual.getScheduledDeparture());
    assertEquals("Public Departure",new NationalRailTimeImpl(0, 22, 5, 0),actual.getPublicDeparture());
    assertEquals("Platform","4  ",actual.getPlatform());
    assertEquals("Line","   ",actual.getLine());
    assertEquals("Engineering Allowance","  ",actual.getEngineeringAllowance());
    assertEquals("Pathing Allowance","3 ",actual.getPathingAllowance());
    assertEquals("Activity","TB            ",actual.getActivity());
    assertEquals("Performance Allowance","  ",actual.getPerformanceAllowance());
    assertEquals("Spare","                                     ",actual.getSpare());
  }

}
