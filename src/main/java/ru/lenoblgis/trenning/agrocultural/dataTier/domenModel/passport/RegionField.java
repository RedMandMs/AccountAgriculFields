package ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.passport;

public enum RegionField {
	
	VSEVOLOGSK("������������ �-�"),
	PRIZEMSK("���������� �-�");
	
	private RegionField(String region){
		this.region = region;
	}
	
	public static RegionField getRegion(String title){
		RegionField[] values = RegionField.values();
		for (int i = 0; i < values.length; i++) {
			if(title.equals(values[i].region)) return values[i];
		}
		return null;
	}

	String region;

}