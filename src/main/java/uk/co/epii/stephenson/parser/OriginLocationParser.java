package uk.co.epii.stephenson.parser;

import uk.co.epii.stephenson.cif.NationalRailTime;
import uk.co.epii.stephenson.cif.OriginLocation;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 15:04
 */
public class OriginLocationParser extends AbstractParser<OriginLocation> {

  private final Parser<NationalRailTime> nationalRailTimeParser;

  public OriginLocationParser(Parser<NationalRailTime> nationalRailTimeParser) {
    this.nationalRailTimeParser = nationalRailTimeParser;
  }

  @Override
  public OriginLocation parse(String string) {
    setRawData(string);
    nationalRailTimeParser.reset();
    OriginLocationImpl originLocation = new OriginLocationImpl();
    originLocation.setRecordIdentity(getNext(2));
    originLocation.setLocation(getNext(8));
    originLocation.setScheduledDeparture(nationalRailTimeParser.parse(getNext(5)));
    originLocation.setPublicDeparture(nationalRailTimeParser.parse(getNext(4)));
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
