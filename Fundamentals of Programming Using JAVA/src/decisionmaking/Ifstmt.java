package decisionmaking;

import java.util.Scanner;

public class Ifstmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		System.out.println("Enter two numbers between 10 and 20\n");
		int a=S.nextInt();
		int b=S.nextInt();
		if(a>10 && b<20)
		{
			System.out.printf("Sum is %d",a+b);
		}

	}

}
