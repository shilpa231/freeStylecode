package number;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		//Highest Commen factor
		//gcf Greatest Common Factor
		//greast common divisor -->gcd
		
		System.out.println("Enter two no::");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		int n=0;
		for(int i=1;i<=x && i<=y;i++)
		{
			if(x%i==0 && y%i==0)
			{
				n=i;
			}
			
		}
		
		System.out.println("HCF: "+n);
		
		
		
	}
}
