package ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.organization;

import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.passport.Passport;
import java.util.ArrayList;
import java.util.List;

public class Organization implements Owner{
	
	
	public Organization(int id, String name, int inn, String addres) {
		super();
		this.id = id;
		this.name = name;
		this.inn = inn;
		this.addres = addres;
	}
	
	public Organization(){
		
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

	/*
	 * (non-Javadoc)
	 * @see dataTier.domenModel.owner.Owner#getAddres()
	 */
	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public List<Passport> getFields() {
		if (fields == null) {
			this.fields = new ArrayList<Passport>();
		}
		
		return fields;
	}

	public void setFields(List<Passport> fields) {
		this.fields = fields;
	}

}
