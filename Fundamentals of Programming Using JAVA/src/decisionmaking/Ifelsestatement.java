package decisionmaking;

import java.util.Scanner;

public class Ifelsestatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		System.out.println("Age\n");
		int a=S.nextInt();
		if(a>=18)
		{
			System.out.println("Eligible for voting ");
		}
		else
		{
			System.out.println("Not eligible\n");
		}

	}

}
