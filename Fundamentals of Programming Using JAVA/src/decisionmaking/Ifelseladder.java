package decisionmaking;

import java.util.Scanner;

public class Ifelseladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		System.out.println("Enter a number\n");
		int a=S.nextInt();
		if(a<0)
		{
			System.out.println(" Negative number\n");
		}
		else if(a>0)
		{
			System.out.println("Positive number\n");
		}
		else
			System.out.println("Number is zero");
	

	}

}
