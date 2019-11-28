package basic;
import java.util.Scanner;
public class Elevenpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		System.out.println("Enter a floating point\n");
		float a=S.nextFloat();
		System.out.println(Math.round(a));
		System.out.printf("%f\n",Math.ceil(a));
		System.out.printf("%f",Math.floor(a));
	S.close();	
	}


}
