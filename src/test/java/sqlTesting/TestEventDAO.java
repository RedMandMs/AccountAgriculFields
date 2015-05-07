import org.junit.Ignore;
import org.junit.Test;

import ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.AdminSpringDAO;
import ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.DAO;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.actionEvent.PassportEvent;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.organization.Organization;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.passport.Passport;

/**
 * ������������ ���������� ������� � ���� ������
 * @author Vilgodskiy
 *
 */
public class TestEventDAO {
	
	/**
	 * �������� ��������
	 */
	@Test
	@Ignore
	public void testAddEventCreateToDB() {
		DAO dao = new AdminSpringDAO();
		
		Passport passport = new Passport(574, 8, "������������ �-�", "13", 25, "���������� ���������", null);
		dao.createPassport(passport);
		System.out.println();
	}
	
	/**
	 * �������� ��������
	 */
	@Test
	@Ignore
	public void testAddEventDeleteToDB() {
		DAO dao = new AdminSpringDAO();
		
		dao.deletePassport(27);
		System.out.println();
	}
	
	/**
	 * �������������� ��������
	 */
	@Test
	@Ignore
	public void testAddEventEditToDB() {
		DAO dao = new AdminSpringDAO();
		
		Passport passport = new Passport(25, 8, "���������� �-�", "14", 25, "���������� ���������", "New Comment");
		dao.editPassport(passport);
		System.out.println();
	}
	
	@Test
	public void testDeleteEventToDB(){
		
		AdminSpringDAO dao = new AdminSpringDAO();
		dao.deletePassportEvent(6);
	}

}
