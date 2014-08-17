package uk.co.epii.stephenson.parser;

import uk.co.epii.stephenson.cif.BasicSchedule;
import uk.co.epii.stephenson.cif.TransactionType;

import java.util.Date;

/**
 * User: James Robinson
 * Date: 16/08/2014
 * Time: 14:00
 */

public class BasicScheduleParser extends AbstractParser<BasicSchedule> {

  private final Parser<Date> dateParser;
  private final Parser<TransactionType> transactionTypeParser;
  private final Parser<boolean[]> daysParser;

  public BasicScheduleParser(Parser<Date> dateParser, Parser<TransactionType> transactionTypeParser,
                             Parser<boolean[]> daysParser) {
    this.dateParser = dateParser;
    this.transactionTypeParser = transactionTypeParser;
    this.daysParser = daysParser;
  }

  @Override
  public BasicSchedule parse(String string) {
    setRawData(string);
    BasicSheduleImpl basicSchedule = new BasicSheduleImpl();
    basicSchedule.setRecordIdentity(getNext(2));
    basicSchedule.setTransactionType(transactionTypeParser.parse(getNext(1)));
    basicSchedule.setTrainUniqueIdentifier(getNext(6));
    basicSchedule.setDateRunsFrom(dateParser.parse(getNext(6)));
    basicSchedule.setDateRunsTo(dateParser.parse(getNext(6)));
    basicSchedule.setDaysRun(daysParser.parse(getNext(7)));
    basicSchedule.setBankHolidayRunning(getNext(1));
    basicSchedule.setTrainStatus(getNext(1));
    return basicSchedule;
  }
}
