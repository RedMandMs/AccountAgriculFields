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
	 * ѕрив€зка паспорта к событию и установление id пасспорта и автора (без запроса к базе данных - без ссылки на объекты, без имени)
	 * @param passport - паспорт над которым совершаетс€ событие
	 */
	private void setIdPassportandAothor(Passport passport) {
		this.passport = passport;
		this.idPassport = passport.getID();
		this.idAuthor = passport.getIdOwner();
	}
	
	/**
	 * ”становить паспорт и автора событи€ и все формирующиес€ от них пол€ (с запросом к базе данных)
	 * @param passport - паспорт над которым совершаетс€ событие
	 */
	private void setPassportandAothor(Passport passport, DAO dao) {
		this.passport = passport;
		this.idPassport = passport.getID();
		this.idAuthor = passport.getIdOwner();
		this.auther = dao.reviewOwner(idAuthor);
		this.nameAuthor = auther.getName();
	}
	
	/**
	 * ”становить id событи€
	 */
	public void setId(int id){
		this.id = id;
	}
	
	/**
	 * ”становить сообщение событи€
	 */
	public void setMessage(String massage){
		this.message = massage;
	}
	
	/**
	 * ”становить дату и врем€ событи€
	 */
	public void setDataTime(DateTime dateTime){
		this.dateTime = dateTime;
	}
	
	/**
	 * ”становить тип событи€
	 */
	public void setType(TypeEvent typeEvent){
		this.typeEvent = typeEvent;
	}
	
	/**
	 * ”становить id автора событи€
	 */
	public void setIdAuthor(int idAuthor){
		this.idAuthor = idAuthor;
	}
	
	/**
	 * ”становить id паспорт над которым было совершино событие
	 */
	public void setIdPassport(int idPassport){
		this.idPassport = idPassport;
	}
	
	/**
	 * ѕолучить id событи€
	 */
	public int getId(){
		return id;
	}
	
	/**
	 * ѕолучить сообщение событи€
	 */
	public String getMessage(){
		return message;
	}
	
	/**
	 * ѕолучить дату и врем€ событи€
	 */
	public DateTime getDataTime(){
		return dateTime;
	}
	
	/**
	 * ѕролучить врем€ событи€
	 */
	public LocalDate getTime(){
		return dateTime.toLocalDate();
	}
	
	/**
	 * ѕолучить тип событи€
	 */
	public TypeEvent getTypeEvent(){
		return typeEvent;
	}
	
	/**
	 * ѕолучить тип событи€ (словами)
	 */
	public String getType(){
		return typeEvent.getType();
	}
	
	/**
	 * ѕолучить id автора событи€
	 */
	public int getIdAothor(){
		return idAuthor;
	}
	
	/**
	 * ѕолучить id паспорт над которым было совершино событие
	 */
	public int getIdPassport(){
		return idPassport;
	}

	/**
	 * ѕолучить автор событи€
	 * @return - автор 
	 */
	public Owner getAuther() {
		return auther;
	}

	/**
	 * ”становить автора событи€
	 * @param auther - автор
	 */
	public void setAuther(Owner auther) {
		this.auther = auther;
	}

	/**
	 * ѕолучить паспорт дл€ которого создано событие
	 * @return - паспорт
	 */
	public Passport getPassport() {
		return passport;
	}

	/**
	 * ѕолучить id автора
	 * @return - id автора
	 */
	public int getIdAuthor() {
		return idAuthor;
	}
	
	private void createMessage(){
		this.message = "ќрганизаци€ \"" +this.nameAuthor+ "\" (id = " + this.idAuthor + ") " +typeEvent.getWorldForMassege()+ " поле с id = " +this.idPassport;
	}
	

}
