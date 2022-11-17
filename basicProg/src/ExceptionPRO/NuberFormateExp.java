package ExceptionPRO;

public class NuberFormateExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try
		{
			String s="shilpa";
			int i=Integer.parseInt(s);
		}
		catch(NumberFormatException e) {
			// TODO: handle exception
			System.out.println("check the String value");
		}
		
		System.out.println("end prog");
	}

}
