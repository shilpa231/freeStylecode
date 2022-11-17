package number;

import java.util.Scanner;

public class SumArrayEle {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elements::");
		int x=sc.nextInt();
		
		double[] d=new double[x];
		System.out.println("Enter Element::");
		for(int i=0;i<x;i++)
		{
			d[i]=sc.nextDouble();
		}
		
		System.out.println("....");
		double sum=0;
		for(int j=0;j<d.length;j++)
		{
			//System.out.println(",,,,,");
			//System.out.println(d[j]);
			sum=sum + d[j];
		}
		System.out.println(sum);
	}
}
