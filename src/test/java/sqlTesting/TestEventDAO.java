import org.junit.Ignore;
import org.junit.Test;

import ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.AdminSpringDAO;
import ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.DAO;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.actionEvent.PassportEvent;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.organization.Organization;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.passport.Passport;

/**
 * Тестирование добавления события в базу данных
 * @author Vilgodskiy
 *
 */
public class TestEventDAO {
	
	/**
	 * Создание паспорта
	 */
	@Test
	@Ignore
	public void testAddEventCreateToDB() {
		DAO dao = new AdminSpringDAO();
		
		Passport passport = new Passport(574, 8, "Всеволожский р-н", "13", 25, "Фермерское хозяйство", null);
		dao.createPassport(passport);
		System.out.println();
	}
	
	/**
	 * Удаление паспорта
	 */
	@Test
	@Ignore
	public void testAddEventDeleteToDB() {
		DAO dao = new AdminSpringDAO();
		
		dao.deletePassport(27);
		System.out.println();
	}
	
	/**
	 * Редактирование паспорта
	 */
	@Test
	@Ignore
	public void testAddEventEditToDB() {
		DAO dao = new AdminSpringDAO();
		
		Passport passport = new Passport(25, 8, "Приземский р-н", "14", 25, "Фермерское хозяйство", "New Comment");
		dao.editPassport(passport);
		System.out.println();
	}
	
	@Test
	public void testDeleteEventToDB(){
		
		AdminSpringDAO dao = new AdminSpringDAO();
		dao.deletePassportEvent(6);
	}

}
