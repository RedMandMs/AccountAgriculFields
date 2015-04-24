package dataTier.domenModel.passport.field;

import dataTier.domenModel.owner.Owner;
import dataTier.domenModel.passport.Passport;

public class FieldPasport implements Passport {
	
	/*
	 * Id ����
	 */
	private int id;
	
	 /*
	  * �����������-�������� ����
	  */
	private Owner owner;
	
	/*
	 * ������� ������������ ����
	 */
	private String region;
	
	/*
	 * ����������� ����� ����
	 */
	private int cadastrNumber;
	
	/*
	 * ������� ����
	 */
	private double area;
	
	/*
	 * ��� ����
	 */
	private String type;
	
	/*
	 * ����������� � ����
	 */
	private String comment;
	
	
	//������� � �������
	public int getID() {
		return id;
	}
	public void setID(int id) {
		this.id = id;
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
