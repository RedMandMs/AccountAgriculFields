package ru.lenoblgis.trenning.agrocultural.buisnessTier.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class PassportService {
	
	/**
	 * ƒобавить новый пасспорт в Ѕƒ
	 * @param info - информаци€ о добавл€емом паспорте("id_organization" - id организации, region - регион, cadastr_number - кадастровый номер, area - площадь, type_field - тип пол€, comment - комментарий)
 	 * @return - результаты работы ("success" - успешено ли был добавлен паспорт)
	 */
	public Map<String, String> createPassport(Map<String, String> info){
		Map<String, String> workresults = new HashMap<String, String>();
		
		//TODO
		
		return workresults;
	}
	
	
	/**
	 * –едактировать пасспорт
	 * @param info - информаци€ о редактируемром паспорте("id" - id пасспорта, "id_organization" - id организации, region - регион, cadastr_number - кадастровый номер, area - площадь, type_field - тип пол€, comment - комментарий)
 	 * @return - результаты работы ("success" - успешено ли был отредактирован паспорт)
	 */
	public Map<String, String> editPassport(Map<String, String> info){
		Map<String, String> workresults = new HashMap<String, String>();
		
		//TODO
		
		return workresults;
	}
	
	/**
	 * ѕросмотреть пасспорт
	 * @param passportId - id паспорта
	 * @return - информаци€ о просматриваемом паспорте ("isExist" - существует ли такой пасспорт, "id" - id пасспорта, "id_organization" - id организации, region - регион, cadastr_number - кадастровый номер, area - площадь, type_field - тип пол€, comment - комментарий)
	 */
	public Map<String, String> reviewPassport(int passportId){
		Map<String, String> passportInfo = new HashMap<String, String>();
		
		//TODO
		
		return passportInfo;
	}
	
	/**
	 * ”далить пасспорт
	 * @param passportId - id паспорта
	 * @return - результаты работы ("success" - успешено ли был удалЄн паспорт)
	 */
	public Map<String, String> deletePassport(int passportId){
		Map<String, String> workresults = new HashMap<String, String>();
		
		//TODO
		
		return workresults;
	}
	
	/**
	 * ѕолучение реестра паспортов
	 * @return - список с информацией о каждом пасспорте("id" - id пасспорта, "id_organization" - id организации, region - регион, cadastr_number - кадастровый номер, area - площадь, type_field - тип пол€, comment - комментарий)
	 */
	public List<Map<String, String>> getAllPassport() {
		List<Map<String,String>> listPasportsInfo = new ArrayList<Map<String,String>>();
		
		//TODO
		
		return listPasportsInfo;
	}
	
	/**
	 * ѕоиск паспортов по информации о них
	 * @param info - информаци€ о паспортах, которые нужно найти("id" - id пасспорта, "id_organization" - id организации, region - регион, cadastr_number - кадастровый номер, area - площадь, type_field - тип пол€, comment - комментарий)
	 * @return - список с информацией о каждом найденом паспорте("id" - id пасспорта, "id_organization" - id организации, region - регион, cadastr_number - кадастровый номер, area - площадь, type_field - тип пол€, comment - комментарий)
	 */
	public List<Map<String, String>> findPassports(Map<String, String> info) {
		List<Map<String,String>> listPasportsInfo = new ArrayList<Map<String,String>>();
		
		//TODO
		
		return listPasportsInfo;
	}
	
}
