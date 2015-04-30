package ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices;

import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.passport.Passport;
import java.util.List;
import java.util.Map;

public interface DAO {
	
	/*
	 * �������� ���������
	 */
	public void createOwner(Owner owner);
	
	/*
	 * �������� ���������
	 */
	public void deleteOwner(int idOwner);
	
	/*
	 * ������������� ���������
	 */
	public void editOwner(Owner owner);
	
	/*
	 * ����������� ���������
	 */
	public Owner reviewOwner(int idOwner);
	
	
	/*
	 * �������� ��������
	 */
	public void createPassport(Passport passport);
	
	/*
	 * �������� ��������
	 */
	public void deletePassport(int idPassport);
	
	/*
	 * �������������� ��������
	 */
	public void editFieldsPassport(Passport passport);
	
	/*
	 * �������� ��������
	*/
	public Passport reviewPassport(int idPassport);
	
	/*
	 * �������� ���� ����������
	 */
	public List<Passport> reviewAllPassports();
	
	/*
	 * ����� ��������
	 */
	public List<Passport> findPassports(Map<String,String> info);
	
}
