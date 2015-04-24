package dataTier.domenModel.owner;

import java.util.List;

import dataTier.domenModel.passport.Passport;

public interface Owner {

	public int getId();
	public void setId(int id);
	
	public String getName();
	public void setName(String name);

	public int getINN();
	public void setINN(int iNN);

	public String getAddres();
	public void setAddres(String addres);

	public List<Passport> getFields();
	public void setFields(List<Passport> fields);
	
}
