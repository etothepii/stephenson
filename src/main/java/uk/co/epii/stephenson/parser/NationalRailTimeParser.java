package uk.co.epii.stephenson.parser;

import uk.co.epii.stephenson.cif.NationalRailTime;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 14:23
 */

public class NationalRailTimeParser extends AbstractParser<NationalRailTime> {

  private NationalRailTime previous = null;

  @Override
  public NationalRailTime parse(String string) {
    setRawData(string);
    NationalRailTimeImpl nationalRailTime = new NationalRailTimeImpl();
    nationalRailTime.setHours(Integer.parseInt(getNext(2)));
    nationalRailTime.setMinutes(Integer.parseInt(getNext(2)));
    nationalRailTime.setSeconds(getNext(1).equals("H") ? 30 : 0);
    if (previous != null) {
      nationalRailTime.setAdditionalDays(previous.getAdditionalDays());
      if (nationalRailTime.compareTo(previous) < 0) {
        nationalRailTime.setAdditionalDays(nationalRailTime.getAdditionalDays() + 1);
      }
    }
    previous = nationalRailTime;
    return nationalRailTime;
  }

  @Override
  public void reset() {
    previous = null;
  }
}
