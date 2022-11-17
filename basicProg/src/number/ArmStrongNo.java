package number;

import java.util.Scanner;

public class ArmStrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 153 ==>count is 3
		//1^3+5^3+3^3 =1+125+27==> 153 It is similar to No 
		System.out.println("Enter the no::");
		Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int sum=0;
		 int x=n;
		 int y=n;//sample var 
		 
		 int count=0;
		 
		 while(n>0)
		 {
			 count++;
			 n=n/10;
	     }
		 
		 while(x>0)
		 {
			 int a=x%10;
			 sum=(int) (sum+ Math.pow(a,count));
			 x=x/10;
		 }
		 
		 // System.out.println(count);
		 
		 if(sum==y)
		 {
			 System.out.println("it is AmStrong No");
		 }
		 else
		 {
			 System.out.println("Not AmStrong No");
		 }
	}
	
	

}
