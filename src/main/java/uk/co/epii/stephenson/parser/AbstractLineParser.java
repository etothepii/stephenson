package uk.co.epii.stephenson.parser;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 13:03
 */

abstract class AbstractLineParser<T> implements LineParser<T> {

  private String rawData;
  private int positionOnString = 0;

  protected void setRawData(String rawData) {
    this.rawData = rawData;
    positionOnString = 0;
  }

  protected String getNext(int characters) {
    if (positionOnString >= rawData.length()) {
      return blankString(characters);
    }
    if (positionOnString + characters > rawData.length()) {
      return remainingDataAndBlankString(characters);
    }
    String next = rawData.substring(positionOnString, positionOnString + characters);
    positionOnString += characters;
    return next;
  }

  private String remainingDataAndBlankString(int characters) {
    StringBuilder stringBuilder = new StringBuilder(characters);
    stringBuilder.append(rawData.substring(positionOnString));
    for (int i = stringBuilder.length(); i < characters; i++) {
      stringBuilder.append(' ');
    }
    positionOnString = rawData.length();
    return stringBuilder.toString();
  }

  private String blankString(int characters) {
    StringBuilder stringBuilder = new StringBuilder(characters);
    for (int i = 0; i < characters; i++) {
      stringBuilder.append(' ');
    }
    return stringBuilder.toString();
  }

  public void reset() {}

}
