package ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner;


public interface Owner {

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
