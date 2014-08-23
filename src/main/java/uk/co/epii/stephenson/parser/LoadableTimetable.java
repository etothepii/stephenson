package uk.co.epii.stephenson.parser;

import uk.co.epii.stephenson.cif.Timetable;
import uk.co.epii.stephenson.cif.Train;

/**
 * User: James Robinson
 * Date: 22/08/2014
 * Time: 23:34
 */
interface LoadableTimetable extends Timetable {

  void addTrain(Train train);

}
