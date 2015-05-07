package ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.SQLQueries;

import java.util.Map;

public interface SQLQueries {

	/**
	 * Создание владельца
	 */
	public String createOwner();
	
	/**
	 * Удаление владельца
	 */
	public String deleteOwner();
	
	/**
	 * Редактировать владельца
	 */
	public String editOwner();
	
	/**
	 * Просмотреть владельца
	 */
	public String reviewOwner();
	
	
	/**
	 * Создание паспорта
	 */
	public String createPassport();
	
	/**
	 * Удаление паспорта
	 */
	public String deletePassport();
	
	/**
	 * Редактирование паспорта
	 */
	public String editPassport();
	
	/**
	 * Просмотр паспорта
	*/
	public String reviewPassport();
	
	/**
	 * Просмотр всех пасспортов
	 */
	public String reviewAllPassports();
	
	/**
	 * Поиск паспорта
	 */
	public String findPassports(Map<String,String> info);
	
	/**
	 * Сформировать запрос для вставки события
	 * @return - запрос вставки события пасспорта
	 */
	public String createPassportEvent();
	
	/**
	 * Сформировать запрос для выборки событий
	 * @return - запрос на выборку событий пасспортов
	 */
	public String reviewAllPassportEvent();
	
	/**
	 * Сформировать запрос для получения максимального id паспорта созданного организацией с переданным id
	 * @return - запрос
	 */
	public String getMAXidPassportByOwner();
	
}
