package ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.organization;

import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner;

public class Organization implements Owner{
	
	
	public Organization(int id, String name, int inn, String addres) {
		this.id = id;
		this.name = name;
		this.inn = inn;
		if(addres == null || addres.trim().equals("")){
			this.addres = "UNKNOWN";
		}else{
			this.addres = addres;
		}
	}
	
	public Organization(String name, int inn, String addres) {
		this.name = name;
		this.inn = inn;
		if(addres == null || addres.trim().equals("")){
			this.addres = "UNKNOWN";
		}else{
			this.addres = addres;
		}
	}
	
	public Organization(){
		this.addres = "UNKNOWN";
	}

	/**
	 * id организации
	 */
	private int id;
	
	/**
	 * Название организации
	 */
	private String name;
	
	
	/**
	 * ИНН организации
	 */
	private int inn;
	
	
	/**
	 * Адресс организации
	 */
	private String addres;
	
	
	/**
	 * (non-Javadoc)
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner#getId()
	 */
	public int getId() {
		return id;
	}

	/**
	 * (non-Javadoc)
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner#setId(int)
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * (non-Javadoc)
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner#getName()
	 */
	public String getName() {
		return name;
	}

	/**
	 * (non-Javadoc)
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner#setName(java.lang.String)
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * (non-Javadoc)
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner#getINN()
	 */
	public int getINN() {
		return inn;
	}

	/**
	 * (non-Javadoc)
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner#setINN(int)
	 */
	public void setINN(int iNN) {
		inn = iNN;
	}

	/**
	 * (non-Javadoc)
	 * @see dataTier.domenModel.owner.Owner#getAddres()
	 */
	public String getAddres() {
		return addres;
	}

	/**
	 * (non-Javadoc)
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner#setAddres(java.lang.String)
	 */
	public void setAddres(String addres) {
		this.addres = addres;
	}

}
