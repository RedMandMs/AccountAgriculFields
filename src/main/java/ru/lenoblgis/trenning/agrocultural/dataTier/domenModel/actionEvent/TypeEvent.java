package ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.actionEvent;

public enum TypeEvent {
	
	ADDITION("���������� ����"),
	DELETION("�������� ����"),
	EDITION("�������������� ����"),
	REVIEW("�������� ����");
	
	TypeEvent(String type){
		this.type = type;
	}
	
	String type;

}