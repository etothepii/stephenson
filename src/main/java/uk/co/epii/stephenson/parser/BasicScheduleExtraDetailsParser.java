package uk.co.epii.stephenson.parser;


import uk.co.epii.stephenson.cif.BasicScheduleExtraDetails;

/**
 * User: James Robinson
 * Date: 17/08/2014
 * Time: 13:52
 */
public class BasicScheduleExtraDetailsParser extends AbstractLineParser<BasicScheduleExtraDetails> {

  @Override
  public BasicScheduleExtraDetails parse(String string) {
    setRawData(string);
    BasicScheduleExtraDetailsImpl basicScheduleExtraDetails = new BasicScheduleExtraDetailsImpl();
    basicScheduleExtraDetails.setRecordIdentity(getNext(2));
    basicScheduleExtraDetails.setTractionClass(getNext(4));
    basicScheduleExtraDetails.setUICCode(getNext(5));
    basicScheduleExtraDetails.setATOCCode(getNext(2));
    basicScheduleExtraDetails.setApplicableTimetableCode(getNext(1));
    basicScheduleExtraDetails.setRSID(getNext(8));
    basicScheduleExtraDetails.setDataSource(getNext(1));
    basicScheduleExtraDetails.setSpare(getNext(57));
    return basicScheduleExtraDetails;
  }
}
