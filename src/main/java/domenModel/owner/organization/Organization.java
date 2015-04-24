package domenModel.owner.organization;

import java.util.List;

import domenModel.owner.Owner;
import domenModel.passport.Pasport;

public class Organization implements Owner{
	
	private int id;
	
	private String name;
	
	private int INN;
	
	private String Addres;
	
	private List<Pasport> fields;

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

	public List<Pasport> getFields() {
		return fields;
	}

	public void setFields(List<Pasport> fields) {
		this.fields = fields;
	}

}
