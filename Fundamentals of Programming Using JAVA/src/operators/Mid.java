package operators;

import java.util.Scanner;

public class Mid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		System.out.println("X1\n");
		int x1=S.nextInt();
		System.out.println("Y2\n");
		int y1=S.nextInt();
		System.out.println("X2\n");
		int x2=S.nextInt();
		System.out.println("Y2\n");
		int y2=S.nextInt();
		int n=((x1+x2)/2);
		int m=((y1+y2)/2);
		System.out.printf("%d\t%d",n,m);


	}

}
