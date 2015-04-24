package domenModel.ActionEvent;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import domenModel.owner.Owner;
import domenModel.passport.Pasport;

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
