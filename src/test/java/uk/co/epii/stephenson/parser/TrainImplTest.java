package uk.co.epii.stephenson.parser;

import org.junit.Test;
import uk.co.epii.stephenson.cif.IntermediateLocation;
import uk.co.epii.stephenson.cif.TransactionType;

import java.util.Arrays;
import java.util.Date;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 18:44
 */
public class TrainImplTest {

  private static final TrainImpl EXAMPLE_TRAIN = new TrainImpl(new BasicScheduleImpl("BS", TransactionType.NEW, "C41473", new Date(2014,5,18),
          new Date(2014,12,07), new boolean[] {false, false, false, false, false, false, true}, " ", "P", "OO",
          "2E62", "    ", "1", "25482001", " ", "DMU", "A   ", "075", "      ", "S", " ", " ", " ", "    ",
          "    ", " ", "P"),
          new BasicScheduleExtraDetailsImpl("BX", "    ", "     ", "GW", "Y", "GW551800", " ",
                  "                                                         "),
          new OriginLocationImpl("LO", "EXMOUTH ", new NationalRailTimeImpl(0,23,59,0),
                  new NationalRailTimeImpl(0,23,59,0), "   ", "   ", "  ", "  ", "TB          ", "  ",
                  "                                     "),
          Arrays.asList((IntermediateLocation) new IntermediateLocationImpl("LI", "LYMPSTN ", new NationalRailTimeImpl(1, 0, 2, 30),
                  new NationalRailTimeImpl(1, 0, 3, 0), null, new NationalRailTimeImpl(1, 0, 3, 0),
                  new NationalRailTimeImpl(1, 0, 3, 0), "   ", "   ", "   ", "T           ", "  ", "  ", "  ",
                  "                    "),
                  new IntermediateLocationImpl("LI", "EXMOTHJ ", null, null, new NationalRailTimeImpl(1, 0, 20, 0),
                          null, null, "   ", "   ", "   ", "            ", "  ", "  ", "  ",
                          "                    ")),
          Arrays.asList((IntermediateLocation)new IntermediateLocationImpl("LI", "LYMPSTN ", new NationalRailTimeImpl(1,0,2,30),
                  new NationalRailTimeImpl(1,0,3,0), null, new NationalRailTimeImpl(1,0,3,0),
                  new NationalRailTimeImpl(1,0,3,0), "   ", "   ", "   ", "T           ", "  ", "  ", "  ",
                  "                    ")),
          new TerminatingLocationImpl("LT","EXETRSD ", new NationalRailTimeImpl(1,0,28,0),
                  new NationalRailTimeImpl(1,0,28,0),"3  ", "   ", "TF          ",
                  "                                           "));

  @Test
  public void confirmsStopsAtStartingLocationTest() {
    assertTrue("Starting", EXAMPLE_TRAIN.stops("EXMOUTH "));
  }

  @Test
  public void confirmsStopsAtIntermediateLocationTest() {
    assertTrue("Intermediate", EXAMPLE_TRAIN.stops("LYMPSTN "));
  }

  @Test
  public void confirmsStopsAtTerminatingLocationTest() {
    assertTrue("Terminating", EXAMPLE_TRAIN.stops("EXETRSD "));
  }

  @Test
  public void doesNotConfirmStopsAtPassThroughLocationTest() {
    assertFalse("Terminating", EXAMPLE_TRAIN.stops("EXMOTHJ "));
  }

  @Test
  public void doesNotConfirmStopsAtRandomLocationTest() {
    assertFalse("Terminating", EXAMPLE_TRAIN.stops("ABCDEFG "));
  }

  @Test
  public void confirmsStopsAtStartingAndTerminatingLocationTest() {
    assertTrue("Starting", EXAMPLE_TRAIN.stops("EXMOUTH ", "EXETRSD "));
  }

  @Test
  public void confirmsStopsAtStartingAndIntermediateLocationTest() {
    assertTrue("Starting", EXAMPLE_TRAIN.stops("EXMOUTH ", "LYMPSTN "));
  }

  @Test
  public void confirmsStopsAtIntermediateAndTerminatingLocationTest() {
    assertTrue("Starting", EXAMPLE_TRAIN.stops("LYMPSTN ", "EXETRSD "));
  }

  @Test
  public void doesNotConfirmStopsAtTerminatingAndStartingLocationTest() {
    assertFalse("Terminating", EXAMPLE_TRAIN.stops("EXETERSD ", "EXMOUTH "));
  }

}
