package ExceptionPRO;

public class ThrowsDeclare {

	public static void main(String[] args)throws NumberFormatException {
		// TODO Auto-generated method stub
		//Not Continue for execution
		String s="true";
		
		boolean b=Boolean.parseBoolean(s);
		System.out.println(b);

		int i=Integer.parseInt(s);
		
		System.out.println("End");
		
		
	}

}
