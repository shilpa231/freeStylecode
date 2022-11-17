package number;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter array no::");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		
		//char c=sc.next().charAt(x);
		
		//int []a=new Integer(x);
		int []a=new int[x];
		
		System.out.println("enter 5 no:");
		
		for(int i=0;i<x;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++) {
			 System.out.println(a[i]);
		}
		
		System.out.println(".............");
		
		for(int i=0;i<a.length-1;i++) {
			
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]<a[j+1]) {
	
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			 System.out.println(a[i]);
		}
		

	}

}
