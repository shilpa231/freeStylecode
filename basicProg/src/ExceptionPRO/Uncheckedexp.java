package ExceptionPRO;

public class Uncheckedexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=21;
		int b=0;
		
		//throw new ArithmeticException();
		try
		{
			String s="123";
			
			char c=s.charAt(0);
			System.out.println(c);
			
			boolean x=Boolean.valueOf(s);
			System.out.println(x);
			
			int res=a/b;
			
			System.out.println(res);
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		//catch (ArithmeticException e) 
		{
			// TODO: handle exception
			System.out.println("parent class");
		}
		System.out.println("End ");
		

	}

}
