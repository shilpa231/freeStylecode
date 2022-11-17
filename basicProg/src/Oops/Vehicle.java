package Oops;

public class Vehicle {

	private int vNo;
	String vName;
	String vOwner;
	
	Vehicle(int no,String name,String owner)
	{
		vNo=no;
		vName=name;
		vOwner=owner;
		
	}
	
	public int getVno()
	{
		return this.vNo;
	}
	
	public void setVno(int n)
	{
		this.vNo=n;
	}
	
	public void insurance()
	{
		System.out.println("5 year insurance");
	}
}
