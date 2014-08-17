package uk.co.epii.stephenson.parser;

import uk.co.epii.stephenson.cif.NationalRailTime;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 14:40
 */
public class NationalRailTimeImpl implements NationalRailTime {


  private int additionalDays;
  private int hours;
  private int minutes;
  private int seconds;

  public NationalRailTimeImpl() {
  }

  public NationalRailTimeImpl(int additionalDays, int hours, int minutes, int seconds) {
    this.additionalDays = additionalDays;
    this.hours = hours;
    this.minutes = minutes;
    this.seconds = seconds;
  }

  public int getAdditionalDays() {
    return additionalDays;
  }

  public void setAdditionalDays(int additionalDays) {
    this.additionalDays = additionalDays;
  }

  public int getHours() {
    return hours;
  }

  public void setHours(int hours) {
    this.hours = hours;
  }

  public int getMinutes() {
    return minutes;
  }

  public void setMinutes(int minutes) {
    this.minutes = minutes;
  }

  public int getSeconds() {
    return seconds;
  }

  public void setSeconds(int seconds) {
    this.seconds = seconds;
  }

  @Override
  public int compareTo(NationalRailTime o) {
    if (additionalDays < o.getAdditionalDays()) return -1;
    if (additionalDays > o.getAdditionalDays()) return 1;
    if (hours < o.getHours()) return -1;
    if (hours > o.getHours()) return 1;
    if (minutes < o.getMinutes()) return -1;
    if (minutes > o.getMinutes()) return 1;
    if (seconds < o.getSeconds()) return -1;
    if (seconds > o.getSeconds()) return 1;
    return 0;

  }
}
