package basic;
import java.util.Scanner;
public class Pgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the inputs\n");
		String a=s.nextLine();
		int n=s.nextInt(); 
		s.nextLine();
		String b=s.nextLine();
		int m=s.nextInt(); 
		System.out.printf("%-15s %03d\n",a,n);
		System.out.printf("%-15s %03d\n",b,m);
	

	}

}
