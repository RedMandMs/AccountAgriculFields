package dataTier.accessToDataServices.fields.SQLQueries;

import java.util.Map;

public interface SQLQueries {

	/*
	 * Создание владельца
	 */
	public String createOwner();
	
	/*
	 * Удаление владельца
	 */
	public String deleteOwner();
	
	/*
	 * Редактировать владельца
	 */
	public String editOwner(Map<String,String> info);
	
	/*
	 * Просмотреть владельца
	 */
	public String reviewOwner();
	
	
	
	/*
	 * Создание паспорта
	 */
	public String createPassport();
	
	/*
	 * Удаление паспорта
	 */
	public String deletePassport();
	
	/*
	 * Редактирование паспорта
	 */
	public String editFieldsPassport(Map<String,String> info);
	
	/*
	 * Просмотр паспорта
	*/
	public String reviewPassport();
	
	/*
	 * Просмотр всех пасспортов
	 */
	public String reviewAllPassports();
	
	/*
	 * Поиск паспорта
	 */
	public String findPassports(Map<String,String> info);
	
}
