package ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.actionEvent;

import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.passport.Passport;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

public interface PassportEvent {
	
	/*
	 * �������� id �������
	 */
	public int getId();
	
	/*
	 * �������� ��������� �������
	 */
	public String getMessage();
	
	/*
	 * �������� ������� � Log-����
	 */
	public void writeMessage();
	
	/*
	 * �������� ������ �������
	 */
	public Owner getAothor();
	
	/*
	 * �������� ������� ��� ������� ���� ��������� �������
	 */
	public Passport getPassport();
	
	/*
	 * �������� ���� � ����� �������
	 */
	public DateTime getDataTime();
	
	/*
	 * ��������� ����� �������
	 */
	public LocalDate getTime();
	
	/*
	 * �������� ���� �������
	 */
	public DateTime getData();
	
	/*
	 * �������� ��� �������
	 */
	public String getType();
	
	/*
	 * �������� id ������ �������
	 */
	public int getIdAothor();
	
	/*
	 * �������� id ������� ��� ������� ���� ��������� �������
	 */
	public int getIdPassport();
	

}
