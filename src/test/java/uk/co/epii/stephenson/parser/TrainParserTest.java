package uk.co.epii.stephenson.parser;

import org.junit.Before;
import org.junit.Test;
import uk.co.epii.stephenson.cif.*;

import java.util.Arrays;
import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 16:56
 */
public class TrainParserTest {

  private static final TrainImpl[] EXAMPLE_TRAIN = {
          new TrainImpl(new BasicScheduleImpl("BS", TransactionType.NEW, "C41473", new Date(2014,5,18),
                  new Date(2014,12,07), new boolean[] {false, false, false, false, false, false, true}, " ", "P", "OO",
                  "2E62", "    ", "1", "25482001", " ", "DMU", "A   ", "075", "      ", "S", " ", " ", " ", "    ",
                  "    ", " ", "P"),
                  new BasicScheduleExtraDetailsImpl("BX", "    ", "     ", "GW", "Y", "GW551800", " ",
                          "                                                         "),
                  new OriginLocationImpl("LO", "EXMOUTH ", new NationalRailTimeImpl(0,23,59,0),
                          new NationalRailTimeImpl(0,23,59,0), "   ", "   ", "  ", "  ", "TB          ", "  ",
                          "                                     "),
                  Arrays.asList((IntermediateLocation)new IntermediateLocationImpl("LI", "LYMPSTN ", new NationalRailTimeImpl(1,0,2,30),
                          new NationalRailTimeImpl(1,0,3,0), null, new NationalRailTimeImpl(1,0,3,0),
                          new NationalRailTimeImpl(1,0,3,0), "   ", "   ", "  ", " T        ", "  ", "  ", "  ",
                          "                    "),
                          new IntermediateLocationImpl("LI", "EXMOTHJ ", null, null, new NationalRailTimeImpl(1,0,20,0),
                                  null, null, "   ", "   ", "  ", "          ", "  ", "  ", "  ",
                                  "                    ")),
                  Arrays.asList((IntermediateLocation)new IntermediateLocationImpl("LI", "LYMPSTN ", new NationalRailTimeImpl(1,0,2,30),
                          new NationalRailTimeImpl(1,0,3,0), null, new NationalRailTimeImpl(1,0,3,0),
                          new NationalRailTimeImpl(1,0,3,0), "   ", "   ", "  ", " T        ", "  ", "  ", "  ",
                          "                    ")),
                  new TerminatingLocationImpl("LT","EXETRSD ", new NationalRailTimeImpl(1,0,28,0),
                          new NationalRailTimeImpl(1,0,28,0),"3  ", "   ", "TF          ",
                          "                                                     ")),
          new TrainImpl(new BasicScheduleImpl("BS", TransactionType.NEW, "C41479", new Date(2014,5,18),
                  new Date(2014,12,07), new boolean[] {false, false, false, false, false, false, true}, " ", "P", "OO",
                  "2E68", "8723", "1", "25474001", " ", "DMU", "S   ", "075", "      ", "S", " ", "S", " ", "    ",
                  "    ", " ", "P"),
                  new BasicScheduleExtraDetailsImpl("BX", "    ", "     ", "GW", "Y", "GW872300", " ",
                          "                                                         "),
                  new OriginLocationImpl("LO", "PENZNCE ", new NationalRailTimeImpl(0,13,42,0),
                          new NationalRailTimeImpl(0,13,41,0), "3  ", "   ", "  ", "  ", "TB          ", "  ",
                          "                                     "),
                  Arrays.asList((IntermediateLocation)new IntermediateLocationImpl("LI", "LNGROCK ", null, null,
                          new NationalRailTimeImpl(0,13,45,30), null, null, "   ", "   ", "  ", "          ", "  ",
                          "  ", "  ", "                    "),
                          new IntermediateLocationImpl("LI", "STERTH  ", new NationalRailTimeImpl(0,13,50,0),
                                  new NationalRailTimeImpl(0,13,51,30), null, new NationalRailTimeImpl(0,13,50,0),
                                  new NationalRailTimeImpl(0,13,51,0), "   ", "   ", "  ", " T        ", "  ", "  ",
                                  "  ", "                    ")),
                  Arrays.asList((IntermediateLocation)new IntermediateLocationImpl("LI", "STERTH  ", new NationalRailTimeImpl(0,13,50,0),
                          new NationalRailTimeImpl(0,13,51,30), null, new NationalRailTimeImpl(0,13,50,0),
                          new NationalRailTimeImpl(0,13,51,00), "   ", "   ", "  ", " T        ", "  ", "  ",
                          "  ", "                    ")),
                  new TerminatingLocationImpl("LT","EXETRSD ", new NationalRailTimeImpl(0,16,55,0),
                          new NationalRailTimeImpl(0,16,56,0),"   ", "   ", "TF          ",
                          "                                                     "))
  };

  private static final String[] EXAMPLE_TRAINS = {
          "BSNC414731405181412070000001 POO2E62    125482001 DMUA   075      S            P       ",
          "BX         GWYGW551800        ",
          "LOEXMOUTH 2359 2359          TB        ",
          "LILYMPSTN 0002H0003      00030003         T        ",
          "LIEXMOTHJ           0020 00000000        ",
          "LTEXETRSD 0028 00283     TF        ",
          "BSNC414791405181412070000001 POO2E688723125474001 DMUS   075      S S          P       ",
          "BX         GWYGW872300        ",
          "LOPENZNCE 1342 13413         TB        ",
          "LILNGROCK           1345H00000000        ",
          "LISTERTH  1350 1351H     135013512        T        ",
          "LTEXETRSD 1655 16556     TF        "
  };

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
  private MockParseListener<Train> mockParseListener;

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
    mockParseListener = new MockParseListener<Train>();
    trainParser.addListener(mockParseListener);
  }

  @Test
  public void parsesTwoTrainsCorrectlyTest() {
    trainParser.parse(Arrays.asList(EXAMPLE_TRAINS).iterator());
    assertEquals("Trains parsed", 2, mockParseListener.parsed.size());
    assertEquals("Train[0]", EXAMPLE_TRAIN[0], mockParseListener.parsed.get(0));
    assertEquals("Train[1]", EXAMPLE_TRAIN[1], mockParseListener.parsed.get(1));
  }

}
