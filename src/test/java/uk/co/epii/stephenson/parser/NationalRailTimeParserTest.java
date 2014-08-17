package uk.co.epii.stephenson.parser;

import org.junit.Before;
import org.junit.Test;
import uk.co.epii.stephenson.cif.NationalRailTime;

import static org.junit.Assert.assertEquals;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 14:25
 */
public class NationalRailTimeParserTest {

  private NationalRailTimeParser nationalRailTimeParser;

  @Before
  public void setUp() {
    nationalRailTimeParser = new NationalRailTimeParser();
  }

  @Test
  public void parsesFirstTimeTest() {
    NationalRailTime actual = nationalRailTimeParser.parse("0000 ");
    assertEquals("Days", 0, actual.getAdditionalDays());
    assertEquals("Hours", 0, actual.getHours());
    assertEquals("Minutes", 0, actual.getMinutes());
    assertEquals("Seconds", 0, actual.getSeconds());
  }

  @Test
  public void parsesLastTimeTest() {
    NationalRailTime actual = nationalRailTimeParser.parse("2359H");
    assertEquals("Days", 0, actual.getAdditionalDays());
    assertEquals("Hours", 23, actual.getHours());
    assertEquals("Minutes", 59, actual.getMinutes());
    assertEquals("Seconds", 30, actual.getSeconds());
  }

  @Test
  public void correctlyTicksAfterMidnightTest() {
    nationalRailTimeParser.parse("2359H");
    NationalRailTime actual = nationalRailTimeParser.parse("0000 ");
    assertEquals("Days", 1, actual.getAdditionalDays());
    assertEquals("Hours", 0, actual.getHours());
    assertEquals("Minutes", 0, actual.getMinutes());
    assertEquals("Seconds", 0, actual.getSeconds());
  }

  @Test
  public void doesntTickAfterMidnightIfResetTest() {
    nationalRailTimeParser.parse("2359H");
    nationalRailTimeParser.reset();
    NationalRailTime actual = nationalRailTimeParser.parse("0000 ");
    assertEquals("Days", 0, actual.getAdditionalDays());
    assertEquals("Hours", 0, actual.getHours());
    assertEquals("Minutes", 0, actual.getMinutes());
    assertEquals("Seconds", 0, actual.getSeconds());
  }

}
