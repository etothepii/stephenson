package uk.co.epii.stephenson.parser;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 13:03
 */

abstract class AbstractParser<T> implements Parser<T> {

  private String rawData;
  private int positionOnString = 0;

  protected void setRawData(String rawData) {
    this.rawData = rawData;
    positionOnString = 0;
  }

  protected String getNext(int characters) {
    String next = rawData.substring(positionOnString, positionOnString + characters);
    positionOnString += characters;
    return next;
  }

}
