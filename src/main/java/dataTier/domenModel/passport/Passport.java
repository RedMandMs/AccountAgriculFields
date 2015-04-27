package dataTier.domenModel.passport;


public interface Passport {
	
	/*
	 * Получить id пасспорта
	 */
	public int getID();
	/*
	 * Установить id паспорта
	 */
	public void setID(int id);
	
	/*
	 * Получить id владельца
	 */
	public int getIdOwner();
	/*
	 * Установить id владельца
	 */
	public void setIdOwner(int idOwner);
	
	/*
	 * Получить район паспорта
	 */
	public String getRegion();
	/*
	 * Установить район паспорта
	 */
	public void setRegion(String region);
	
	/*
	 * Получить кадастровый номер паспорта
	 */
	public int getCadastrNumber();
	/*
	 * Установить кадастровый номер паспорта
	 */
	public void setCadastrNumber(int cadastrNumber);
	
	/*
	 * Получить площадь паспорта
	 */
	public double getArea();
	/*
	 * Установить площадь паспорта
	 */
	public void setArea(double area);
	
	/*
	 * Получить тип паспорта
	 */
	public String getType();
	
	/*
	 * Установить тип паспорта
	 */
	public void setType(String type);
	
	/*
	 * Получить комментарий к пасспарту
	 */
	public String getComment();
	/*
	 * Установить комментарий к пасспорту
	 */
	public void setComment(String comment);

}
