package ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.organization;

import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner;

public class Organization implements Owner{
	
	/**
	 * Конструктор, используемый при отображении
	 * @param id - id организации
	 * @param name - имя организации
	 * @param inn - ИНН организации
	 * @param addres - адрес расположения организации
	 */
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
	
	/**
	 * Конструктор для записи организации в БД (без id)
	 * @param name
	 * @param inn
	 * @param addres
	 */
	public Organization(String name, int inn, String addres) {
		this.name = name;
		this.inn = inn;
		if(addres == null || addres.trim().equals("")){
			this.addres = "UNKNOWN";
		}else{
			this.addres = addres;
		}
	}
	
	/**
	 * Конструктор по-умолчанию
	 */
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
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner#getId()
	 */
	public int getId() {
		return id;
	}

	/**
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner#setId(int)
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner#getName()
	 */
	public String getName() {
		return name;
	}

	/**
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner#setName(java.lang.String)
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner#getINN()
	 */
	public int getINN() {
		return inn;
	}

	/**
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner#setINN(int)
	 */
	public void setINN(int iNN) {
		inn = iNN;
	}

	/**
	 * @see dataTier.domenModel.owner.Owner#getAddres()
	 */
	public String getAddres() {
		return addres;
	}

	/**
	 * @see ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner#setAddres(java.lang.String)
	 */
	public void setAddres(String addres) {
		this.addres = addres;
	}

}
