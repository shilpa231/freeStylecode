package number;

public class EvenDigitsNo {

	public static void main(String[] args) {
		int n=23681;
		
		//int x=n/10;
		//System.out.println(x);
		
		//System.out.println("0000000000000000000");
		//int y=n%10;
		//System.out.println(y);
		
		System.out.println();
		
		while(n>0)
		{
			
			int m=n%10;
			
			if(m%2==0)
			System.out.print(m);
			
			n=n/10;
		}

	}
}
