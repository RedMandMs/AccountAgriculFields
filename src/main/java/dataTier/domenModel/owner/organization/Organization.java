package dataTier.domenModel.owner.organization;

import java.util.List;

import dataTier.domenModel.owner.Owner;
import dataTier.domenModel.passport.Passport;

public class Organization implements Owner{
	
	private int id;
	
	
	/*
	 * �������� �����������
	 */
	private String name;
	
	
	/*
	 * ��� �����������
	 */
	private int inn;
	
	
	/*
	 * ������ �����������
	 */
	private String Addres;
	
	/*
	 * ������ ���� ����� ������ �����������
	 */
	private List<Passport> fields;

	
	
	//������� � �������
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
		return inn;
	}

	public void setINN(int iNN) {
		inn = iNN;
	}

	public String getAddres() {
		return Addres;
	}

	public void setAddres(String addres) {
		Addres = addres;
	}

	public List<Passport> getFields() {
		return fields;
	}

	public void setFields(List<Passport> fields) {
		this.fields = fields;
	}

}
