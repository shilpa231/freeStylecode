package number;

import java.util.Scanner;

public class PalindromNum {

	public static void main(String[] args) {
		

		System.out.println("Enter No::");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int y=n;
		System.out.println(y);
		int sum=0;
		while (n > 0) {

			int m = n % 10;
			sum=(sum*10)+m;
			n = n / 10;
		
		}
		int x=sum;
		//System.out.println(x);
		//System.out.println(n);
		
		if(x==y)
		{
			System.out.println("No is Palindrom");
		}
		else
		{
			System.out.println("Not Palindron");
		}

		
		
	}
}
