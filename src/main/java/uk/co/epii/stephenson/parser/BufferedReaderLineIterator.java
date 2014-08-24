package uk.co.epii.stephenson.parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;

/**
 * User: James Robinson
 * Date: 18/08/2014
 * Time: 00:39
 */
public class BufferedReaderLineIterator implements Iterator<String> {

  private final BufferedReader bufferedReader;
  private String nextLine;

  public BufferedReaderLineIterator(BufferedReader bufferedReader) {
    this.bufferedReader = bufferedReader;
  }

  @Override
  public boolean hasNext() {
    try {
      nextLine = bufferedReader.readLine();
      return nextLine != null;
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public String next() {
    return nextLine;
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException("This operation is not supported");
  }
}
