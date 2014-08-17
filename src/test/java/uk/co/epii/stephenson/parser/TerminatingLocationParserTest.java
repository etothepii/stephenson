package uk.co.epii.stephenson.parser;

import org.junit.Before;
import org.junit.Test;
import uk.co.epii.stephenson.cif.NationalRailTime;
import uk.co.epii.stephenson.cif.TerminatingLocation;

import static org.junit.Assert.assertEquals;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 16:23
 */
public class TerminatingLocationParserTest {

  private static final String EXAMPLE_TERMINATING_LOCATION = "LTWSTBRYW 2356 23572     TF";

  private TerminatingLocationParser terminatingLocationParser;

  @Before
  public void setUp() {
    terminatingLocationParser = new TerminatingLocationParser(new NationalRailTimeParser(), new NationalRailTimeParser());
  }

  @Test
  public void parsesExampleTerminatingLocation() {
    TerminatingLocation actual = terminatingLocationParser.parse(EXAMPLE_TERMINATING_LOCATION);
    assertEquals("Record Identity","LT",actual.getRecordIdentity());
    assertEquals("Location","WSTBRYW ",actual.getLocation());
    assertEquals("Scheduled Arrival",new NationalRailTimeImpl(0,23,56,0),actual.getScheduledArrival());
    assertEquals("Public Arrival",new NationalRailTimeImpl(0,23,57,0),actual.getPublicArrival());
    assertEquals("Platform","2  ",actual.getPlatform());
    assertEquals("Path","   ",actual.getPath());
    assertEquals("Activity","TF          ",actual.getActivity());
    assertEquals("Spare","                                           ",actual.getSpare());
  }


}
