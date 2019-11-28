package decisionmaking;

import java.util.Scanner;

public class Ifelselad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		System.out.println("Enter two number\n");
		int a=S.nextInt();
		int b=S.nextInt();
		if(a<b)
		{
			System.out.println(a+b);
		}
		else if(a>b)
		{
			System.out.println(a-b);
		}
		else
		{
			System.out.println(b);
		}
	

	}

}
