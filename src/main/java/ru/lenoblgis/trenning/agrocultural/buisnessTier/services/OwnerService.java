package ru.lenoblgis.trenning.agrocultural.buisnessTier.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OwnerService {

	/**
	 * Добавить нового владельца в БД
	 * @param info - информация о добавляемом владельце("name" - имя организации, inn - ИНН, address_org - адрес организации)
 	 * @return - результаты работы ("success" - успешено ли был добавлен владелец)
	 */
	public Map<String, String> createPassport(Map<String, String> info){
		Map<String, String> workresults = new HashMap<String, String>();
		
		//TODO
		
		return workresults;
	}
	
	
	/**
	 * Редактировать владельца
	 * @param info - информация о редактируемром паспорте("id" - id пасспорта, "id_organization" - id организации, region - регион, cadastr_number - кадастровый номер, area - площадь, type_field - тип поля, comment - комментарий)
 	 * @return - результаты работы ("success" - успешено ли был отредактирован паспорт)
	 */
	public Map<String, String> editPassport(Map<String, String> info){
		Map<String, String> workresults = new HashMap<String, String>();
		
		//TODO
		
		return workresults;
	}
	
	/**
	 * Просмотреть пасспорт
	 * @param passportId - id паспорта
	 * @return - информация о просматриваемом паспорте ("isExist" - существует ли такой пасспорт, "id" - id пасспорта, "id_organization" - id организации, region - регион, cadastr_number - кадастровый номер, area - площадь, type_field - тип поля, comment - комментарий)
	 */
	public Map<String, String> reviewPassport(int passportId){
		Map<String, String> passportInfo = new HashMap<String, String>();
		
		//TODO
		
		return passportInfo;
	}
	
	/**
	 * Удалить пасспорт
	 * @param passportId - id паспорта
	 * @return - результаты работы ("success" - успешено ли был удалён паспорт)
	 */
	public Map<String, String> deletePassport(int passportId){
		Map<String, String> workresults = new HashMap<String, String>();
		
		//TODO
		
		return workresults;
	}
	
	/**
	 * Получение реестра паспортов
	 * @return - список с информацией о каждом пасспорте("id" - id пасспорта, "id_organization" - id организации, region - регион, cadastr_number - кадастровый номер, area - площадь, type_field - тип поля, comment - комментарий)
	 */
	public List<Map<String, String>> getAllPassport() {
		List<Map<String,String>> listPasportsInfo = new ArrayList<Map<String,String>>();
		
		//TODO
		
		return listPasportsInfo;
	}
	
	/**
	 * Поиск паспортов по информации о них
	 * @param info - информация о паспортах, которые нужно найти("id" - id пасспорта, "id_organization" - id организации, region - регион, cadastr_number - кадастровый номер, area - площадь, type_field - тип поля, comment - комментарий)
	 * @return - список с информацией о каждом найденом паспорте("id" - id пасспорта, "id_organization" - id организации, region - регион, cadastr_number - кадастровый номер, area - площадь, type_field - тип поля, comment - комментарий)
	 */
	public List<Map<String, String>> findPassports(Map<String, String> info) {
		List<Map<String,String>> listPasportsInfo = new ArrayList<Map<String,String>>();
		
		//TODO
		
		return listPasportsInfo;
	}
	
}
