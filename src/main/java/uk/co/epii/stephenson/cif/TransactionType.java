package uk.co.epii.stephenson.cif;

import java.io.Serializable;

/**
 * User: James Robinson
 * Date: 16/08/2014
 * Time: 13:52
 */
public enum TransactionType implements Serializable {
  NEW,
  DELETE,
  REVISE
}
