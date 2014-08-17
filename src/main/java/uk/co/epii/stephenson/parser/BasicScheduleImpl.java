package uk.co.epii.stephenson.parser;

import uk.co.epii.stephenson.cif.BasicSchedule;
import uk.co.epii.stephenson.cif.TransactionType;

import java.util.Arrays;
import java.util.Date;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 11:03
 */

class BasicScheduleImpl implements BasicSchedule {

  private String recordIdentity;
  private TransactionType transactionType;
  private String trainUniqueIdentifier;
  private Date dateRunsFrom;
  private Date dateRunsTo;
  private boolean[] daysRun;
  private String bankHolidayRunning;
  private String trainStatus;
  private String trainCategory;
  private String trainIdentity;
  private String headcode;
  private String courseIndicator;
  private String trainServiceCode;
  private String portionId;
  private String powerType;
  private String timingLoad;
  private String speed;
  private String operatingCharacteristics;
  private String trainClass;
  private String sleepers;
  private String reservations;
  private String connectionIndicator;
  private String cateringCode;
  private String serviceBranding;
  private String spare;
  private String stpIndicator;

  BasicScheduleImpl() { }

  public String getRecordIdentity() {
    return recordIdentity;
  }

  public void setRecordIdentity(String recordIdentity) {
    this.recordIdentity = recordIdentity;
  }

  public TransactionType getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(TransactionType transactionType) {
    this.transactionType = transactionType;
  }

  public String getTrainUniqueIdentifier() {
    return trainUniqueIdentifier;
  }

  public void setTrainUniqueIdentifier(String trainUniqueIdentifier) {
    this.trainUniqueIdentifier = trainUniqueIdentifier;
  }

  public Date getDateRunsFrom() {
    return dateRunsFrom;
  }

  public void setDateRunsFrom(Date dateRunsFrom) {
    this.dateRunsFrom = dateRunsFrom;
  }

  public Date getDateRunsTo() {
    return dateRunsTo;
  }

  public void setDateRunsTo(Date dateRunsTo) {
    this.dateRunsTo = dateRunsTo;
  }

  public boolean[] getDaysRun() {
    return daysRun;
  }

  public void setDaysRun(boolean[] daysRun) {
    this.daysRun = daysRun;
  }

  public String getBankHolidayRunning() {
    return bankHolidayRunning;
  }

  public void setBankHolidayRunning(String bankHolidayRunning) {
    this.bankHolidayRunning = bankHolidayRunning;
  }

  public String getTrainStatus() {
    return trainStatus;
  }

  public void setTrainStatus(String trainStatus) {
    this.trainStatus = trainStatus;
  }

  public String getTrainCategory() {
    return trainCategory;
  }

  public void setTrainCategory(String trainCategory) {
    this.trainCategory = trainCategory;
  }

  public String getTrainIdentity() {
    return trainIdentity;
  }

  public void setTrainIdentity(String trainIdentity) {
    this.trainIdentity = trainIdentity;
  }

  public String getHeadcode() {
    return headcode;
  }

  public void setHeadcode(String headcode) {
    this.headcode = headcode;
  }

  public String getCourseIndicator() {
    return courseIndicator;
  }

  public void setCourseIndicator(String courseIndicator) {
    this.courseIndicator = courseIndicator;
  }

  public String getTrainServiceCode() {
    return trainServiceCode;
  }

  public void setTrainServiceCode(String trainServiceCode) {
    this.trainServiceCode = trainServiceCode;
  }

  public String getPortionId() {
    return portionId;
  }

  public void setPortionId(String portionId) {
    this.portionId = portionId;
  }

  public String getPowerType() {
    return powerType;
  }

  public void setPowerType(String powerType) {
    this.powerType = powerType;
  }

  public String getTimingLoad() {
    return timingLoad;
  }

  public void setTimingLoad(String timingLoad) {
    this.timingLoad = timingLoad;
  }

  public String getSpeed() {
    return speed;
  }

  public void setSpeed(String speed) {
    this.speed = speed;
  }

  public String getOperatingCharacteristics() {
    return operatingCharacteristics;
  }

  public void setOperatingCharacteristics(String operatingCharacteristics) {
    this.operatingCharacteristics = operatingCharacteristics;
  }

  public String getTrainClass() {
    return trainClass;
  }

  public void setTrainClass(String trainClass) {
    this.trainClass = trainClass;
  }

  public String getSleepers() {
    return sleepers;
  }

  public void setSleepers(String sleepers) {
    this.sleepers = sleepers;
  }

  public String getReservations() {
    return reservations;
  }

  public void setReservations(String reservations) {
    this.reservations = reservations;
  }

  public String getConnectionIndicator() {
    return connectionIndicator;
  }

