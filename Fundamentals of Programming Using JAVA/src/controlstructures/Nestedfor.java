package controlstructures;

import java.util.Scanner;

public class Nestedfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.printf("Enter the limit\n");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.println("*");
			}
			System.out.println("\n");
		}

	}

}
