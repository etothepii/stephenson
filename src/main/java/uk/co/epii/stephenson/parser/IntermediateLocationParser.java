package uk.co.epii.stephenson.parser;

import uk.co.epii.stephenson.cif.IntermediateLocation;
import uk.co.epii.stephenson.cif.NationalRailTime;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 15:51
 */
public class IntermediateLocationParser extends AbstractLineParser<IntermediateLocation> {

  private final LineParser<NationalRailTime> nationalRailTimeParser;
  private final LineParser<NationalRailTime> publicRailTimeParser;

  public IntermediateLocationParser(LineParser<NationalRailTime> nationalRailTimeParser,
                                    LineParser<NationalRailTime> publicRailTimeParser) {
    this.nationalRailTimeParser = nationalRailTimeParser;
    this.publicRailTimeParser = publicRailTimeParser;
  }

  @Override
  public IntermediateLocation parse(String string) {
    setRawData(string);
    IntermediateLocationImpl intermediateLocation = new IntermediateLocationImpl();
    intermediateLocation.setRecordIdentity(getNext(2));
    intermediateLocation.setLocation(getNext(8));
    intermediateLocation.setScheduledArrival(nationalRailTimeParser.parse(getNext(5)));
    intermediateLocation.setScheduledDeparture(nationalRailTimeParser.parse(getNext(5)));
    intermediateLocation.setScheduledPass(nationalRailTimeParser.parse(getNext(5)));
    if (intermediateLocation.getScheduledArrival() != null) {
      intermediateLocation.setPublicArrival(publicRailTimeParser.parse(getNext(4)));
    }
    else {
      getNext(4);
    }
    if (intermediateLocation.getScheduledDeparture() != null) {
      intermediateLocation.setPublicDeparture(publicRailTimeParser.parse(getNext(4)));
    }
    else {
      getNext(4);
    }
    intermediateLocation.setPlatform(getNext(3));
    intermediateLocation.setLine(getNext(3));
    intermediateLocation.setPath(getNext(3));
    intermediateLocation.setActivity(getNext(12));
    intermediateLocation.setEngineeringAllowance(getNext(2));
    intermediateLocation.setPathingAllowance(getNext(2));
    intermediateLocation.setPerformanceAllowance(getNext(2));
    intermediateLocation.setSpare(getNext(20));
    return intermediateLocation;
  }
}
