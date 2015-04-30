package ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices;

import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.passport.Passport;
import java.util.List;
import java.util.Map;

public interface DAO {
	
	/*
	 * Создание владельца
	 */
	public void createOwner(Owner owner);
	
	/*
	 * Удаление владельца
	 */
	public void deleteOwner(int idOwner);
	
	/*
	 * Редактировать владельца
	 */
	public void editOwner(Owner owner);
	
	/*
	 * Просмотреть владельца
	 */
	public Owner reviewOwner(int idOwner);
	
	
	/*
	 * Создание паспорта
	 */
	public void createPassport(Passport passport);
	
	/*
	 * Удаление паспорта
	 */
	public void deletePassport(int idPassport);
	
	/*
	 * Редактирование паспорта
	 */
	public void editFieldsPassport(Passport passport);
	
	/*
	 * Просмотр паспорта
	*/
	public Passport reviewPassport(int idPassport);
	
	/*
	 * Просмотр всех пасспортов
	 */
	public List<Passport> reviewAllPassports();
	
	/*
	 * Поиск паспорта
	 */
	public List<Passport> findPassports(Map<String,String> info);
	
}
