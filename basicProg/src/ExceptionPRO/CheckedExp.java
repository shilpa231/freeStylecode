package ExceptionPRO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExp {

	public static void main(String[] args)throws FileNotFoundException {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream fis=new FileInputStream("D:/om");
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		

	}

}
