package ExceptionPRO;

import java.util.TreeSet;

public class TryCatchfinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet obj=new TreeSet();
		try
		{
		obj.add(21);
		obj.add(43);
		obj.add(true);
		}
		catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		finally {
			System.out.println("Done finally");
		}
		System.out.println(obj);

	}

}
