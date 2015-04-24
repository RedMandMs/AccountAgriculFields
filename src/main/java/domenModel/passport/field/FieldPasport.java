package domenModel.passport.field;

import domenModel.owner.Owner;
import domenModel.passport.Pasport;

public class FieldPasport implements Pasport {
	
	/*
	 * Id поля
	 */
	private int ID;
	
	 /*
	  * Организация-владелец поля
	  */
	private Owner owner;
	
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
	
	public int getID() {
		return ID;
	}
	public void setID(int id) {
		this.ID = id;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
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
