package sql;

import org.junit.Test;

import ru.lenoblgis.trenning.agrocultural.dataTier.accessTODataServices.AdminSpringDAO;

/**
 * ������������ ������ � �������� ������������� � ��
 * @author ������
 *
 */
public class RegAuthorDAOTesting {

	/**
	 * �������� ������������ � ���� ������
	 */
	@Test
	public void testCreatingUser(){
		AdminSpringDAO dao = new AdminSpringDAO();
		dao.registration("Sergey", "lenoblgis", 30);
	}
	
	
	/**
	 * ����������� ������������
	 */
	@Test
	public void testReviewUser(){
		AdminSpringDAO dao = new AdminSpringDAO();
		dao.registration("Sergey", "lenoblgis", 30);
	}
}
