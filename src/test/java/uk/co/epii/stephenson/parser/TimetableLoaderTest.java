package uk.co.epii.stephenson.parser;

import org.junit.Before;
import org.junit.Test;
import uk.co.epii.stephenson.cif.Timetable;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 23:46
 */
public class TimetableLoaderTest {

  private TimetableLoader timetableLoader;

  @Before
  public void setUp() {
    timetableLoader = new TimetableLoader();
  }

  @Test
  public void loadSampleTrains() {
    Timetable timetable = timetableLoader.load(
            TimetableLoaderTest.class.getResourceAsStream("/resources/sampleTrains.mcs"));
    assertEquals("Loaded Trains", 5, timetable.getTrains().size());
  }

}
