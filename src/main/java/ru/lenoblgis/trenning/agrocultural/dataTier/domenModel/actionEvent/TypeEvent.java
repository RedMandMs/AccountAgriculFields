package ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.actionEvent;

public enum TypeEvent {
	
	UNKNOWN("����������", "���������� ��� �������"),
	ADDITION("���������� ����", "��������"),
	DELETION("�������� ����", "�������"),
	EDITION("�������������� ����", "���������������"),
	REVIEW("�������� ����", "�����������");
	
	TypeEvent(String type, String worldForMassege){
		this.type = type;
		this.worldForMassege = worldForMassege;
	}
	
	/**
	 * ��� �������
	 */
	private String type;

	
	/**
	 * ����� ��� ���������� � ����� �������
	 */
	private String worldForMassege;
	
	/**
	 * �������� ��� �������
	 * @return - ��� �������
	 */
	public String getType() {
		return type;
	}

	/**
	 * ��������� �����, ������������� � ��������� ��������� � �������
	 * @return - ����� ��� ���������� ���������
	 */
	public String getWorldForMassege() {
		return worldForMassege;
	}
	
	

}
