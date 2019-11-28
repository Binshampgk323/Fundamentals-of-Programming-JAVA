package controlstructures;

import java.util.Scanner;

public class Fibornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int c=0;
		int d=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number\n");
		int n=s.nextInt();
		for(int i=0;i<=n;i++)
		{
			c=a+b;
			if(c==n)
			{
				d++;
			}
			
			a=b;
			b=c;
		}

		if(d!=0)
		{
			System.out.println("Yes\n");
		}
		else
			System.out.println("No\n");
		
	}

}
