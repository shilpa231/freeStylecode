package Inheritance;

public class Moon extends Earth {
	
	int b=20;
	
	public void moonInfo()
	{
		System.out.println("Earth rotate moon");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Moon obj=new Moon();
		//Earth e1=obj;
		//e1.info();
		//Earth eobj=new Earth();
		Earth eobj=new Moon();
		Moon mobj= (Moon) eobj;
		mobj.moonInfo();//becoz class was not loaded
	}

}
