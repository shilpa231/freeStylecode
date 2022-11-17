package number;

import java.util.Scanner;

public class ReverseNum {
	public static void main(String[] args) {

		System.out.println("Enter No::");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		while (n > 0) {

			int m = n % 10;
			sum=(sum*10)+m;
			n = n / 10;
		
		}
		System.out.println(sum);

	}

}

