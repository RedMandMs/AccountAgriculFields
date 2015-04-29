package ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.passport;


public class Passport {
	
	public Passport(int id, int idOwner, String region, int cadastrNumber,
			double area, String type, String comment) {
		super();
		this.id = id;
		this.idOwner = idOwner;
		this.region = region;
		this.cadastrNumber = cadastrNumber;
		this.area = area;
		this.type = type;
		this.comment = comment;
	}
	
	public Passport() {
		// TODO Auto-generated constructor stub
	}
		
	
	
	/*
	 * Id поля
	 */
	private int id;
	
	 /*
	  * Организация-владелец поля
	  */
	private int idOwner;
	
	/*
	 * Регионр расположения поля
	 */
	private String region;
	
	/*
	 * Кадастровый номер поля
	 */
	private int cadastrNumber;
	
	/*
	 * Площадь поля
	 */
	private double area;
	
	/*
	 * Тип поля
	 */
	private String type;
	
	/*
	 * комментарий к полю
	 */
	private String comment;
	
	
	/*
	 * Получение id паспорта
	 */
	public int getID() {
		return id;
	}
	
	/*
	 * установка id паспорта
	 */
	public void setID(int id) {
		this.id = id;
	}
	
	/*
	 * Получение id владельца
	 */
	public int getIdOwner() {
		return idOwner;
	}
	
	/*
	 * Установка id владельца
	 */
	public void setIdOwner(int idOwner) {
		this.idOwner = idOwner;
	}
	
	/*
	 * Получение региона
	 */
	public String getRegion() {
		return region;
	}
	
	/*
	 * Установка региона
	 */
	public void setRegion(String region) {
		this.region = region;
	}
	
	/*
	 * Получение кадастрового номера
	 */
	public int getCadastrNumber() {
		return cadastrNumber;
	}
	
	/*
	 * Установка кадастрового номера
	 */
	public void setCadastrNumber(int cadastrNumber) {
		this.cadastrNumber = cadastrNumber;
	}
	
	/*
	 * Получение площади поля
	 */
	public double getArea() {
		return area;
	}
	
	/*
	 * Установка площади поля
	 */
	public void setArea(double area) {
		this.area = area;
	}
	
	/*
	 * Получение типа поля
	 */
	public String getType() {
		return type;
	}
	
	/*
	 * Установка типа поля
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/*
	 * Получение комментария к пасспорту
	 */
	public String getComment() {
		return comment;
	}
	
	/*
	 * Установка комментария к пасспорту
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}



}
