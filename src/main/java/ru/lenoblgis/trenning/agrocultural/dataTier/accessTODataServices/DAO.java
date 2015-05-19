package ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.actionEvent.PassportEvent;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.passport.Passport;

public interface DAO extends Serializable{
	
	/**
	 * �������� ���������
	 */
	void createOwner(Owner owner);
	
	/**
	 * �������� ���������
	 */
	void deleteOwner(int idOwner);
	
	/**
	 * ������������� ���������
	 */
	void editOwner(Owner owner);
	
	/**
	 * ����������� ���������
	 */
	Owner reviewOwner(int idOwner);
	
	
	/**
	 * �������� ��������
	 */
	void createPassport(Passport passport);
	
	/**
	 * �������� ��������
	 */
	void deletePassport(int idPassport);
	
	/**
	 * �������������� ��������
	 */
	void editPassport(Passport passport);
	
	/**
	 * �������� ��������
	*/
	Passport reviewPassport(int idPassport);
	
	/**
	 * �������� ���� ����������
	 */
	List<Passport> reviewAllPassports();
	
	/**
	 * ����� ��������
	 */
	List<Passport> findPassports(Map<String,String> info);
	
	/**
	 * ����������� ��� ������ �� ������� ������� � ��
	 * @return - ������ �������� �������
	 */
	List<PassportEvent> reviewAllPassportEvent();
	
	/**
	 * �������� ������ ������� �� ��
	 * @param idEvent - id ���������� �������
	 */
	public void deletePassportEvent(int idEvent);
	
	/**
	 * ����������� ��� ������ �� ������� ������� � ��, ������������� ������ ���������
	 * @param idOwner - id ���������
	 * @return
	 */
	List<PassportEvent> reviewAllOwnerEvents(int idOwner);
	
}
