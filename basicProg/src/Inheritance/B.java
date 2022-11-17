package Inheritance;

public class B extends A{
	
	static int y=70;
	
	int j=10;
	
	B()
	{
		super(123);
		this.j=33;
		System.out.println("Constructor of B class"+j);
	}
	
	B(int n)
	{
		super(123);
		System.out.println(321);
	}
	
	public static void disVal()
	{
		System.out.println(y);
	}
	
	public void bNon()
	{
		System.out.println("NON STATIC METHOD::"+j);
	}

	{
		System.out.println("Non static block:: B class");
	}
	
	static 
	{
		System.out.println("static block :: B class");
		disVal();
		display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start");
		B obj=new B(123);
		obj.bNon();
		obj.aClass();
		
	}

}
