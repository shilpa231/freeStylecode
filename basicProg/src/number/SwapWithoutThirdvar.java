package number;

public class SwapWithoutThirdvar {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=3;
		
		System.out.println("first var:: "+ a);
		System.out.println("Second var:: "+ b);
		System.out.println();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("first var:: "+ a);
		System.out.println("Second var:: "+ b);
		
		
	}

}
