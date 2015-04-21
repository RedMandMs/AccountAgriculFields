package domenModel.organizations;

import java.util.List;

import domenModel.fieldPassport.FieldInt;

public interface OrganizationInt {

	public int getId();
	public void setId(int id);
	
	public String getName();
	public void setName(String name);

	public int getINN();
	public void setINN(int iNN);

	public String getAddres();
	public void setAddres(String addres);

	public List<FieldInt> getFields();
	public void setFields(List<FieldInt> fields);
	
}
