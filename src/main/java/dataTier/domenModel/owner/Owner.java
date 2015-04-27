package dataTier.domenModel.owner;

import java.util.List;

import dataTier.domenModel.passport.Passport;

public interface Owner {

	/*
	 * Получить id владельца
	 */
	public int getId();
	
	/*
	 * Установить id владельца
	 */
	public void setId(int id);
	
	/*
	 * Получить имя владельца
	 */
	public String getName();
	
	/*
	 * Установить имя владельца
	 */
	public void setName(String name);

	/*
	 * Получить ИНН владельца
	 */
	public int getINN();
	/*
	 * Установить ИНН владельца
	 */
	public void setINN(int iNN);

	/*
	 * Получить адрес владельца
	 */
	public String getAddres();
	/*
	 * Установить адрес владельца
	 */
	public void setAddres(String addres);

	/*
	 * Получить список поспартов владельца
	 */
	public List<Passport> getFields();
	
	/*
	 * Установить список паспортов владельца
	 */
	public void setFields(List<Passport> fields);
	
}
