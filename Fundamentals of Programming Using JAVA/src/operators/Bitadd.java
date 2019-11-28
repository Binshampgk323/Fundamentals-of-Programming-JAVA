package operators;

import java.util.Scanner;

public class Bitadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		System.out.println("Enter two numbers\n");
		int a=S.nextInt();
		int b=S.nextInt();
		while(a!=0)
		{
			int f=a^b;
			int c=(a&b)<<1;
			b=f;
			a=c;
		}
		System.out.println(b);


	}

}
