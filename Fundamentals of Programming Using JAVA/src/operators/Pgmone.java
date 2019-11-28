package operators;

import java.util.Scanner;

public class Pgmone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		System.out.println("Enter a number\n");
		int a=S.nextInt();
		int b=a%10;
		int c=a/10;
		int d=b*c;
		int e=c*c;
		System.out.printf("%d%d",d,e);

	}

}
