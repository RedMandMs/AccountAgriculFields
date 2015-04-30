package ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.actionEvent;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

public class PassportEvent {
	
	private int  id;
	private String message;
	private DateTime dateTime;
	private TypeEvent typeEvent;	
	private int idAuthor;	
	private int idPassport;	
	
	public PassportEvent(){
		
	}
	
	/*
	 * ���������� id �������
	 */
	public void setId(int id){
		this.id = id;
	}
	
	/*
	 * ���������� ��������� �������
	 */
	public void setMessage(String massage){
		this.message = massage;
	}
	
	/*
	 * ���������� ���� � ����� �������
	 */
	public void setDataTime(DateTime dateTime){
		this.dateTime = dateTime;
	}
	
	/*
	 * ���������� ��� �������
	 */
	public void setType(TypeEvent typeEvent){
		this.typeEvent = typeEvent;
	}
	
	/*
	 * ���������� id ������ �������
	 */
	public void setIdAuthor(int idAuthor){
		this.idAuthor = idAuthor;
	}
	
	/*
	 * ���������� id ������� ��� ������� ���� ��������� �������
	 */
	public void setIdPassport(int idPassport){
		this.idPassport = idPassport;
	}
	
	/*
	 * �������� id �������
	 */
	public int getId(){
		return id;
	}
	
	/*
	 * �������� ��������� �������
	 */
	public String getMessage(){
		return message;
	}
	
	/*
	 * �������� ���� � ����� �������
	 */
	public DateTime getDataTime(){
		return dateTime;
	}
	
	/*
	 * ��������� ����� �������
	 */
	public LocalDate getTime(){
		return dateTime.toLocalDate();
	}
	
	/*
	 * �������� ��� �������
	 */
	public TypeEvent getType(){
		return typeEvent;
	}
	
	/*
	 * �������� id ������ �������
	 */
	public int getIdAothor(){
		return idAuthor;
	}
	
	/*
	 * �������� id ������� ��� ������� ���� ��������� �������
	 */
	public int getIdPassport(){
		return idPassport;
	}
	

}
