package uk.co.epii.stephenson.parser;

import uk.co.epii.stephenson.cif.BasicSchedule;
import uk.co.epii.stephenson.cif.TransactionType;

import java.util.Date;

/**
 * User: James Robinson
 * Date: 16/08/2014
 * Time: 14:00
 */

public class BasicScheduleParser implements Parser<BasicSchedule> {

  private final Parser<Date> dateParser;
  private final Parser<TransactionType> transactionTypeParser;

  public BasicScheduleParser(Parser<Date> dateParser, Parser<TransactionType> transactionTypeParser) {
    this.dateParser = dateParser;
    this.transactionTypeParser = transactionTypeParser;
  }

  @Override
  public BasicSchedule parse(String string) {
    BasicSheduleImpl basicSchedule = new BasicSheduleImpl();
    basicSchedule.setRecordIdentity(string.substring(0,2));
    return null;
  }
}
