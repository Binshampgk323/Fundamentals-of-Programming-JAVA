package array;

import java.util.Scanner;

public class Oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array\n");
		int n=s.nextInt();
		int a[]=new int[n];
		int i;
		int sum1=0;int sum2=0;
		int c=0;int b=0;float g=0;float h=0;
		for(i=0;i<n;i++)
		{
			System.out.println("Index["+i+"]");
			a[i]=s.nextInt();	
		}
		for(i=0;i<n;i++)
		{
			if(a[i]%2!=0)
			{	
				System.out.printf("%d\t",a[i]);
				sum1=sum1+a[i];
				b++;
				
			}
			
		}
		System.out.printf("\n");
		for(i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				
				System.out.printf("%d\t",a[i]);
				sum2=sum2+a[i];
				c++;	
			}		
		}	
		System.out.printf("\n");
		 g=sum1/b;
		 h=sum2/c;
		 System.out.println("Avg of odd number is: "+g);
		 System.out.println("Avg of even number is: "+h);
		 s.close();
		
}

}
