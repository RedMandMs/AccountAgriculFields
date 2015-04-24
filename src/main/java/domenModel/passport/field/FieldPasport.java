package domenModel.passport.field;

import domenModel.owner.Owner;
import domenModel.passport.Pasport;

public class FieldPasport implements Pasport {
	
	/*
	 * Id ����
	 */
	private int ID;
	
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
