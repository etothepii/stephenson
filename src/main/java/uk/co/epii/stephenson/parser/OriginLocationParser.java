package uk.co.epii.stephenson.parser;

import uk.co.epii.stephenson.cif.NationalRailTime;
import uk.co.epii.stephenson.cif.OriginLocation;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 15:04
 */
public class OriginLocationParser extends AbstractLineParser<OriginLocation> {

  private final LineParser<NationalRailTime> nationalRailTimeParser;
  private final LineParser<NationalRailTime> publicRailTimeParser;

  public OriginLocationParser(LineParser<NationalRailTime> nationalRailTimeParser, LineParser<NationalRailTime> publicRailTimeParser) {
    this.nationalRailTimeParser = nationalRailTimeParser;
    this.publicRailTimeParser = publicRailTimeParser;  }

  @Override
  public OriginLocation parse(String string) {
    nationalRailTimeParser.reset();
    publicRailTimeParser.reset();
    setRawData(string);
    OriginLocationImpl originLocation = new OriginLocationImpl();
    originLocation.setRecordIdentity(getNext(2));
    originLocation.setLocation(getNext(8));
    originLocation.setScheduledDeparture(nationalRailTimeParser.parse(getNext(5)));
    originLocation.setPublicDeparture(publicRailTimeParser.parse(getNext(4)));
    originLocation.setPlatform(getNext(3));
    originLocation.setLine(getNext(3));
    originLocation.setEngineeringAllowance(getNext(2));
    originLocation.setPathingAllowance(getNext(2));
    originLocation.setActivity(getNext(12));
    originLocation.setPerformanceAllowance(getNext(2));
    originLocation.setSpare(getNext(37));
    return originLocation;
  }
}
