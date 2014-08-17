package uk.co.epii.stephenson.parser;

import java.util.Iterator;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 16:50
 */
public interface StreamParser<T> {

  public void parse(Iterator<String> lines);
  public void addListener(ParseListener<T> parseListener);
  public void reset();

}
