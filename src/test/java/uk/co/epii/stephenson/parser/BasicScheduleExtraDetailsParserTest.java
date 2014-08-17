package uk.co.epii.stephenson.parser;

import org.junit.Before;
import org.junit.Test;
import uk.co.epii.stephenson.cif.BasicSchedule;
import uk.co.epii.stephenson.cif.BasicScheduleExtraDetails;
import uk.co.epii.stephenson.cif.TransactionType;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * User: James Robinson
 * Date: 16/08/2014
 * Time: 14:03
 */
public class BasicScheduleExtraDetailsParserTest {

  private static final String EXAMPLE_BASIC_SCHEDULE_EXTRA_DETAILS = "BX         GWYGW545400";


  private BasicScheduleExtraDetailsParser basicScheduleExtraDetailsParser;

  @Before
  public void setUp() {
    basicScheduleExtraDetailsParser = new BasicScheduleExtraDetailsParser();
  }

  @Test
  public void parsesExampleBasicSchedule() {
    BasicScheduleExtraDetails actual = basicScheduleExtraDetailsParser.parse(EXAMPLE_BASIC_SCHEDULE_EXTRA_DETAILS);
    assertEquals("Record Identity", "BX", actual.getRecordIdentity());
    assertEquals("Traction Class", "    ", actual.getTractionClass());
    assertEquals("UIC Code", "     ", actual.getUICCode());
    assertEquals("ATOC Code", "GW", actual.getATOCCode());
    assertEquals("Applicable Time Code", "Y", actual.getApplicableTimetableCode());
    assertEquals("RSID", "GW545400", actual.getRSID());
    assertEquals("Data Source", null, actual.getDataSource());
    assertEquals("Spare", null, actual.getSpare());
  }

}
