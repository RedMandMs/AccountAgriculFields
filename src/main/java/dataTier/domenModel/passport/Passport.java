package dataTier.domenModel.passport;


public interface Passport {
	
	/*
	 * �������� id ���������
	 */
	public int getID();
	/*
	 * ���������� id ��������
	 */
	public void setID(int id);
	
	/*
	 * �������� id ���������
	 */
	public int getIdOwner();
	/*
	 * ���������� id ���������
	 */
	public void setIdOwner(int idOwner);
	
	/*
	 * �������� ����� ��������
	 */
	public String getRegion();
	/*
	 * ���������� ����� ��������
	 */
	public void setRegion(String region);
	
	/*
	 * �������� ����������� ����� ��������
	 */
	public int getCadastrNumber();
	/*
	 * ���������� ����������� ����� ��������
	 */
	public void setCadastrNumber(int cadastrNumber);
	
	/*
	 * �������� ������� ��������
	 */
	public double getArea();
	/*
	 * ���������� ������� ��������
	 */
	public void setArea(double area);
	
	/*
	 * �������� ��� ��������
	 */
	public String getType();
	
	/*
	 * ���������� ��� ��������
	 */
	public void setType(String type);
	
	/*
	 * �������� ����������� � ���������
	 */
	public String getComment();
	/*
	 * ���������� ����������� � ���������
	 */
	public void setComment(String comment);

}
