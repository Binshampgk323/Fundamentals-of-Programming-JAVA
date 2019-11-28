package decisionmaking;

import java.util.Scanner;

public class Nestedifstate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		System.out.println("Enter a number\n");
		int a=S.nextInt();
		if(a<200)
		{
			if(a<15)
			{
				System.out.println("The number is less than 15\n");
			}
				else
				{
					System.out.println("Number greater tha 15\n");
				}
				
		}
		else
		{
			System.out.println("Number greater than 200");
		}


	}

}
