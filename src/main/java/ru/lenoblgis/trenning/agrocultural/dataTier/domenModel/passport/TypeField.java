package ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.passport;

public enum TypeField {
	
	FARM("���������� ���������"),
	AGROCULTURAL("�������������������� ������������"),
	COLLECTIVE_FARM("������������ ���������");
	
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

	/**
	 * ��� ���� (�������)
	 */
	private String type;

	/**
	 * �������� ��� ����
	 * @return - ��� ���� (�������)
	 */
	public String getType() {
		return type;
	}

}
