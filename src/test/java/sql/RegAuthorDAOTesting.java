package sql;

import org.junit.Test;

import ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.AdminSpringDAO;

/**
 * Тестирование работы с таблицей пользователей в БД
 * @author Сергей
 *
 */
public class RegAuthorDAOTesting {

	/**
	 * Создание пользователя в базе данных
	 */
	@Test
	public void testCreatingUser(){
		AdminSpringDAO dao = new AdminSpringDAO();
		dao.registration("Sergey", "lenoblgis", 30);
	}
	
	
	/**
	 * Авторизация пользователя
	 */
	@Test
	public void testReviewUser(){
		AdminSpringDAO dao = new AdminSpringDAO();
		dao.registration("Sergey", "lenoblgis", 30);
	}
}
