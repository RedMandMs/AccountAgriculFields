package domenModel.fieldPassport;

import domenModel.organizations.OrganizationInt;

public class FieldIml implements FieldInt {
	
	/*
	 * Id ����
	 */
	private int ID;
	
	 /*
	  * �����������-�������� ����
	  */
	private OrganizationInt owner;
	
	/*
	 * ������� ������������ ����
	 */
	private FieldRegion region;
	
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
	private FieldType type;
	
	/*
	 * ����������� � ����
	 */
	private String comment;
	
	public int getID() {
		return ID;
	}
	public void setID(int id) {
		this.ID = id;
	}
	public OrganizationInt getOwner() {
		return owner;
	}
	public void setOwner(OrganizationInt owner) {
		this.owner = owner;
	}
	public FieldRegion getRegion() {
		return region;
	}
	public void setRegion(FieldRegion region) {
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
	public FieldType getType() {
		return type;
	}
	public void setType(FieldType type) {
		this.type = type;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}



}
