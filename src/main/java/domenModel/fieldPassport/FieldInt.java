package domenModel.fieldPassport;

import domenModel.organizations.OrganizationInt;

public interface FieldInt {
	
	public int getID();
	public void setID(int id);
	
	public OrganizationInt getOwner();
	public void setOwner(OrganizationInt owner);
	
	public FieldRegion getRegion();
	public void setRegion(FieldRegion region);
	
	public int getCadastrNumber();
	public void setCadastrNumber(int cadastrNumber);
	
	public double getArea();
	public void setArea(double area);
	
	public FieldType getType();
	public void setType(FieldType type);
	
	public String getComment();
	public void setComment(String comment);

}
