package ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.SQLQueries;

import java.util.Map;

public interface SQLQueries {

	/**
	 * �������� ���������
	 */
	public String createOwner();
	
	/**
	 * �������� ���������
	 */
	public String deleteOwner();
	
	/**
	 * ������������� ���������
	 */
	public String editOwner();
	
	/**
	 * ����������� ���������
	 */
	public String reviewOwner();
	
	
	/**
	 * �������� ��������
	 */
	public String createPassport();
	
	/**
	 * �������� ��������
	 */
	public String deletePassport();
	
	/**
	 * �������������� ��������
	 */
	public String editPassport();
	
	/**
	 * �������� ��������
	*/
	public String reviewPassport();
	
	/**
	 * �������� ���� ����������
	 */
	public String reviewAllPassports();
	
	/**
	 * ����� ��������
	 */
	public String findPassports(Map<String,String> info);
	
	/**
	 * ������������ ������ ��� ������� �������
	 * @return - ������ ������� ������� ���������
	 */
	public String createPassportEvent();
	
	/**
	 * ������������ ������ ��� �������� �������
	 * @return - ������ �������� ������� ���������
	 */
	public String deletePassportEvent();
	
	/**
	 * ������������ ������ ��� ������� ���� ������� �������
	 * @return - ������ �� ������� ������� ����������
	 */
	public String reviewAllPassportEvent();
	
	/**
	 * ������������ ������ ��� ������� �������, �������������� ��������� �������������
	 * @return - ������ �� ������� ������� ���������� ���������
	 */
	public String reviwAllOwnerPassportEvent();
	
	/**
	 * ������������ ������ ��� ��������� ������������� id �������� ���������� ������������ � ���������� id
	 * @return - ������
	 */
	public String getMAXidPassportByOwner();
	
}
