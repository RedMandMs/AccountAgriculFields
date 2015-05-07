package ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.actionEvent;

import ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.DAO;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.passport.Passport;

public class PassportEvent {
	
	private int  id;
	private String message;
	private DateTime dateTime;
	private TypeEvent typeEvent;	
	private int idAuthor;
	private String nameAuthor;
	private Owner auther;
	private int idPassport;
	private Passport passport;
	
	public PassportEvent(){
		
	}
	
	public PassportEvent(Passport passport, String eventType, DAO dao){
		setPassportandAothor(passport, dao);
		setType(TypeEvent.valueOf(eventType));
		createMessage();
	}
	
	/**
	 * �������� �������� � ������� � ������������ id ��������� � ������ (��� ������� � ���� ������ - ��� ������ �� �������, ��� �����)
	 * @param passport - ������� ��� ������� ����������� �������
	 */
	private void setIdPassportandAothor(Passport passport) {
		this.passport = passport;
		this.idPassport = passport.getID();
		this.idAuthor = passport.getIdOwner();
	}
	
	/**
	 * ���������� ������� � ������ ������� � ��� ������������� �� ��� ���� (� �������� � ���� ������)
	 * @param passport - ������� ��� ������� ����������� �������
	 */
	private void setPassportandAothor(Passport passport, DAO dao) {
		this.passport = passport;
		this.idPassport = passport.getID();
		this.idAuthor = passport.getIdOwner();
		this.auther = dao.reviewOwner(idAuthor);
		this.nameAuthor = auther.getName();
	}
	
	/**
	 * ���������� id �������
	 */
	public void setId(int id){
		this.id = id;
	}
	
	/**
	 * ���������� ��������� �������
	 */
	public void setMessage(String massage){
		this.message = massage;
	}
	
	/**
	 * ���������� ���� � ����� �������
	 */
	public void setDataTime(DateTime dateTime){
		this.dateTime = dateTime;
	}
	
	/**
	 * ���������� ��� �������
	 */
	public void setType(TypeEvent typeEvent){
		this.typeEvent = typeEvent;
	}
	
	/**
	 * ���������� id ������ �������
	 */
	public void setIdAuthor(int idAuthor){
		this.idAuthor = idAuthor;
	}
	
	/**
	 * ���������� id ������� ��� ������� ���� ��������� �������
	 */
	public void setIdPassport(int idPassport){
		this.idPassport = idPassport;
	}
	
	/**
	 * �������� id �������
	 */
	public int getId(){
		return id;
	}
	
	/**
	 * �������� ��������� �������
	 */
	public String getMessage(){
		return message;
	}
	
	/**
	 * �������� ���� � ����� �������
	 */
	public DateTime getDataTime(){
		return dateTime;
	}
	
	/**
	 * ��������� ����� �������
	 */
	public LocalDate getTime(){
		return dateTime.toLocalDate();
	}
	
	/**
	 * �������� ��� �������
	 */
	public TypeEvent getTypeEvent(){
		return typeEvent;
	}
	
	/**
	 * �������� ��� ������� (�������)
	 */
	public String getType(){
		return typeEvent.getType();
	}
	
	/**
	 * �������� id ������ �������
	 */
	public int getIdAothor(){
		return idAuthor;
	}
	
	/**
	 * �������� id ������� ��� ������� ���� ��������� �������
	 */
	public int getIdPassport(){
		return idPassport;
	}

	/**
	 * �������� ����� �������
	 * @return - ����� 
	 */
	public Owner getAuther() {
		return auther;
	}

	/**
	 * ���������� ������ �������
	 * @param auther - �����
	 */
	public void setAuther(Owner auther) {
		this.auther = auther;
	}

	/**
	 * �������� ������� ��� �������� ������� �������
	 * @return - �������
	 */
	public Passport getPassport() {
		return passport;
	}

	/**
	 * �������� id ������
	 * @return - id ������
	 */
	public int getIdAuthor() {
		return idAuthor;
	}
	
	private void createMessage(){
		this.message = "����������� \"" +this.nameAuthor+ "\" (id = " + this.idAuthor + ") " +typeEvent.getWorldForMassege()+ " ���� � id = " +this.idPassport;
	}
	

}
