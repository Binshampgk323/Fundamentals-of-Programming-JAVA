package controlstructures;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit\n");
		int n=s.nextInt();
		for(int i=n;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
			 System.out.printf("*");
			}
			System.out.printf("\n");
		}

	}
	

}
