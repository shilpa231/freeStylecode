package number;

import java.util.Scanner;

public class XylemPhloenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Number::");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int m = n;

		int sum1 = 0;
		int sum2 = 0;

		while (n > 0) {
			if (n == m || n < 10) {
				int a = n % 10;
				sum1 = sum1 + a;
				
			} else {
				int a = n % 10;
				sum2 = sum2 + a;
			}

			n = n / 10;
		}
		
		if(sum1==sum2)
		{
			System.out.println("Xylem NO  "+sum1);
		}
		else
		{
			System.out.println("PhloenNum  "+sum2);
		}

	}

}
