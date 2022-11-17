package number;

public class FibonicSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0;
		int b=1;
		
		int count=10;
		for(int i=1;i<=count;i++)
		{
			int c=a+b;
			
			System.out.println(c);
			a=b;
			b=c;
			
		}

	}

}
