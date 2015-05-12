import org.junit.Test;

import ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.AdminSpringDAO;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.Owner;
import ru.lenoblgis.trenning.agrocultural.dataTier.domenModel.owner.organization.Organization;



public class MainTestWithoutBack {
	
	@Test
	public void testCreateOwner(){
		/*UserSpringDAO userDao = new UserSpringDAO();*/
		AdminSpringDAO adminDao = new AdminSpringDAO();
		
		Owner newOwner = new Organization("LenOblGis3", 12345, "Hi");		
		adminDao.reviewOwner(9);
		System.out.println("Hi\1");
		adminDao.deleteOwner(9);
		System.out.println("Hi\2");
		/*Map<String, String> infoPassport = new HashMap<String, String>();
		infoPassport.put("id_organization", "7");
		infoPassport.put("region", "Vsevologskiy");
		infoPassport.put("cadastr_number", "123546");
		infoPassport.put("area", "50");
		infoPassport.put("type_field", "Для выращивания скота");
		infoPassport.put("comment", "На 3 года");
		adminDao.createPassport(infoPassport);*/
		
		/*Map<String, String> infoOwner = new HashMap<String, String>();
		infoOwner.put("field", "name");
		infoOwner.put("value", "LenOblGis");
		infoOwner.put("id", "6");
		adminDao.editOwner(infoOwner);*/
		
		/*Map<String, String> infoOwner = new HashMap<String, String>();
		infoOwner.put("id", "6");
		Owner owner = adminDao.reviewOwner(infoOwner);
		System.out.println("");*/
		
		/*Map<String, String> infoOwner = new HashMap<String, String>();
		infoOwner.put("id", "7");
		adminDao.deleteOwner(infoOwner);
		System.out.println("");*/
		
		/*Map<String, String> infoPassport = new HashMap<String, String>();
		infoPassport.put("id", "8");
		infoPassport.put("field", "region");
		infoPassport.put("value", "Severniy");
		adminDao.editFieldsPassport(infoPassport);
		System.out.println("");*/
		
		/*Map<String, String> infoPassport = new HashMap<String, String>();
		infoPassport.put("id", "8");
		Passport field = adminDao.reviewPassport(infoPassport);
		System.out.println("");*/
		
		/*Map<String, String> infoPassport = new HashMap<String, String>();
		infoPassport.put("id", "7");
		List<Passport> field = adminDao.reviewAllPassports();
		System.out.println("");*/
		
		/*Map<String, String> infoPassport = new HashMap<String, String>();
		infoPassport.put("region", "Severniy");
		infoPassport.put("area", "50");
		List<Passport> field = adminDao.findPassports(infoPassport);
		System.out.println("");*/
		
		/*Map<String, String> infoPassport = new HashMap<String, String>();
		infoPassport.put("id", "8");
		adminDao.deletePassport(infoPassport);;
		System.out.println("");*/
		
		
	}

}
