package dataTier.domenModel.ActionEvent;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import dataTier.domenModel.owner.Owner;
import dataTier.domenModel.passport.Passport;

public interface PassportEvent {
	
	/*
	 * Получить id события
	 */
	public int getId();
	
	/*
	 * Получить сообщение события
	 */
	public String getMessage();
	
	/*
	 * Записать событие в Log-файл
	 */
	public void writeMessage();
	
	/*
	 * Получить автора события
	 */
	public Owner getAothor();
	
	/*
	 * Получить паспорт над которым было совершино событие
	 */
	public Passport getPassport();
	
	/*
	 * Получить дату и время события
	 */
	public DateTime getDataTime();
	
	/*
	 * Пролучить время события
	 */
	public LocalDate getTime();
	
	/*
	 * Получить дату события
	 */
	public DateTime getData();
	
	/*
	 * Получить тип события
	 */
	public String getType();

}