  public void setConnectionIndicator(String connectionIndicator) {
    this.connectionIndicator = connectionIndicator;
  }

  public String getCateringCode() {
    return cateringCode;
  }

  public void setCateringCode(String cateringCode) {
    this.cateringCode = cateringCode;
  }

  public String getServiceBranding() {
    return serviceBranding;
  }

  public void setServiceBranding(String serviceBranding) {
    this.serviceBranding = serviceBranding;
  }

  public String getSpare() {
    return spare;
  }

  public void setSpare(String spare) {
    this.spare = spare;
  }

  public String getSTPIndicator() {
    return stpIndicator;
  }

  public void setSTPIndicator(String stpIndicator) {
    this.stpIndicator = stpIndicator;
  }

  BasicScheduleImpl(String recordIdentity, TransactionType transactionType, String trainUniqueIdentifier,
                    Date dateRunsFrom, Date dateRunsTo, boolean[] daysRun, String bankHolidayRunning, String trainStatus,
                    String trainCategory, String trainIdentity, String headcode, String courseIndicator,
                    String trainServiceCode, String portionId, String powerType, String timingLoad, String speed,
                    String operatingCharacteristics, String trainClass, String sleepers, String reservations,
                    String connectionIndicator, String cateringCode, String serviceBranding, String spare,
                    String stpIndicator) {
    this.recordIdentity = recordIdentity;
    this.transactionType = transactionType;
    this.trainUniqueIdentifier = trainUniqueIdentifier;
    this.dateRunsFrom = dateRunsFrom;
    this.dateRunsTo = dateRunsTo;
    this.daysRun = daysRun;
    this.bankHolidayRunning = bankHolidayRunning;
    this.trainStatus = trainStatus;
    this.trainCategory = trainCategory;
    this.trainIdentity = trainIdentity;
    this.headcode = headcode;
    this.courseIndicator = courseIndicator;
    this.trainServiceCode = trainServiceCode;
    this.portionId = portionId;
    this.powerType = powerType;
    this.timingLoad = timingLoad;
    this.speed = speed;
    this.operatingCharacteristics = operatingCharacteristics;
    this.trainClass = trainClass;
    this.sleepers = sleepers;
    this.reservations = reservations;
    this.connectionIndicator = connectionIndicator;
    this.cateringCode = cateringCode;
    this.serviceBranding = serviceBranding;
    this.spare = spare;
    this.stpIndicator = stpIndicator;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    BasicScheduleImpl that = (BasicScheduleImpl) o;

    if (bankHolidayRunning != null ? !bankHolidayRunning.equals(that.bankHolidayRunning) : that.bankHolidayRunning != null)
      return false;
    if (cateringCode != null ? !cateringCode.equals(that.cateringCode) : that.cateringCode != null) return false;
    if (connectionIndicator != null ? !connectionIndicator.equals(that.connectionIndicator) : that.connectionIndicator != null)
      return false;
    if (courseIndicator != null ? !courseIndicator.equals(that.courseIndicator) : that.courseIndicator != null)
      return false;
    if (dateRunsFrom != null ? !dateRunsFrom.equals(that.dateRunsFrom) : that.dateRunsFrom != null) return false;
    if (dateRunsTo != null ? !dateRunsTo.equals(that.dateRunsTo) : that.dateRunsTo != null) return false;
    if (!Arrays.equals(daysRun, that.daysRun)) return false;
    if (headcode != null ? !headcode.equals(that.headcode) : that.headcode != null) return false;
    if (operatingCharacteristics != null ? !operatingCharacteristics.equals(that.operatingCharacteristics) : that.operatingCharacteristics != null)
      return false;
    if (portionId != null ? !portionId.equals(that.portionId) : that.portionId != null) return false;
    if (powerType != null ? !powerType.equals(that.powerType) : that.powerType != null) return false;
    if (recordIdentity != null ? !recordIdentity.equals(that.recordIdentity) : that.recordIdentity != null)
      return false;
    if (reservations != null ? !reservations.equals(that.reservations) : that.reservations != null) return false;
    if (serviceBranding != null ? !serviceBranding.equals(that.serviceBranding) : that.serviceBranding != null)
      return false;
    if (sleepers != null ? !sleepers.equals(that.sleepers) : that.sleepers != null) return false;
    if (spare != null ? !spare.equals(that.spare) : that.spare != null) return false;
    if (speed != null ? !speed.equals(that.speed) : that.speed != null) return false;
    if (stpIndicator != null ? !stpIndicator.equals(that.stpIndicator) : that.stpIndicator != null) return false;
    if (timingLoad != null ? !timingLoad.equals(that.timingLoad) : that.timingLoad != null) return false;
    if (trainCategory != null ? !trainCategory.equals(that.trainCategory) : that.trainCategory != null) return false;
    if (trainClass != null ? !trainClass.equals(that.trainClass) : that.trainClass != null) return false;
    if (trainIdentity != null ? !trainIdentity.equals(that.trainIdentity) : that.trainIdentity != null) return false;
    if (trainServiceCode != null ? !trainServiceCode.equals(that.trainServiceCode) : that.trainServiceCode != null)
      return false;
    if (trainStatus != null ? !trainStatus.equals(that.trainStatus) : that.trainStatus != null) return false;
    if (trainUniqueIdentifier != null ? !trainUniqueIdentifier.equals(that.trainUniqueIdentifier) : that.trainUniqueIdentifier != null)
      return false;
    if (transactionType != that.transactionType) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = recordIdentity != null ? recordIdentity.hashCode() : 0;
    result = 31 * result + (transactionType != null ? transactionType.hashCode() : 0);
    result = 31 * result + (trainUniqueIdentifier != null ? trainUniqueIdentifier.hashCode() : 0);
    result = 31 * result + (dateRunsFrom != null ? dateRunsFrom.hashCode() : 0);
    result = 31 * result + (dateRunsTo != null ? dateRunsTo.hashCode() : 0);
    result = 31 * result + (daysRun != null ? Arrays.hashCode(daysRun) : 0);
    result = 31 * result + (bankHolidayRunning != null ? bankHolidayRunning.hashCode() : 0);
    result = 31 * result + (trainStatus != null ? trainStatus.hashCode() : 0);
    result = 31 * result + (trainCategory != null ? trainCategory.hashCode() : 0);
    result = 31 * result + (trainIdentity != null ? trainIdentity.hashCode() : 0);
    result = 31 * result + (headcode != null ? headcode.hashCode() : 0);
    result = 31 * result + (courseIndicator != null ? courseIndicator.hashCode() : 0);
    result = 31 * result + (trainServiceCode != null ? trainServiceCode.hashCode() : 0);
    result = 31 * result + (portionId != null ? portionId.hashCode() : 0);
    result = 31 * result + (powerType != null ? powerType.hashCode() : 0);
    result = 31 * result + (timingLoad != null ? timingLoad.hashCode() : 0);
    result = 31 * result + (speed != null ? speed.hashCode() : 0);
    result = 31 * result + (operatingCharacteristics != null ? operatingCharacteristics.hashCode() : 0);
    result = 31 * result + (trainClass != null ? trainClass.hashCode() : 0);
    result = 31 * result + (sleepers != null ? sleepers.hashCode() : 0);
    result = 31 * result + (reservations != null ? reservations.hashCode() : 0);
    result = 31 * result + (connectionIndicator != null ? connectionIndicator.hashCode() : 0);
    result = 31 * result + (cateringCode != null ? cateringCode.hashCode() : 0);
    result = 31 * result + (serviceBranding != null ? serviceBranding.hashCode() : 0);
    result = 31 * result + (spare != null ? spare.hashCode() : 0);
    result = 31 * result + (stpIndicator != null ? stpIndicator.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "BasicScheduleImpl{" +
            "recordIdentity='" + recordIdentity + '\'' +
            ", transactionType=" + transactionType +
            ", trainUniqueIdentifier='" + trainUniqueIdentifier + '\'' +
            ", dateRunsFrom=" + dateRunsFrom +
            ", dateRunsTo=" + dateRunsTo +
            ", daysRun=" + Arrays.toString(daysRun) +
            ", bankHolidayRunning='" + bankHolidayRunning + '\'' +
            ", trainStatus='" + trainStatus + '\'' +
            ", trainCategory='" + trainCategory + '\'' +
            ", trainIdentity='" + trainIdentity + '\'' +
            ", headcode='" + headcode + '\'' +
            ", courseIndicator='" + courseIndicator + '\'' +
            ", trainServiceCode='" + trainServiceCode + '\'' +
            ", portionId='" + portionId + '\'' +
            ", powerType='" + powerType + '\'' +
            ", timingLoad='" + timingLoad + '\'' +
            ", speed='" + speed + '\'' +
            ", operatingCharacteristics='" + operatingCharacteristics + '\'' +
            ", trainClass='" + trainClass + '\'' +
            ", sleepers='" + sleepers + '\'' +
            ", reservations='" + reservations + '\'' +
            ", connectionIndicator='" + connectionIndicator + '\'' +
            ", cateringCode='" + cateringCode + '\'' +
            ", serviceBranding='" + serviceBranding + '\'' +
            ", spare='" + spare + '\'' +
            ", stpIndicator='" + stpIndicator + '\'' +
            '}';
  }
}
