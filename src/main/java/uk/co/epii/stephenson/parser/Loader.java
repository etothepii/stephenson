package uk.co.epii.stephenson.parser;

import java.io.File;
import java.io.InputStream;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 23:39
 */
public interface Loader<T> {

  public T load(File file);
  public T load(InputStream inputStream);

}
