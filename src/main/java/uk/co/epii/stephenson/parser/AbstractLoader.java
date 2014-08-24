package uk.co.epii.stephenson.parser;

import java.io.*;
import java.util.Iterator;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 23:59
 */
public abstract class AbstractLoader<T> implements Loader<T> {

  @Override
  public T load(File file) {
    try {
      FileInputStream fileInputStream = new FileInputStream(file);
      return load(file.getName(), fileInputStream);
    }
    catch (IOException ioe) {
      throw new RuntimeException(ioe);
    }
  }

  @Override
  public T load(String name, InputStream inputStream) {
    try {
      InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
      BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
      try {
        return process(new BufferedReaderLineIterator(bufferedReader));
      }
      finally {
        bufferedReader.close();
        inputStreamReader.close();
      }
    }
    catch (IOException ioe) {
      throw new RuntimeException(ioe);
    }
  }

  protected abstract T process(Iterator<String> iterator);
}
