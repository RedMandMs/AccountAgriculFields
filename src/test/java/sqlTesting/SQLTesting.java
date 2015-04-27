import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import dataTier.accessToDataServices.fields.SQLQueries.SQLQueries;
import dataTier.accessToDataServices.fields.SQLQueries.SQLServerQueries;


public class SQLTesting {
	
	@Test
	public void testFindFieldQuery(){
		SQLQueries sqlQueries = new SQLServerQueries();
		Map<String, String> queryInfo = new HashMap<String, String>();
		
		queryInfo.put("id", "18");
		queryInfo.put("id_organization", "1");
		queryInfo.put("region", "Primorskiy");
		queryInfo.put("cadastr_number", "1854");
		queryInfo.put("area", "30");
		queryInfo.put("type_field", "Сельскохозяйственное");
		queryInfo.put("comment", "Окей");
		
		Assert.assertEquals("SELECT * FROM field_table WHERE (id = 18 AND id_organization = 1 AND region = 'Primorskiy' AND cadastr_number = 1854 AND area = 30 AND type_field = 'Сельскохозяйственное' AND comment LIKE 'Окей');", sqlQueries.findPassports(queryInfo));
	}
	
	@Test
	public void testReviewAllPassports(){
		SQLQueries sqlQueries = new SQLServerQueries();
	
		Assert.assertEquals("SELECT *  FROM field_table  GO ", sqlQueries.reviewAllPassports());
	}

}
