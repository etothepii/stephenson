package uk.co.epii.stephenson.parser;

import uk.co.epii.stephenson.cif.NationalRailTime;
import uk.co.epii.stephenson.cif.TerminatingLocation;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 16:22
 */
public class TerminatingLocationParser extends AbstractParser<TerminatingLocation> {

  private final Parser<NationalRailTime>  nationalRailTimeParser;
  private final Parser<NationalRailTime> publicRailTimeParser;

  public TerminatingLocationParser(Parser<NationalRailTime> nationalRailTimeParser,
                                    Parser<NationalRailTime> publicRailTimeParser) {
    this.nationalRailTimeParser = nationalRailTimeParser;
    this.publicRailTimeParser = publicRailTimeParser;
  }
  @Override
  public TerminatingLocation parse(String string) {
    setRawData(string);
    TerminatingLocationImpl terminatingLocation = new TerminatingLocationImpl();
    terminatingLocation.setRecordIdentity(getNext(2));
    terminatingLocation.setLocation(getNext(8));
    terminatingLocation.setScheduledArrival(nationalRailTimeParser.parse(getNext(5)));
    terminatingLocation.setPublicArrival(publicRailTimeParser.parse(getNext(4)));
    terminatingLocation.setPlatform(getNext(3));
    terminatingLocation.setPath(getNext(3));
    terminatingLocation.setActivity(getNext(12));
    terminatingLocation.setSpare(getNext(43));
    return terminatingLocation;
  }
}
