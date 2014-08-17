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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    BasicScheduleExtraDetailsImpl that = (BasicScheduleExtraDetailsImpl) o;

    if (applicableTimetableCode != null ? !applicableTimetableCode.equals(that.applicableTimetableCode) : that.applicableTimetableCode != null)
      return false;
    if (atocCode != null ? !atocCode.equals(that.atocCode) : that.atocCode != null) return false;
    if (dataSource != null ? !dataSource.equals(that.dataSource) : that.dataSource != null) return false;
    if (recordIdentity != null ? !recordIdentity.equals(that.recordIdentity) : that.recordIdentity != null)
      return false;
    if (rsid != null ? !rsid.equals(that.rsid) : that.rsid != null) return false;
    if (spare != null ? !spare.equals(that.spare) : that.spare != null) return false;
    if (tractionClass != null ? !tractionClass.equals(that.tractionClass) : that.tractionClass != null) return false;
    if (uicCode != null ? !uicCode.equals(that.uicCode) : that.uicCode != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = recordIdentity != null ? recordIdentity.hashCode() : 0;
    result = 31 * result + (tractionClass != null ? tractionClass.hashCode() : 0);
    result = 31 * result + (uicCode != null ? uicCode.hashCode() : 0);
    result = 31 * result + (atocCode != null ? atocCode.hashCode() : 0);
    result = 31 * result + (applicableTimetableCode != null ? applicableTimetableCode.hashCode() : 0);
    result = 31 * result + (rsid != null ? rsid.hashCode() : 0);
    result = 31 * result + (dataSource != null ? dataSource.hashCode() : 0);
    result = 31 * result + (spare != null ? spare.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "BasicScheduleExtraDetailsImpl{" +
            "recordIdentity='" + recordIdentity + '\'' +
            ", tractionClass='" + tractionClass + '\'' +
            ", uicCode='" + uicCode + '\'' +
            ", atocCode='" + atocCode + '\'' +
            ", applicableTimetableCode='" + applicableTimetableCode + '\'' +
            ", rsid='" + rsid + '\'' +
            ", dataSource='" + dataSource + '\'' +
            ", spare='" + spare + '\'' +
            '}';
  }
}
