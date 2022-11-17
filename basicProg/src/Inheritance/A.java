package Inheritance;

public class A {

	static int x;

	int i;

	A(int n) {
		this.i = 22;
		System.out.println("Constructor of A class " + i);
		System.out.println(n);
	}

	public static void display() {
		System.out.println(x);

	}

	public void aClass() {
		System.out.println("NON STATIC METHOD::A");
		System.out.println("Non static " + i);
	}

	static
	{
		System.out.println("static block:: A class");
	}
	
	{
		System.out.println("Non static Block:: A");
	}
}
