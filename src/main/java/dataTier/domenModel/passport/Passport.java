package dataTier.domenModel.passport;

import dataTier.domenModel.owner.Owner;

public interface Passport {
	
	public int getID();
	public void setID(int id);
	
	public Owner getOwner();
	public void setOwner(Owner owner);
	
	public String getRegion();
	public void setRegion(String region);
	
	public int getCadastrNumber();
	public void setCadastrNumber(int cadastrNumber);
	
	public double getArea();
	public void setArea(double area);
	
	public String getType();
	public void setType(String type);
	
	public String getComment();
	public void setComment(String comment);

}
