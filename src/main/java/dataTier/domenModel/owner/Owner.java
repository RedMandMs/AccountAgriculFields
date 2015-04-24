package dataTier.domenModel.owner;

import java.util.List;

import dataTier.domenModel.passport.Pasport;

public interface Owner {

	public int getId();
	public void setId(int id);
	
	public String getName();
	public void setName(String name);

	public int getINN();
	public void setINN(int iNN);

	public String getAddres();
	public void setAddres(String addres);

	public List<Pasport> getFields();
	public void setFields(List<Pasport> fields);
	
}
