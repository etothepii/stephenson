package uk.co.epii.stephenson.parser;

import uk.co.epii.stephenson.cif.Timetable;
import uk.co.epii.stephenson.cif.Train;

import java.io.File;
import java.io.InputStream;
import java.util.Iterator;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 23:42
 */
public class TimetableLoader extends AbstractLoader<Timetable> implements ParseListener<Train> {

  private StreamParser<Train> trainParser;
  private TimetableImpl activeTimetable;

  public TimetableLoader(StreamParser<Train> trainParser) {
    this.trainParser = trainParser;
    trainParser.addListener(this);
  }

  @Override
  protected Timetable process(Iterator<String> iterator) {
    activeTimetable = new TimetableImpl();
    trainParser.parse(iterator);
    return activeTimetable;
  }

  @Override
  public void parsed(Train train) {
    activeTimetable.addTrain(train);
  }
}
