package operators;

import java.util.Scanner;

public class Swapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		System.out.println("Enter two numbers\n");
		int a=S.nextInt();
		int b=S.nextInt();
		int c=a;
			a=b;
			b=c;
		System.out.println("a :"+a+ " \nb :"+b);
				

	}

}
