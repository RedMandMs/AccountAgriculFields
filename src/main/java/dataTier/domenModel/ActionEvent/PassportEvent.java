package dataTier.domenModel.ActionEvent;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import dataTier.domenModel.owner.Owner;
import dataTier.domenModel.passport.Passport;

public interface PassportEvent {
	
	public int getId();
	
	public String getMessage();
	
	public void writeMessage();
	
	public Owner getAothor();
	
	public Passport getPassport();
	
	public DateTime getDataTime();
	
	public LocalDate getTime();
	
	public DateTime getData();
	
	public String getType();

}
