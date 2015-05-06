package ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.passport;

/**
 * Перечисление 
 * @author Vilgodskiy
 *
 */
public enum RegionField {
	
	VSEVOLOGSK("Всеволожский р-н"),
	PRIZEMSK("Приземский р-н");
	
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

	/**
	 * Имя региона
	 */
	private String region;

	/**
	 * Получить название региона
	 * @return - название региона
	 */
	public String getRegion() {
		return region;
	}

}
