package uk.co.epii.stephenson.parser;

import uk.co.epii.stephenson.cif.TransactionType;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 12:39
 */
public class TransactionTypeParser extends AbstractLineParser<TransactionType> {

  @Override
  public TransactionType parse(String string) {
    if (string.equals("N")) {
      return TransactionType.NEW;
    }
    else if (string.equals("D")) {
      return TransactionType.DELETE;
    }
    else if (string.equals("R")) {
      return TransactionType.REVISE;
    }
    return null;
  }
}
