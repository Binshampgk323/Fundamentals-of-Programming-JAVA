package operators;

import java.util.Scanner;

public class Pgmtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		System.out.println("Enter a number\n");
		int n=S.nextInt();
		int a=n%10;
		int b=a*a;
		int c=n/100;
		int d=c*a;
		int m=b*d;
		System.out.printf("Outpout 1 : %d%d\n",b,d);
		System.out.printf("Output 2: %d",m);

	}

}
