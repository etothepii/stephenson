package uk.co.epii.stephenson.parser;

import org.junit.Before;
import org.junit.Test;
import uk.co.epii.stephenson.cif.BasicSchedule;
import uk.co.epii.stephenson.cif.TransactionType;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * User: James Robinson
 * Date: 16/08/2014
 * Time: 14:03
 */
public class BasicSheduleParserTest {

  private static final String EXAMPLE_BASIC_SCHEDULE = "BSNC405071405181412070000001 PXX1F40    125470001 DMUE   090      S            P";

  private BasicSheduleParser basicSheduleParser;

  @Before
  public void setUp() {
    basicSheduleParser = new BasicSheduleParser();
  }

  @Test
  public void parsesExampleBasicSchedule() {
    BasicSchedule basicSchedule = basicSheduleParser.parse(EXAMPLE_BASIC_SCHEDULE);
    assertEquals("Record Identity", "BS", basicSchedule.getRecordIdentity());
    assertEquals("Transaction Type", TransactionType.NEW, basicSchedule.getTransactionType());
    assertEquals("Train Unique Identifier", "C40507", basicSchedule.getTrainUniqueIdentifier());
    assertEquals("Date Runs From", new Date(2014, 05, 18), basicSchedule.getDateRunsFrom());
    assertEquals("Date Runs Too", new Date(2014, 12, 07), basicSchedule.getDateRunsTo());
    boolean[] daysRun = basicSchedule.getDaysRun();
    assertFalse("Days Run - Monday", daysRun[0]);
    assertFalse("Days Run - Tuesday", daysRun[1]);
    assertFalse("Days Run - Wednesday", daysRun[2]);
    assertFalse("Days Run - Thursday", daysRun[3]);
    assertFalse("Days Run - Friday", daysRun[4]);
    assertFalse("Days Run - Saturday", daysRun[5]);
    assertTrue("Days Run - Sunday", daysRun[6]);
    assertEquals("Bank Holiday Running", " ", basicSchedule.getBankHolidayRunning());
    assertEquals("Train Status", "P", basicSchedule.getTrainStatus());
    assertEquals("Train Category", "XX", basicSchedule.getTrainCategory());
    assertEquals("Train Identity", "1F40", basicSchedule.getTrainIdentity());
    assertEquals("Headcode", "    ", basicSchedule.getHeadcode());
    assertEquals("Course Indicator", "1", basicSchedule.getCourseIndicator());
    assertEquals("Train Service Code", "25470001", basicSchedule.getTrainServiceCode());
    assertEquals("Portion Id", " ", basicSchedule.getPortionId());
    assertEquals("Power Type", "DMU", basicSchedule.getPowerType());
    assertEquals("Timing Load", "E   ", basicSchedule.getTimingLoad());
    assertEquals("Speed", "090", basicSchedule.getSpeed());
    assertEquals("Operating Characteristics", "      ", basicSchedule.getOperatingCharacteristics());
    assertEquals("Train Class", "S", basicSchedule.getTrainClass());
    assertEquals("Sleepers", " ", basicSchedule.getSleepers());
    assertEquals("Reservations", " ", basicSchedule.getReservations());
    assertEquals("Connection Indicator", " ", basicSchedule.getConnectionIndicator());
    assertEquals("Catering Code", "    ", basicSchedule.getCateringCode());
    assertEquals("Service Branding", "    ", basicSchedule.getServiceBranding());
    assertEquals("Spare", " ", basicSchedule.getSpare());
    assertEquals("STPIndicator", "P", basicSchedule.getSTPIndicator());
  }

}
