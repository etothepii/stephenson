package uk.co.epii.stephenson.parser;

import java.util.ArrayList;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 17:01
 */
public class MockParseListener<T> implements ParseListener<T> {

  public ArrayList<T> parsed;

  public MockParseListener() {
    this.parsed = new ArrayList<T>();
  }

  @Override
  public void parsed(T t) {
    parsed.add(t);
  }
}
