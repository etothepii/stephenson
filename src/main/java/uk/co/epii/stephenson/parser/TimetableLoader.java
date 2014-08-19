package uk.co.epii.stephenson.parser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.co.epii.stephenson.cif.Timetable;
import uk.co.epii.stephenson.cif.Train;

import java.util.Iterator;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 23:42
 */
public class TimetableLoader extends AbstractLoader<Timetable> {

  private static final Logger LOG = LoggerFactory.getLogger(TimetableLoader.class);

  private StreamParser<Train> trainParser;
  private TimetableMemoryImpl activeTimetable;

  public TimetableLoader(StreamParser<Train> trainParser) {
    this.trainParser = trainParser;
    trainParser.addListener(new ParseListener<Train>() {

      int trainsAdded = 0;

      @Override
      public void parsed(Train train) {
        activeTimetable.addTrain(train);
        trainsAdded++;
        if (trainsAdded % 1000 == 0) {
          LOG.debug("Trains added: {}", trainsAdded);
        }
      }
    });
  }

  @Override
  protected Timetable process(Iterator<String> iterator) {
    activeTimetable = new TimetableMemoryImpl();
    trainParser.parse(iterator);
    return activeTimetable;
  }
}
