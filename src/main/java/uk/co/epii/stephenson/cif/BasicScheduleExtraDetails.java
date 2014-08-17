package uk.co.epii.stephenson.cif;

import java.util.Date;

/**
 * User: James Robinson
 * Date: 16/08/2014
 * Time: 13:44
 */
public interface BasicScheduleExtraDetails {

  public String getRecordIdentity();
  public String getTractionClass();
  public String getUICCode();
  public String getATOCCode();
  public String getApplicableTimetableCode();
  public String getRSID();
  public String getDataSource();
  public String getSpare();

}
