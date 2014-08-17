package uk.co.epii.stephenson.parser;

import uk.co.epii.stephenson.cif.BasicScheduleExtraDetails;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 14:03
 */

class BasicScheduleExtraDetailsImpl implements BasicScheduleExtraDetails {

  private String recordIdentity;
  private String tractionClass;
  private String uicCode;
  private String atocCode;
  private String applicableTimetableCode;
  private String rsid;
  private String dataSource;
  private String spare;

  BasicScheduleExtraDetailsImpl() { }

  BasicScheduleExtraDetailsImpl(String recordIdentity, String tractionClass, String uicCode, String atocCode,
                                String applicableTimetableCode, String rsid, String dataSource, String spare) {
    this.recordIdentity = recordIdentity;
    this.tractionClass = tractionClass;
    this.uicCode = uicCode;
    this.atocCode = atocCode;
    this.applicableTimetableCode = applicableTimetableCode;
    this.rsid = rsid;
    this.dataSource = dataSource;
    this.spare = spare;
  }

  public String getRecordIdentity() {
    return recordIdentity;
  }

  public void setRecordIdentity(String recordIdentity) {
    this.recordIdentity = recordIdentity;
  }

  public String getTractionClass() {
    return tractionClass;
  }

  public void setTractionClass(String tractionClass) {
    this.tractionClass = tractionClass;
  }

  public String getUICCode() {
    return uicCode;
  }

  public void setUICCode(String uicCode) {
    this.uicCode = uicCode;
  }

  public String getATOCCode() {
    return atocCode;
  }

  public void setATOCCode(String atocCode) {
    this.atocCode = atocCode;
  }

  public String getApplicableTimetableCode() {
    return applicableTimetableCode;
  }

  public void setApplicableTimetableCode(String applicableTimetableCode) {
    this.applicableTimetableCode = applicableTimetableCode;
  }

  public String getRSID() {
    return rsid;
  }

  public void setRSID(String rsid) {
    this.rsid = rsid;
  }

  public String getDataSource() {
    return dataSource;
  }

  public void setDataSource(String dataSource) {
    this.dataSource = dataSource;
  }

  public String getSpare() {
    return spare;
  }

  public void setSpare(String spare) {
    this.spare = spare;
  }
}
