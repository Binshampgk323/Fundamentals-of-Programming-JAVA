package decisionmaking;

import java.util.Scanner;

public class Ifelsestmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		System.out.println("Enter username and password\n");
		String name=S.nextLine();
		String pass=S.nextLine();
		if(name.equals("bb") && pass.equals("1"))
		{
			System.out.println("Login");
		}
		
		else
		{
			System.out.println("Incorrect user and password");
		}


	}

}
