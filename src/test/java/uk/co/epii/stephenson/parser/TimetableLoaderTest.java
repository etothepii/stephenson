package uk.co.epii.stephenson.parser;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.co.epii.stephenson.cif.Timetable;
import uk.co.epii.stephenson.cif.Train;

import java.io.File;
import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 23:46
 */
public class TimetableLoaderTest {

  private static final Logger LOG = LoggerFactory.getLogger(TimetableLoaderTest.class);

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
    Timetable timetable = timetableLoader.load("sampleTarins",
            TimetableLoaderTest.class.getResourceAsStream("/sampleTrains.mca"));
    assertEquals("Loaded Trains", 5, timetable.size());
    Set<Train> trains = timetable.getTrains("DIGBY   ");
    assertEquals("Trains to Digby", 3, trains.size());
    trains = timetable.getTrains("DIGBY   ", "TOPSHAM ");
    assertEquals("Trains to Digby and Topsham", 2, trains.size());
  }

  @Ignore
  @Test
  public void timeLoadAllTrains() {
    long start = System.currentTimeMillis();
    Timetable timetable = timetableLoader.load(new File(TimetableLoader.properties.getProperty("ALL_TRAINS")));
    long taken = System.currentTimeMillis() - start;
    start = System.currentTimeMillis();
    LOG.debug("Loaded {} trains in {}ms", timetable.size(), taken);
    Set<Train> trains = timetable.getTrains("DIGBY   ", "TOPSHAM ");
    taken = System.currentTimeMillis() - start;
    LOG.debug("Trains from Digby to Topsham: {} in {}ms", trains.size(), taken);
  }

}
