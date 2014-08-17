package uk.co.epii.stephenson.parser;

import org.junit.Before;
import org.junit.Test;
import uk.co.epii.stephenson.cif.TransactionType;

import static org.junit.Assert.assertEquals;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 12:40
 */
public class TransactionTypeParserTest {

  private TransactionTypeParser transactionTypeParser;

  @Before
  public void setUp() {
    transactionTypeParser = new TransactionTypeParser();
  }

  @Test
  public void parsesNewTransactionTypeTest() {
    TransactionType actual = transactionTypeParser.parse("N");
    TransactionType expected = TransactionType.NEW;
    assertEquals("New", expected, actual);
  }

  @Test
  public void parsesDeleteTransactionTypeTest() {
    TransactionType actual = transactionTypeParser.parse("D");
    TransactionType expected = TransactionType.DELETE;
    assertEquals("Delete", expected, actual);
  }

  @Test
  public void parsesReviseTransactionTypeTest() {
    TransactionType actual = transactionTypeParser.parse("R");
    TransactionType expected = TransactionType.REVISE;
    assertEquals("Revise", expected, actual);
  }

}
