package ExceptionPRO;

public class Test 
{
	public void display() throws MyExc
	{
		throw new MyExc("This is custom Exception");
	}

}
