package uk.co.epii.stephenson.parser;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 16:52
 */
public interface ParseListener<T> {

  public void parsed(T t);

}
