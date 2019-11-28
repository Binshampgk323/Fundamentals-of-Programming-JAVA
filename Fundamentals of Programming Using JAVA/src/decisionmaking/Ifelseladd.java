package decisionmaking;

import java.util.Scanner;

public class Ifelseladd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		System.out.println("Enter mark\n");
		int a=S.nextInt();
		if(a>90)
		{
			 System.out.println("A");
		}
		else if(a>=80 && a<90 )
		{
			System.out.println("B");
		}
		else if(a>=70 && a<80 )
		{
			System.out.println("C");
		}
		else if(a>=60 && a<70 )
		{
			System.out.println("D");
		}
		else
		{
			System.out.println("Fail");
		}
	

	}

}
