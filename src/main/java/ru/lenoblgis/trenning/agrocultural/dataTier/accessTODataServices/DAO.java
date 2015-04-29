package ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices;

import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.passport.Passport;
import java.util.List;
import java.util.Map;

public interface DAO {
	
	/*
	 * Создание владельца
	 */
	public void createOwner(Map<String,String> info);
	
	/*
	 * Удаление владельца
	 */
	public void deleteOwner(Map<String,String> info);
	
	/*
	 * Редактировать владельца
	 */
	public void editOwner(Map<String,String> info);
	
	/*
	 * Просмотреть владельца
	 */
	public Owner reviewOwner(Map<String,String> info);
	
	
	/*
	 * Создание паспорта
	 */
	public void createPassport(Map<String,String> info);
	
	/*
	 * Удаление паспорта
	 */
	public void deletePassport(Map<String,String> info);
	
	/*
	 * Редактирование паспорта
	 */
	public void editFieldsPassport(Map<String,String> info);
	
	/*
	 * Просмотр паспорта
	*/
	public Passport reviewPassport(Map<String,String> info);
	
	/*
	 * Просмотр всех пасспортов
	 */
	public List<Passport> reviewAllPassports();
	
	/*
	 * Поиск паспорта
	 */
	public List<Passport> findPassports(Map<String,String> info);
	
}
