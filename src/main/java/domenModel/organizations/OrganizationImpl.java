package domenModel.organizations;

import java.util.List;

import domenModel.fieldPassport.FieldInt;

public class OrganizationImpl implements OrganizationInt{
	
	private int id;
	
	private String name;
	
	private int INN;
	
	private String Addres;
	
	private List<FieldInt> fields;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getINN() {
		return INN;
	}

	public void setINN(int iNN) {
		INN = iNN;
	}

	public String getAddres() {
		return Addres;
	}

	public void setAddres(String addres) {
		Addres = addres;
	}

	public List<FieldInt> getFields() {
		return fields;
	}

	public void setFields(List<FieldInt> fields) {
		this.fields = fields;
	}

}
