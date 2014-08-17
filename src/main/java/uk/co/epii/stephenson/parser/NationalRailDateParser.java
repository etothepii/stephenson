package uk.co.epii.stephenson.parser;

import java.util.Date;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 12:20
 */

public class NationalRailDateParser implements Parser<Date> {

  @Override
  public Date parse(String string) {
    if (string.equals("999999")) {
      return null;
    }
    int year = Integer.parseInt(string.substring(0,2));
    int month = Integer.parseInt(string.substring(2,4));
    int day = Integer.parseInt(string.substring(4,6));
    if (year < 60) {
      year += 2000;
    }
    else {
      year += 1900;
    }
    return new Date(year, month, day);
  }
}
