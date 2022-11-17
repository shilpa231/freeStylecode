package number;

import java.util.Scanner;

public class StrongNo {
	public static void main(String[] args) {
		//ex::145  ==>5!+4!+1!== 145 then it is Strong no.
		System.out.println("Enter the no::");
		Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int y=n;
		 
		 int sum=0;
		 
		 while(n>0)
		 {
			 int a=n%10;
			 System.out.println(a);
			 sum= sum+factorial(a);
			 n=n/10;
		 }
		 
		 if(sum==y)
		 {
			 System.out.println("it is Strong No");
		 }
		 else
		 {
			 System.out.println("Not Strong No");
		 }
		
	}
	
	public static int factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		return fact;
	}
}
