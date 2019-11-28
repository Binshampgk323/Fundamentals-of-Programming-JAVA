package controlstructures;

import java.util.Scanner;

public class Sumofnatural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter strating number\n");
		int n=s.nextInt();
		System.out.println("Enter ending number\n");
		int m=s.nextInt();
		int sum=0;
		for(int i=n; i<=m;i++)
		{
			sum=sum+i;
			
		}
			System.out.println("sum :"+sum);
	}

}
