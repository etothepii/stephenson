package uk.co.epii.stephenson.cif;

import java.util.Date;

/**
 * User: James Robinson
 * Date: 16/08/2014
 * Time: 13:44
 */
public interface BasicSchedule {

  public String getRecordIdentity();
  public TransactionType getTransactionType();
  public String getTrainUniqueIdentifier();
  public Date getDateRunsFrom();
  public Date getDateRunsTo();
  public boolean[] getDaysRun();
  public String getBankHolidayRunning();
  public String getTrainStatus();
  public String getTrainCategory();
  public String getTrainIdentity();
  public String getHeadcode();
  public String getCourseIndicator();
  public String getTrainServiceCode();
  public String getPortionId();
  public String getPowerType();
  public String getTimingLoad();
  public String getSpeed();
  public String getOperatingCharacteristics();
  public String getTrainClass();
  public String getSleepers();
  public String getReservations();
  public String getConnectionIndicator();
  public String getCateringCode();
  public String getServiceBranding();
  public String getSpare();
  public String getSTPIndicator();

}
