package ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner;

import java.io.Serializable;


public interface Owner extends Serializable{

	/**
	 * �������� id ���������
	 */
	int getId();
	
	/**
	 * ���������� id ���������
	 */
	public void setId(int id);
	
	/**
	 * �������� ��� ���������
	 */
	public String getName();
	
	/**
	 * ���������� ��� ���������
	 */
	public void setName(String name);

	/**
	 * �������� ��� ���������
	 */
	public int getINN();
	/**
	 * ���������� ��� ���������
	 */
	public void setINN(int iNN);

	/**
	 * �������� ����� ���������
	 */
	public String getAddres();
	/**
	 * ���������� ����� ���������
	 */
	public void setAddres(String addres);

	
}
