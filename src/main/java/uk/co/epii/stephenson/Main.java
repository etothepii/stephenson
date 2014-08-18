package uk.co.epii.stephenson;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.co.epii.stephenson.cif.Timetable;
import uk.co.epii.stephenson.parser.*;

public class Main {

  private static final Logger LOG = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    System.out.println("Running George Canning");
    NationalRailDateParser nationalRailDateParser = new NationalRailDateParser();
    TransactionTypeParser transactionTypeParser = new TransactionTypeParser();
    DaysParser daysParser = new DaysParser();
    NationalRailTimeParser nationalRailTimeParser = new NationalRailTimeParser();
    NationalRailTimeParser publicRailTimeParser = new NationalRailTimeParser();
    BasicScheduleParser basicScheduleParser = new BasicScheduleParser(nationalRailDateParser, transactionTypeParser, daysParser);
    BasicScheduleExtraDetailsParser basicScheduleExtraDetailsParser = new BasicScheduleExtraDetailsParser();
    OriginLocationParser originLocationParser = new OriginLocationParser(nationalRailTimeParser, publicRailTimeParser);
    IntermediateLocationParser intermediateLocationParser = new IntermediateLocationParser(nationalRailTimeParser, publicRailTimeParser);
    TerminatingLocationParser terminatingLocationParser = new TerminatingLocationParser(nationalRailTimeParser, publicRailTimeParser);
    TrainParser trainParser = new TrainParser(basicScheduleParser, basicScheduleExtraDetailsParser, originLocationParser,
            intermediateLocationParser, terminatingLocationParser);
    TimetableLoader timetableLoader = new TimetableLoader(trainParser);
    Timetable timetable = timetableLoader.load(Main.class.getResourceAsStream("/nationalRailData/timetableData/ttisf533.mca"));
    LOG.info("Number of Trains loaded: {}", timetable.size());
  }

}
