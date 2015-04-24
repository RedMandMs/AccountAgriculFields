package dataTier.domenModel.ActionEvent;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import dataTier.domenModel.owner.Owner;
import dataTier.domenModel.passport.Pasport;

public interface PassportEvent {
	
	public int getId();
	
	public String getMessage();
	
	public void writeMessage();
	
	public Owner getAothor();
	
	public Pasport getObject();
	
	public DateTime getDataTime();
	
	public LocalDate getTime();
	
	public DateTime getData();
	
	public String getType();

}
