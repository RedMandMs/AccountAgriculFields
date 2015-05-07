package ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.actionEvent;

public enum TypeEvent {
	
	ADDITION("Добавление поля", "Добавила"),
	DELETION("Удаление поля", "Удалила"),
	EDITION("Редактирование поля", "Отредактировала"),
	REVIEW("Просмотр поля", "Просмотрела");
	
	TypeEvent(String type, String worldForMassege){
		this.type = type;
		this.worldForMassege = worldForMassege;
	}
	
	/**
	 * Тип события
	 */
	private String type;

	
	/**
	 * Слово для добавление в текст события
	 */
	private String worldForMassege;
	
	/**
	 * Получить тип события
	 * @return - тип события
	 */
	public String getType() {
		return type;
	}

	public String getWorldForMassege() {
		return worldForMassege;
	}
	
	

}
