package uk.co.epii.stephenson.parser;

/**
 * User: James Robinson
 * Date: 16/08/2014
 * Time: 14:02
 */
public interface Parser<T> {

  public T parse(String string);

}
