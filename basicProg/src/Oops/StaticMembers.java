package Oops;

public class StaticMembers {
	static int z;
	
	public static void display()
	{
		System.out.println(z);
		System.out.println("static method");
	}
	
	static 
	{
		display();
		//SIB
		z=20;
		System.out.println("STATIC BLOCK");
		display();
		
	}
	
	public static void main(String[] args) 
	{
	
		System.out.println(",,,,,,,,,,,,,,,,,");
		System.out.println("main method");
		StaticMembers obj=new StaticMembers();
		obj.display();
		System.out.println(obj.z);
		
	}

}
