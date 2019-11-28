package controlstructures;

import java.util.Scanner;

public class Hcflcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two number");
		int n1=s.nextInt();
		int n2=s.nextInt();
		int gcd=0;int lcm=0;
		int i;
		// GCD
		int min=(n1<n2)?n1:n2;
		for( i=min;i>0;i--)
		{
			if(n1%i==0&&n2%i==0)
			{
				gcd=i;
				break;
			}
		
		}
		System.out.println("GCD: "+gcd);
// LCM
		int max=(n1>n2)?n1:n2;
		for( i=max;i<=(n1*n2);i++)
		{
			if(i%n1==0&&i%n2==0)
			{
				lcm=i;
				break;
				
			}
		
		}
		System.out.println("LCM: "+lcm);
		s.close();
	}
	

}
