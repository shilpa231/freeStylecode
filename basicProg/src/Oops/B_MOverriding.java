package Oops;

public class B_MOverriding extends A_MOverriding {
	
	public static void m1()
	{
		System.out.println("m1 class B");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B_MOverriding obj=new B_MOverriding();
		
		A_MOverriding aobj=obj;
		
		obj.m1();

	}

}
