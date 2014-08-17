package uk.co.epii.stephenson.parser;

import java.util.Date;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 12:20
 */

public class NationalRailDateParser extends AbstractLineParser<Date> {

  @Override
  public Date parse(String string) {
    if (string.equals("999999")) {
      return null;
    }
    setRawData(string);
    int year = Integer.parseInt(getNext(2));
    int month = Integer.parseInt(getNext(2));
    int day = Integer.parseInt(getNext(2));
    if (year < 60) {
      year += 2000;
    }
    else {
      year += 1900;
    }
    return new Date(year, month, day);
  }
}
