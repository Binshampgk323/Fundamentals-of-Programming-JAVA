package array;

import java.util.Scanner;

public class Addarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array\n");
		int n=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Index["+i+"]");
			a[i]=s.nextInt();
			
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("Index["+i+"]");
			b[i]=s.nextInt();
			
		}
		System.out.println("Sum is");
		for(int i=0;i<n;i++)
		{
		
			System.out.println(a[i]+b[i]);
				
		}
		
s.close();


	}

}
