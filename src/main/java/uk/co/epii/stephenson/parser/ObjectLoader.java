package uk.co.epii.stephenson.parser;

import uk.co.epii.stephenson.cif.Train;

import java.io.*;

/**
 * User: James Robinson
 * Date: 23/08/2014
 * Time: 11:22
 */
public class ObjectLoader<T> implements Loader<T>, Serializable {

  @Override
  public T load(File loadFrom) {
    FileInputStream fileInputStream = null;
    try {
      fileInputStream = new FileInputStream(loadFrom);
      return loadFromStream(fileInputStream);
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      try {
        fileInputStream.close();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
  }

  private T loadFromStream(InputStream inputStream) {
    ObjectInputStream objectInputStream = null;
    try {
      objectInputStream = new ObjectInputStream(inputStream);
      return (T)objectInputStream.readObject();
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    } finally {
      try {
        objectInputStream.close();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
  }

  @Override
  public T load(String name, InputStream inputStream) {
    return loadFromStream(inputStream);
  }

  public void save(File saveTo, T t) {
    try {
      FileOutputStream fileOutputStream = new FileOutputStream(saveTo);
      ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
      objectOutputStream.writeObject(t);
      objectOutputStream.close();
      fileOutputStream.close();
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

}
