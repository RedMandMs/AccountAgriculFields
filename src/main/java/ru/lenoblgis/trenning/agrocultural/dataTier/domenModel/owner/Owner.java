package ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner;

import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.passport.Passport;
import java.util.List;

public interface Owner {

	/*
	 * Получить id владельца
	 */
	int getId();
	
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

	
}
