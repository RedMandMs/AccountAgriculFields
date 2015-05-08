package ru.lenoblgis.trenning.agrocultural.buisnessTier.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class PassportService {
	
	/**
	 * �������� ����� �������� � ��
	 * @param info - ���������� � ����������� ��������("id_organization" - id �����������, region - ������, cadastr_number - ����������� �����, area - �������, type_field - ��� ����, comment - �����������)
 	 * @return - ���������� ������ ("success" - �������� �� ��� �������� �������)
	 */
	public Map<String, String> createPassport(Map<String, String> info){
		Map<String, String> workresults = new HashMap<String, String>();
		
		//TODO
		
		return workresults;
	}
	
	
	/**
	 * ������������� ��������
	 * @param info - ���������� � �������������� ��������("id" - id ���������, "id_organization" - id �����������, region - ������, cadastr_number - ����������� �����, area - �������, type_field - ��� ����, comment - �����������)
 	 * @return - ���������� ������ ("success" - �������� �� ��� �������������� �������)
	 */
	public Map<String, String> editPassport(Map<String, String> info){
		Map<String, String> workresults = new HashMap<String, String>();
		
		//TODO
		
		return workresults;
	}
	
	/**
	 * ����������� ��������
	 * @param passportId - id ��������
	 * @return - ���������� � ��������������� �������� ("isExist" - ���������� �� ����� ��������, "id" - id ���������, "id_organization" - id �����������, region - ������, cadastr_number - ����������� �����, area - �������, type_field - ��� ����, comment - �����������)
	 */
	public Map<String, String> reviewPassport(int passportId){
		Map<String, String> passportInfo = new HashMap<String, String>();
		
		//TODO
		
		return passportInfo;
	}
	
	/**
	 * ������� ��������
	 * @param passportId - id ��������
	 * @return - ���������� ������ ("success" - �������� �� ��� ����� �������)
	 */
	public Map<String, String> deletePassport(int passportId){
		Map<String, String> workresults = new HashMap<String, String>();
		
		//TODO
		
		return workresults;
	}
	
	/**
	 * ��������� ������� ���������
	 * @return - ������ � ����������� � ������ ���������("id" - id ���������, "id_organization" - id �����������, region - ������, cadastr_number - ����������� �����, area - �������, type_field - ��� ����, comment - �����������)
	 */
	public List<Map<String, String>> getAllPassport() {
		List<Map<String,String>> listPasportsInfo = new ArrayList<Map<String,String>>();
		
		//TODO
		
		return listPasportsInfo;
	}
	
	/**
	 * ����� ��������� �� ���������� � ���
	 * @param info - ���������� � ���������, ������� ����� �����("id" - id ���������, "id_organization" - id �����������, region - ������, cadastr_number - ����������� �����, area - �������, type_field - ��� ����, comment - �����������)
	 * @return - ������ � ����������� � ������ �������� ��������("id" - id ���������, "id_organization" - id �����������, region - ������, cadastr_number - ����������� �����, area - �������, type_field - ��� ����, comment - �����������)
	 */
	public List<Map<String, String>> findPassports(Map<String, String> info) {
		List<Map<String,String>> listPasportsInfo = new ArrayList<Map<String,String>>();
		
		//TODO
		
		return listPasportsInfo;
	}
	
}
