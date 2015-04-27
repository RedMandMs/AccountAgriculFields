package dataTier.domenModel.passport.field;

import dataTier.domenModel.owner.Owner;
import dataTier.domenModel.passport.Passport;

public class FieldPasport implements Passport {
	
	public FieldPasport(int id, int idOwner, String region, int cadastrNumber,
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
	
	
	//Геттеры и сеттеры
	public int getID() {
		return id;
	}
	public void setID(int id) {
		this.id = id;
	}
	
	public int getIdOwner() {
		return idOwner;
	}
	public void setIdOwner(int idOwner) {
		this.idOwner = idOwner;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public int getCadastrNumber() {
		return cadastrNumber;
	}
	public void setCadastrNumber(int cadastrNumber) {
		this.cadastrNumber = cadastrNumber;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}



}
