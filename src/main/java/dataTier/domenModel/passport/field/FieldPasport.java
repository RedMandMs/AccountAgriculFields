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
	 * Id ����
	 */
	private int id;
	
	 /*
	  * �����������-�������� ����
	  */
	private int idOwner;
	
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
