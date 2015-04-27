package dataTier.domenModel.owner.organization;

import java.util.List;

import dataTier.domenModel.owner.Owner;
import dataTier.domenModel.passport.Passport;

public class Organization implements Owner{
	
	
	public Organization(int id, String name, int inn, String addres) {
		super();
		this.id = id;
		this.name = name;
		this.inn = inn;
		this.addres = addres;
	}

	/*
	 * id �����������
	 */
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
	private String addres;
	
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
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public List<Passport> getFields() {
		return fields;
	}

	public void setFields(List<Passport> fields) {
		this.fields = fields;
	}

}
