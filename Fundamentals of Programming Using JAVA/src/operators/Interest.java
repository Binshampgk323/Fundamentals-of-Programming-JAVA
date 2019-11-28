package operators;

import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		System.out.println("Interest: ");
		int p=S.nextInt();
		System.out.println("year: ");
		int n=S.nextInt();
		System.out.println("Rate: ");
		float r=S.nextFloat();
		float i=((p*n*r)/100);
		System.out.printf("%.02f\n",i);

	}

}
