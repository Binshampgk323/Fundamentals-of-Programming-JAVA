package array;

import java.util.Scanner;

public class Maxarray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array\n");
		int n=s.nextInt();
		int a[]=new int[n];
		int i;int m = 0;
		for(i=0;i<n;i++)
		{
			System.out.println("Index["+i+"]");
			a[i]=s.nextInt();	
		}
		for(i=0;i<n;i++)
		{
			if(a[i]>=m)
			{
				
				m=a[i];
			}
		}	
		System.out.println("Large number is: "+m);
	}

}
