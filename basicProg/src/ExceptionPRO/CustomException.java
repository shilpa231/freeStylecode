package ExceptionPRO;

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test obj=new Test();
		try 
		{
			obj.display();
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println(e);
			
		}
		
	}
}
