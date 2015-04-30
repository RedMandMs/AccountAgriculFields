package ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.organization;

import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.passport.Passport;
import java.util.ArrayList;
import java.util.List;

public class Organization implements Owner{
	
	
	public Organization(int id, String name, int inn, String addres) {
		this.id = id;
		this.name = name;
		this.inn = inn;
		this.addres = addres;
	}
	
	public Organization(){
		
	}

	/*
	 * id организации
	 */
	private int id;
	
	/*
	 * Название организации
	 */
	private String name;
	
	
	/*
	 * ИНН организации
	 */
	private int inn;
	
	
	/*
	 * Адресс организации
	 */
	private String addres;
	
	/*
	 * Список всех полей данной организации
	 */
	private List<Passport> fields;

	
	
	/*
	 * (non-Javadoc)
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner#getId()
	 */
	public int getId() {
		return id;
	}

	/*
	 * (non-Javadoc)
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner#setId(int)
	 */
	public void setId(int id) {
		this.id = id;
	}

	/*
	 * (non-Javadoc)
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner#getName()
	 */
	public String getName() {
		return name;
	}

	/*
	 * (non-Javadoc)
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner#setName(java.lang.String)
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner#getINN()
	 */
	public int getINN() {
		return inn;
	}

	/*
	 * (non-Javadoc)
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner#setINN(int)
	 */
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

	/*
	 * (non-Javadoc)
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner#setAddres(java.lang.String)
	 */
	public void setAddres(String addres) {
		this.addres = addres;
	}

	/*
	 * (non-Javadoc)
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner#getFields()
	 */
	public List<Passport> getFields() {
		if (fields == null) {
			this.fields = new ArrayList<Passport>();
		}
		
		return fields;
	}

}
