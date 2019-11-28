package decisionmaking;

import java.util.Scanner;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		System.out.println("Enter a number\n");
		int a=S.nextInt();
		if(a!=0)
		{
			if((a%2)==0)
			{
				System.out.println("Even number\n");
			}
				else
				{
					System.out.println("Odd number\n");
				}
				
		}
		else
		{
			System.out.println("Invalid input");
		}
S.close();
	}


}
