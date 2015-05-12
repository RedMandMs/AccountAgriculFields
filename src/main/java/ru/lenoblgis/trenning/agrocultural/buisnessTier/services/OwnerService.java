package ru.lenoblgis.trenning.agrocultural.buisnessTier.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Component;

import ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.AdminSpringDAO;
import ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.DAO;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.organization.Organization;

@Component("organizationService")
public class OwnerService {

	/**
	 * DAO для работы с базой данных
	 */
	DAO dao = new AdminSpringDAO();
	
	/**
	 * Добавить нового владельца в БД
	 * @param info - информация о добавляемом владельце("name" - имя организации, inn - ИНН, address_org - адрес организации)
 	 * @return - результаты работы ("success" - успешено ли был добавлен владелец)
	 */
	public Map<String, String> createOwner(Map<String, String> info){
		Map<String, String> workresults = new HashMap<String, String>();
		
		String nameOrg = info.get("name");
		Integer inn = Integer.valueOf(info.get("inn"));
		String addresOrg = info.get("address_org");
		Owner newOwner = new Organization(nameOrg, inn, addresOrg);
		try{
			dao.createOwner(newOwner);
			workresults.put("success", "true");
		}catch(DuplicateKeyException duplicateEx){
			//TODO:
			System.out.println("Дубликаты!!!");
			workresults.put("success", "false");
		}
		
		return workresults;
	}
	
	
	/**
	 * Редактировать владельца
	 * @param info - информация о редактируемром владельце("id" - id владельца, "name" - имя организации, inn - ИНН, address_org - адрес организации)
 	 * @return - результаты работы ("success" - успешено ли был отредактирован владелец)
	 */
	public Map<String, String> editOwner(Map<String, String> info){
		Map<String, String> workresults = new HashMap<String, String>();
		
		Integer id = Integer.valueOf(info.get("id"));
		String nameOrg = info.get("name");
		Integer inn = Integer.valueOf(info.get("inn"));
		String addresOrg = info.get("address_org");
		Owner editingOwner = new Organization(id, nameOrg, inn, addresOrg);
		try{
			dao.editOwner(editingOwner);
			workresults.put("success", "true");
		}catch(DuplicateKeyException duplicateEx){
			//TODO:
			System.out.println("Дубликаты!!!");
			workresults.put("success", "false");
		}
		
		return workresults;
	}
	
	/**
	 * Просмотреть владельца
	 * @param ownerId - id владельца
	 * @return - информация о просматриваемом владельце ("isExist" - существует ли такой владелец, "id" - id владельца, "name" - имя организации, inn - ИНН, address_org - адрес организации)
	 */
	public Map<String, String> reviewOwner(int ownerId){
		Map<String, String> ownerInfo = new HashMap<String, String>();
		
		try{
			Owner reviewOwner = dao.reviewOwner(ownerId);
			ownerInfo.put("id", String.valueOf(reviewOwner.getId()));
			ownerInfo.put("name", reviewOwner.getName());
			ownerInfo.put("inn", String.valueOf(reviewOwner.getINN()));
			ownerInfo.put("address_org", reviewOwner.getAddres());
			ownerInfo.put("isExist", "true");
		}
		catch (IndexOutOfBoundsException ex) {
			ownerInfo.put("isExist", "false");
		}
		
		return ownerInfo;
	}
	
	/**
	 * Удалить владельца
	 * @param ownerId - id владельца
	 * @return - результаты работы ("success" - успешено ли был удалён владелец)
	 */
	public Map<String, String> deleteOwner(int ownerId){
		Map<String, String> workresults = new HashMap<String, String>();
		try{
			dao.reviewOwner(ownerId);
			dao.deleteOwner(ownerId);
			workresults.put("success", "true");
		}
		catch (IndexOutOfBoundsException ex) {
			workresults.put("success", "false");
		}
		return workresults;
	}
		
}
