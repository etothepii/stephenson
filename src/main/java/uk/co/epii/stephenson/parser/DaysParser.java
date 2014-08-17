package uk.co.epii.stephenson.parser;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 12:52
 */
public class DaysParser extends AbstractLineParser<boolean[]> {

  @Override
  public boolean[] parse(String string) {
    boolean[] days = new boolean[7];
    for (int i = 0; i < 7; i++) {
      days[i] = string.charAt(i) == '1';
    }
    return days;
  }
}
