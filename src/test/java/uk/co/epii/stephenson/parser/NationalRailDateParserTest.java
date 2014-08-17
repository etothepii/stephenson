package uk.co.epii.stephenson.parser;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 12:21
 */
public class NationalRailDateParserTest {

  private NationalRailDateParser nationalRailDateParser;

  @Before
  public void setUp() {
    nationalRailDateParser = new NationalRailDateParser();
  }

  @Test
  public void putsTwentiethCenturyDatesInTheTwentiethCenturyTest() {
    Date actual = nationalRailDateParser.parse("600101");
    Date expected = new Date(1960, 01, 01);
    assertEquals("Date", expected, actual);
  }

  @Test
  public void putsTwentiethFirstCenturyDatesInTheTwentiethFirstCenturyTest() {
    Date actual = nationalRailDateParser.parse("591231");
    Date expected = new Date(2059, 12, 31);
    assertEquals("Date", expected, actual);
  }

  @Test
  public void returnsNullForSpecialCaseInfinityDate() {
    Date actual = nationalRailDateParser.parse("999999");
    Date expected = null;
    assertEquals("Date", expected, actual);
  }

}
