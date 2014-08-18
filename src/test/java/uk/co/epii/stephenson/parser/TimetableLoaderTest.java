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

  private NationalRailDateParser nationalRailDateParser;
  private TransactionTypeParser transactionTypeParser;
  private DaysParser daysParser;
  private NationalRailTimeParser nationalRailTimeParser;
  private NationalRailTimeParser publicRailTimeParser;
  private BasicScheduleParser basicScheduleParser;
  private BasicScheduleExtraDetailsParser basicScheduleExtraDetailsParser;
  private OriginLocationParser originLocationParser;
  private IntermediateLocationParser intermediateLocationParser;
  private TerminatingLocationParser terminatingLocationParser;
  private TrainParser trainParser;
  private TimetableLoader timetableLoader;

  @Before
  public void setUp() {
    nationalRailDateParser = new NationalRailDateParser();
    transactionTypeParser = new TransactionTypeParser();
    daysParser = new DaysParser();
    nationalRailTimeParser = new NationalRailTimeParser();
    publicRailTimeParser = new NationalRailTimeParser();
    basicScheduleParser = new BasicScheduleParser(nationalRailDateParser, transactionTypeParser, daysParser);
    basicScheduleExtraDetailsParser = new BasicScheduleExtraDetailsParser();
    originLocationParser = new OriginLocationParser(nationalRailTimeParser, publicRailTimeParser);
    intermediateLocationParser = new IntermediateLocationParser(nationalRailTimeParser, publicRailTimeParser);
    terminatingLocationParser = new TerminatingLocationParser(nationalRailTimeParser, publicRailTimeParser);
    trainParser = new TrainParser(basicScheduleParser, basicScheduleExtraDetailsParser, originLocationParser,
            intermediateLocationParser, terminatingLocationParser);
    timetableLoader = new TimetableLoader(trainParser);
  }

  @Test
  public void loadSampleTrains() {
    Timetable timetable = timetableLoader.load(
            TimetableLoaderTest.class.getResourceAsStream("/sampleTrains.mca"));
    assertEquals("Loaded Trains", 5, timetable.size());
  }

}
