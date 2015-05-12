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
	 * DAO ��� ������ � ����� ������
	 */
	DAO dao = new AdminSpringDAO();
	
	/**
	 * �������� ������ ��������� � ��
	 * @param info - ���������� � ����������� ���������("name" - ��� �����������, inn - ���, address_org - ����� �����������)
 	 * @return - ���������� ������ ("success" - �������� �� ��� �������� ��������)
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
			System.out.println("���������!!!");
			workresults.put("success", "false");
		}
		
		return workresults;
	}
	
	
	/**
	 * ������������� ���������
	 * @param info - ���������� � �������������� ���������("id" - id ���������, "name" - ��� �����������, inn - ���, address_org - ����� �����������)
 	 * @return - ���������� ������ ("success" - �������� �� ��� �������������� ��������)
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
			System.out.println("���������!!!");
			workresults.put("success", "false");
		}
		
		return workresults;
	}
	
	/**
	 * ����������� ���������
	 * @param ownerId - id ���������
	 * @return - ���������� � ��������������� ��������� ("isExist" - ���������� �� ����� ��������, "id" - id ���������, "name" - ��� �����������, inn - ���, address_org - ����� �����������)
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
	 * ������� ���������
	 * @param ownerId - id ���������
	 * @return - ���������� ������ ("success" - �������� �� ��� ����� ��������)
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
