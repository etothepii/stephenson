package uk.co.epii.stephenson.parser;

import uk.co.epii.stephenson.cif.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 16:46
 */
public class TrainParser implements StreamParser<Train> {

  private final List<ParseListener<Train>> parseListeners;
  private final LineParser<BasicSchedule> basicScheduleLineParser;
  private final LineParser<BasicScheduleExtraDetails> basicScheduleExtraDetailsLineParser;
  private final LineParser<OriginLocation> originLocationLineParser;
  private final LineParser<IntermediateLocation> intermediateLocationLineParser;
  private final LineParser<TerminatingLocation> terminatingLocationLineParser;
  private TrainImpl activeTrain;

  public TrainParser(LineParser<BasicSchedule> basicScheduleLineParser,
                     LineParser<BasicScheduleExtraDetails> basicScheduleExtraDetailsLineParser,
                     LineParser<OriginLocation> originLocationLineParser,
                     LineParser<IntermediateLocation> intermediateLocationLineParser,
                     LineParser<TerminatingLocation> terminatingLocationLineParser) {
    parseListeners = new ArrayList<ParseListener<Train>>();
    this.basicScheduleLineParser = basicScheduleLineParser;
    this.basicScheduleExtraDetailsLineParser = basicScheduleExtraDetailsLineParser;
    this.originLocationLineParser = originLocationLineParser;
    this.intermediateLocationLineParser = intermediateLocationLineParser;
    this.terminatingLocationLineParser = terminatingLocationLineParser;
  }

  @Override
  public void parse(Iterator<String> lines) {
    while(lines.hasNext()) {
      parse(lines.next());
    }
  }

  private void parse(String line) {
    if (line.length() < 2) {
      return;
    }
    if (line.startsWith("BS")) {
      activeTrain = new TrainImpl();
      activeTrain.setBasicSchedule(basicScheduleLineParser.parse(line));
    }
    else if (line.startsWith("BX")) {
      activeTrain.setBasicScheduleExtraDetails(basicScheduleExtraDetailsLineParser.parse(line));
    }
    else if (line.startsWith("LO")) {
      activeTrain.setOriginLocation(originLocationLineParser.parse(line));
    }
    else if (line.startsWith("LI")) {
      IntermediateLocation intermediateLocation = intermediateLocationLineParser.parse(line);
      activeTrain.addIntermediateLocation(intermediateLocation);
      if (intermediateLocation.getScheduledArrival() != null) {
        activeTrain.addIntermediateStop(intermediateLocation);
      }
    }
    else if (line.startsWith("LT")) {
      activeTrain.setTerminatingLocation(terminatingLocationLineParser.parse(line));
      for (ParseListener<Train> parseListener : parseListeners) {
        parseListener.parsed(activeTrain);
      }
      activeTrain = null;
    }
  }

  @Override
  public void addListener(ParseListener<Train> parseListener) {
    parseListeners.add(parseListener);
  }

  @Override
  public void reset() {

  }
}
