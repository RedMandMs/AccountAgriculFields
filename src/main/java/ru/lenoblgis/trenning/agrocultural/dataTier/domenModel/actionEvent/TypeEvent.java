package ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.actionEvent;

public enum TypeEvent {
	
	ADDITION("Добавление поля"),
	DELETION("Удаление поля"),
	EDITION("Редактирование поля"),
	REVIEW("Просмотр поля");
	
	TypeEvent(String type){
		this.type = type;
	}
	
	String type;

}
