package number;

import java.util.Scanner;

public class OddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter no:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		while(n>0)
		{
			int m=n%10;
			if(m%2==1)
			{
				System.out.println(m);
				count++;
			}
		    n=n/10;
		}
		System.out.println(count);

	}

}
