package Oops;

public class Multithreading {
	
	
	static public void display()
	{
		System.out.println("display1");
	}
	
	static public void display(int a)
	{
		System.out.println("display2");
		System.out.println(a);
	}
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Multithreading obj=new Multithreading();
		obj.display(21);
		
	}

}
