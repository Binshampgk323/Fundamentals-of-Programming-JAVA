package controlstructures;

import java.util.Scanner;

public class Multable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number\n");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
			System.out.println(i+"*2="+i*2);


	}

}
