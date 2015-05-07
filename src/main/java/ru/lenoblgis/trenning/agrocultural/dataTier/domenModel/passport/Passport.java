package ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.passport;


public class Passport {
	
	public Passport(int id, int idOwner, String region, String cadastrNumber,
			int area, String type, String comment) {
		setID(id);
		setIdOwner(idOwner);
		setRegion(region);
		setCadastrNumber(cadastrNumber);
		setArea(area);
		setType(type);		
		setComment(comment);
	}
	
	public Passport(int idOwner, String region, String cadastrNumber,
			int area, String type, String comment) {
		setIdOwner(idOwner);
		setRegion(region);
		setCadastrNumber(cadastrNumber);
		setArea(area);
		setType(type);		
		setComment(comment);
	}
	
	public Passport() {
		setComment(null);
		setCadastrNumber(null);
	}
	
	
	/**
	 * Id ����
	 */
	private int id;
	
	 /**
	  * �����������-�������� ����
	  */
	private int idOwner;
	
	/**
	 * ������� ������������ ����
	 */
	private RegionField region;
	
	/**
	 * ����������� ����� ����
	 */
	private Integer cadastrNumber;
	
	/**
	 * ������� ����
	 */
	private int area;
	
	/**
	 * ��� ����
	 */
	private TypeField type;
	
	/**
	 * ����������� � ����
	 */
	private String comment;
	
	
	/**
	 * ��������� id ��������
	 */
	public int getID() {
		return id;
	}
	
	/**
	 * ��������� id ��������
	 */
	public void setID(int id) {
		this.id = id;
	}
	
	/**
	 * ��������� id ���������
	 */
	public int getIdOwner() {
		return idOwner;
	}
	
	/**
	 * ��������� id ���������
	 */
	public void setIdOwner(int idOwner) {
		this.idOwner = idOwner;
	}
	
	/**
	 * ��������� �������
	 */
	public String getRegion() {
		return region.getRegion();
	}
	
	/**
	 * ��������� �������
	 */
	public void setRegion(String region) {
		this.region = RegionField.getRegion(region);
	}
	
	/**
	 * ��������� ������������ ������
	 */
	public Integer getCadastrNumber() {
			return cadastrNumber;
	}
	
	/**
	 * ��������� ������������ ������
	 */
	public void setCadastrNumber(String cadastrNumber) {
		if(cadastrNumber == null || cadastrNumber.trim().equals("")){
			this.cadastrNumber = null;
		}else{
			this.cadastrNumber = Integer.valueOf(cadastrNumber);
		}
	}
	
	/**
	 * ��������� ������� ����
	 */
	public int getArea() {
		return area;
	}
	
	/**
	 * ��������� ������� ����
	 */
	public void setArea(int area) {
		this.area = area;
	}
	
	/**
	 * ��������� ���� ����
	 */
	public String getType() {
		return type.getType();
	}
	
	/**
	 * ��������� ���� ����
	 */
	public void setType(String type) {
		this.type = TypeField.getType(type);
	}
	
	/**
	 * ��������� ����������� � ���������
	 */
	public String getComment() {
		return comment;
	}
	
	/**
	 * ��������� ����������� � ���������
	 */
	public void setComment(String comment) {
		if(comment == null || comment.trim().equals("")){
			this.comment = "This passport hasn't comment";
		}else{
			this.comment = comment;
		}
	}



}
