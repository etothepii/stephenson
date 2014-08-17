package uk.co.epii.stephenson.parser;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 12:53
 */
public class DaysParserTest {

  private DaysParser daysParser;

  @Before
  public void setUp() {
    daysParser = new DaysParser();
  }

  @Test
  public void canParseWeekdaysOn() {
    boolean[] actual = daysParser.parse("1111100");
    boolean[] expected = new boolean[] {true, true, true, true, true, false, false};
    for (int i = 0; i < 7; i++) {
      assertTrue(i + "", actual == expected);
    }
  }


}
