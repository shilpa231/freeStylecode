package number;

import java.util.Scanner;

public class CountNos {
	public static void main(String[] args) {

		System.out.println("Enter no:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;

		while (n > 0) {
			count++;
			n = n / 10;
			System.out.println(n);
		}
		
		System.out.println(count);
	}
}
//25/10-->2
//2/10-->0

