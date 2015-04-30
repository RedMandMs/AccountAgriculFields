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
	 * Установить id события
	 */
	public void setId(int id){
		this.id = id;
	}
	
	/*
	 * Установить сообщение события
	 */
	public void setMessage(String massage){
		this.message = massage;
	}
	
	/*
	 * Установить дату и время события
	 */
	public void setDataTime(DateTime dateTime){
		this.dateTime = dateTime;
	}
	
	/*
	 * Установить тип события
	 */
	public void setType(TypeEvent typeEvent){
		this.typeEvent = typeEvent;
	}
	
	/*
	 * Установить id автора события
	 */
	public void setIdAuthor(int idAuthor){
		this.idAuthor = idAuthor;
	}
	
	/*
	 * Установить id паспорт над которым было совершино событие
	 */
	public void setIdPassport(int idPassport){
		this.idPassport = idPassport;
	}
	
	/*
	 * Получить id события
	 */
	public int getId(){
		return id;
	}
	
	/*
	 * Получить сообщение события
	 */
	public String getMessage(){
		return message;
	}
	
	/*
	 * Получить дату и время события
	 */
	public DateTime getDataTime(){
		return dateTime;
	}
	
	/*
	 * Пролучить время события
	 */
	public LocalDate getTime(){
		return dateTime.toLocalDate();
	}
	
	/*
	 * Получить тип события
	 */
	public TypeEvent getType(){
		return typeEvent;
	}
	
	/*
	 * Получить id автора события
	 */
	public int getIdAothor(){
		return idAuthor;
	}
	
	/*
	 * Получить id паспорт над которым было совершино событие
	 */
	public int getIdPassport(){
		return idPassport;
	}
	

}
