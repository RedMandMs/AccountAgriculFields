package ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices;

import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.passport.Passport;
import java.util.List;
import java.util.Map;

public interface DAO {
	
	/*
	 * �������� ���������
	 */
	public void createOwner(Map<String,String> info);
	
	/*
	 * �������� ���������
	 */
	public void deleteOwner(Map<String,String> info);
	
	/*
	 * ������������� ���������
	 */
	public void editOwner(Map<String,String> info);
	
	/*
	 * ����������� ���������
	 */
	public Owner reviewOwner(Map<String,String> info);
	
	
	/*
	 * �������� ��������
	 */
	public void createPassport(Map<String,String> info);
	
	/*
	 * �������� ��������
	 */
	public void deletePassport(Map<String,String> info);
	
	/*
	 * �������������� ��������
	 */
	public void editFieldsPassport(Map<String,String> info);
	
	/*
	 * �������� ��������
	*/
	public Passport reviewPassport(Map<String,String> info);
	
	/*
	 * �������� ���� ����������
	 */
	public List<Passport> reviewAllPassports();
	
	/*
	 * ����� ��������
	 */
	public List<Passport> findPassports(Map<String,String> info);
	
}
