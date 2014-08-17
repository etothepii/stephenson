package uk.co.epii.stephenson.parser;

import uk.co.epii.stephenson.cif.BasicSchedule;
import uk.co.epii.stephenson.cif.TransactionType;

import java.util.Date;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 11:03
 */

class BasicSheduleImpl implements BasicSchedule {

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

  BasicSheduleImpl() { }

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

  BasicSheduleImpl(String recordIdentity, TransactionType transactionType, String trainUniqueIdentifier,
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
}
