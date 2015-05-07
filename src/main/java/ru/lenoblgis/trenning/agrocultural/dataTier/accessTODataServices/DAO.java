package ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices;

import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.passport.Passport;
import java.util.List;
import java.util.Map;

public interface DAO {
	
	/**
	 * Создание владельца
	 */
	void createOwner(Owner owner);
	
	/**
	 * Удаление владельца
	 */
	void deleteOwner(int idOwner);
	
	/**
	 * Редактировать владельца
	 */
	void editOwner(Owner owner);
	
	/**
	 * Просмотреть владельца
	 */
	Owner reviewOwner(int idOwner);
	
	
	/**
	 * Создание паспорта
	 */
	void createPassport(Passport passport);
	
	/**
	 * Удаление паспорта
	 */
	void deletePassport(int idPassport);
	
	/**
	 * Редактирование паспорта
	 */
	void editPassport(Passport passport);
	
	/**
	 * Просмотр паспорта
	*/
	Passport reviewPassport(int idPassport);
	
	/**
	 * Просмотр всех пасспортов
	 */
	List<Passport> reviewAllPassports();
	
	/**
	 * Поиск паспорта
	 */
	List<Passport> findPassports(Map<String,String> info);
	
	
}
