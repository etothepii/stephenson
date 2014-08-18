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
      FileReader fileReader = new FileReader(file);
      BufferedReader bufferedReader = new BufferedReader(fileReader);
      try {
        return process(new BufferedReaderLineIterator(bufferedReader));
      }
      finally {
        bufferedReader.close();
        fileReader.close();
      }
    }
    catch (IOException ioe) {
      throw new RuntimeException(ioe);
    }
  }

  @Override
  public T load(InputStream inputStream) {
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
