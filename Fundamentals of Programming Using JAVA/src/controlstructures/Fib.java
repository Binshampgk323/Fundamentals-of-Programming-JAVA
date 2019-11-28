package controlstructures;

import java.util.Scanner;

public class Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int c=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number\n");
		int n=s.nextInt();
		System.out.printf("%d\t%d\t",a,b);
		for(int i=1;i<=n;i++)
		{
			c=a+b;
			System.out.printf("%d\t",c);
			a=b;
			b=c;
		}

	}

}
