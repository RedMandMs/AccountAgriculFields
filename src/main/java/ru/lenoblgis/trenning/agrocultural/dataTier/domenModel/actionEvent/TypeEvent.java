package ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.actionEvent;

public enum TypeEvent {
	
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

	public String getWorldForMassege() {
		return worldForMassege;
	}
	
	

}
