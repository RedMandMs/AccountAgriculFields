package ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.actionEvent;

import ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.DAO;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.passport.Passport;

public class PassportEvent {
	
	/**
	 * Id события
	 */
	private int  id;
	
	/**
	 * Текстовое сообщение события
	 */
	private String message;
	
	/**
	 * Дата и время события
	 */
	private DateTime dateTime;
	
	/**
	 * Тип события
	 */
	private TypeEvent typeEvent;	
	
	/**
	 * ID автора события
	 */
	private int idAuthor;
	
	/**
	 * Имя автора события (название организации)
	 */
	private String nameAuthor;
	
	/**
	 * Автор события
	 */
	private Owner auther;
	
	/**
	 * ID паспорта, над которым было совершено событие
	 */
	private int idPassport;
	
	/**
	 * Паспорт, над которым было совершено событие
	 */
	private Passport passport;
	
	/**
	 * Конструктор по-умолчанию
	 */
	public PassportEvent(){
		this.typeEvent = TypeEvent.UNKNOWN;
		createMessage();
	}
	
	/**
	 * Конструктор используемый при создании события, перед помещением его в БД
	 * @param passport - паспорт, над которым совершается событие
	 * @param eventType - Тип события (Имя константы в перечислениях)
	 * @param dao - DAO создающий данное событие (нужен для считывания из БД автора события)
	 */
	public PassportEvent(Passport passport, String eventType, DAO dao){
		setPassportandAothor(passport, dao);
		setType(TypeEvent.valueOf(eventType));
	}
	
	/**
	 * Установить паспорт и автора события и все формирующиеся от них поля (с запросом к базе данных)
	 * @param passport - паспорт над которым совершается событие
	 */
	private void setPassportandAothor(Passport passport, DAO dao) {
		this.passport = passport;
		this.idPassport = passport.getID();
		this.idAuthor = passport.getIdOwner();
		this.auther = dao.reviewOwner(idAuthor);
		this.nameAuthor = auther.getName();
		createMessage();
	}
	
	/**
	 * Установить id события
	 */
	public void setId(int id){
		this.id = id;
	}
	
	/**
	 * Установить сообщение события
	 */
	public void setMessage(String massage){
		this.message = massage;
	}
	
	/**
	 * Установить дату и время события
	 */
	public void setDataTime(DateTime dateTime){
		this.dateTime = dateTime;
	}
	
	/**
	 * Установить тип события
	 */
	public void setType(TypeEvent typeEvent){
		this.typeEvent = typeEvent;
	}
	
	/**
	 * Установить id автора события
	 */
	public void setIdAuthor(int idAuthor){
		this.idAuthor = idAuthor;
	}
	
	/**
	 * Установить id паспорт над которым было совершино событие
	 */
	public void setIdPassport(int idPassport){
		this.idPassport = idPassport;
	}
	
	/**
	 * Получить id события
	 */
	public int getId(){
		return id;
	}
	
	/**
	 * Получить сообщение события
	 */
	public String getMessage(){
		return message;
	}
	
	/**
	 * Получить дату и время события
	 */
	public DateTime getDataTime(){
		return dateTime;
	}
	
	/**
	 * Пролучить время события
	 */
	public LocalDate getTime(){
		return dateTime.toLocalDate();
	}
	
	/**
	 * Получить тип события
	 */
	public TypeEvent getTypeEvent(){
		return typeEvent;
	}
	
	/**
	 * Получить тип события (словами)
	 */
	public String getType(){
		return typeEvent.getType();
	}
	
	/**
	 * Получить id автора события
	 */
	public int getIdAothor(){
		return idAuthor;
	}
	
	/**
	 * Получить id паспорт над которым было совершино событие
	 */
	public int getIdPassport(){
		return idPassport;
	}

	/**
	 * Получить автор события
	 * @return - автор 
	 */
	public Owner getAuther() {
		return auther;
	}

	/**
	 * Установить автора события
	 * @param auther - автор
	 */
	public void setAuther(Owner auther) {
		this.auther = auther;
	}

	/**
	 * Получить паспорт для которого создано событие
	 * @return - паспорт
	 */
	public Passport getPassport() {
		return passport;
	}

	/**
	 * Получить id автора
	 * @return - id автора
	 */
	public int getIdAuthor() {
		return idAuthor;
	}
	
	/**
	 * Создание текстового сообщения события
	 */
	private void createMessage(){
		this.message = "Организация \"" +this.nameAuthor+ "\" (id = " + this.idAuthor + ") " +typeEvent.getWorldForMassege()+ " поле с id = " +this.idPassport;
	}
	

}
