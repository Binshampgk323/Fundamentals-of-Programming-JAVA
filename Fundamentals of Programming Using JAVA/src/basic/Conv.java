package basic;
import java.util.Scanner;
public class Conv {
	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the character");
		char c=S.next().charAt(0);
		System.out.println("Enter a number");
		int n=S.nextInt();
		System.out.println("Output");
		System.out.println((int)c);
		System.out.println((char)n);
		

	}

}
