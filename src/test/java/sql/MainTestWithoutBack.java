package sql;
import org.junit.Ignore;
import org.junit.Test;

import ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.AdminSpringDAO;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.organization.Organization;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.passport.Passport;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.passport.RegionField;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.passport.TypeField;



public class MainTestWithoutBack {
	
	/**
	 * Тестирование создания владельца
	 */
	@Test
	@Ignore
	public void testCreateOwner(){
		/*UserSpringDAO userDao = new UserSpringDAO();*/
		AdminSpringDAO adminDao = new AdminSpringDAO();
		
		Owner newOwner = new Organization("LenOblGis2", 1, "Hi");		
		adminDao.createOwner(newOwner);;
	}
	
	/**
	 * Тестирование создания пасспорта
	 */
	@Test
	@Ignore
	public void testCreatePassport(){
		AdminSpringDAO adminDao = new AdminSpringDAO();
		
		Passport newPassport = new Passport(8, RegionField.PRIZEMSK.getRegion(), "21", 30, TypeField.COLLECTIVE_FARM.getType(), "Тест создания пасспорта");
		adminDao.createPassport(newPassport);
		
	}
	
	/**
	 * Тестирование просмотра пасспорта поля
	 */
	@Test
	@Ignore
	public void testReviewPassport(){
		AdminSpringDAO adminDao = new AdminSpringDAO();
		adminDao.reviewPassport(12);		
	}

}
