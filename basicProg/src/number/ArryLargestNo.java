package number;

public class ArryLargestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {43,65,76,222,54};
		
		for(int i=0;i<a.length;i++) 
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int x=a.length-1;
		System.out.println(a[x]);
	}

}
