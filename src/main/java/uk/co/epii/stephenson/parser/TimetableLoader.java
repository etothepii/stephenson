package uk.co.epii.stephenson.parser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.co.epii.stephenson.cif.Timetable;
import uk.co.epii.stephenson.cif.Train;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 23:42
 */
public class TimetableLoader extends AbstractLoader<Timetable> {

  private static final Logger LOG = LoggerFactory.getLogger(TimetableLoader.class);

  static final Properties properties = loadProperties();

  private File dataFolder;
  private File timetableLocation;
  private StreamParser<Train> trainParser;
  private Timetable timetable;
  private ObjectLoader<Timetable> timetableLoader = new ObjectLoader<Timetable>();

  public TimetableLoader(StreamParser<Train> trainParser) {
    dataFolder = new File(properties.getProperty("DATA_FOLDER"));
    this.trainParser = trainParser;
  }

  @Override
  public Timetable load(String name, InputStream inputStream) {
    timetableLocation = new File(dataFolder, String.format("%s.ttb", name));
    if (!tryAndLoadTimetable()) {
      TimetableDiskImpl timetable = new TimetableDiskImpl(dataFolder);
      trainParser.addListener(new TimetableLoaderTrainParseListener(timetable));
      this.timetable = timetable;
      super.load(name, inputStream);
    }
    return timetable;
  }

  private boolean tryAndLoadTimetable() {
    try {
      timetable = timetableLoader.load(timetableLocation);
      return true;
    }
    catch (RuntimeException e) {
      return false;
    }
  }

  private static Properties loadProperties() {
    try {
      Properties properties = new Properties();
      InputStream in = TimetableDiskImpl.class.getResourceAsStream("/data.properties");
      properties.load(in);
      in.close();
      return properties;
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  protected Timetable process(Iterator<String> iterator) {
    trainParser.parse(iterator);
    timetableLoader.save(timetableLocation, timetable);
    return timetable;
  }

  private class TimetableLoaderTrainParseListener implements ParseListener<Train> {

    LoadableTimetable loadableTimetable;

    public TimetableLoaderTrainParseListener(LoadableTimetable loadableTimetable) {
      this.loadableTimetable = loadableTimetable;
    }

    int trainsAdded = 0;

    @Override
    public void parsed(Train train) {
      loadableTimetable.addTrain(train);
      trainsAdded++;
      if (trainsAdded % 1000 == 0) {
        LOG.debug("Trains added: {}", trainsAdded);
      }
    }
  }
}
