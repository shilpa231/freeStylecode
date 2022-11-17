package Interface;

public interface Demo {
	
	int x=10;//final static
	static int y=20;//final
	
	
	default void a1()
	{
		System.out.println("it is concreate method.......default");
	}
	
	static void a2()//public
	{
		System.out.println("it is concreate method....... static");
	}
	
	void  a3();//

}
