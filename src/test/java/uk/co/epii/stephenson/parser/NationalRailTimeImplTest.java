package uk.co.epii.stephenson.parser;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 14:49
 */
public class NationalRailTimeImplTest {

  @Test
  public void comparesDaysCorrectlyTest1() {
    assertTrue("AdditionalDays", new NationalRailTimeImpl(1,0,0,0).compareTo(new NationalRailTimeImpl(0,0,0,0)) > 0);
  }

  @Test
  public void comparesDaysCorrectlyTest2() {
    assertTrue("AdditionalDays", new NationalRailTimeImpl(0,0,0,0).compareTo(new NationalRailTimeImpl(1,0,0,0)) < 0);
  }

  @Test
  public void comparesHoursCorrectlyTest1() {
    assertTrue("Hours", new NationalRailTimeImpl(0,1,0,0).compareTo(new NationalRailTimeImpl(0,0,0,0)) > 0);
  }

  @Test
  public void comparesHoursCorrectlyTest2() {
    assertTrue("Hours", new NationalRailTimeImpl(0,0,0,0).compareTo(new NationalRailTimeImpl(0,1,0,0)) < 0);
  }

  @Test
  public void comparesMinutesCorrectlyTest1() {
    assertTrue("Minutes", new NationalRailTimeImpl(0,0,1,0).compareTo(new NationalRailTimeImpl(0,0,0,0)) > 0);
  }

  @Test
  public void comparesMinutesCorrectlyTest2() {
    assertTrue("Minutes", new NationalRailTimeImpl(0,0,0,0).compareTo(new NationalRailTimeImpl(0,0,1,0)) < 0);
  }

  @Test
  public void comparesSecondsCorrectlyTest1() {
    assertTrue("Seconds", new NationalRailTimeImpl(0,0,0,1).compareTo(new NationalRailTimeImpl(0,0,0,0)) > 0);
  }

  @Test
  public void comparesSecondsCorrectlyTest2() {
    assertTrue("Seconds", new NationalRailTimeImpl(0,0,0,0).compareTo(new NationalRailTimeImpl(0,0,0,1)) < 0);
  }

  @Test
  public void comparesEqualTimeCorrectlyTest() {
    assertTrue("Equal", new NationalRailTimeImpl(0,0,0,0).compareTo(new NationalRailTimeImpl(0,0,0,0)) == 0);
  }

}
