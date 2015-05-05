package ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.passport;

public enum TypeField {
	
	FARM("‘ермерское хоз€йство"),
	AGROCULTURAL("—ельскохоз€йственное производство"),
	COLLECTIVE_FARM(" ресть€нское хоз€йство");
	
	private TypeField(String type) {
		this.type = type;
	}
	
	public static TypeField getType(String title){
		TypeField[] values = TypeField.values();
		for (int i = 0; i < values.length; i++) {
			if(title.equals(values[i].type)) return values[i];
		}
		return null;
	}

	String type;

}
