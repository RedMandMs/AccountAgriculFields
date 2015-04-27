package dataTier.accessToDataServices.fields.SQLQueries;

import java.util.Map;

public interface SQLQueries {

	/*
	 * �������� ���������
	 */
	public String createOwner();
	
	/*
	 * �������� ���������
	 */
	public String deleteOwner();
	
	/*
	 * ������������� ���������
	 */
	public String editOwner(Map<String,String> info);
	
	/*
	 * ����������� ���������
	 */
	public String reviewOwner();
	
	
	
	/*
	 * �������� ��������
	 */
	public String createPassport();
	
	/*
	 * �������� ��������
	 */
	public String deletePassport();
	
	/*
	 * �������������� ��������
	 */
	public String editFieldsPassport(Map<String,String> info);
	
	/*
	 * �������� ��������
	*/
	public String reviewPassport();
	
	/*
	 * �������� ���� ����������
	 */
	public String reviewAllPassports();
	
	/*
	 * ����� ��������
	 */
	public String findPassports(Map<String,String> info);
	
}
