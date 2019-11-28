package basic;
import java.util.Scanner;
public class Tenpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		System.out.println("Enter a floating point\n");
		float a=S.nextFloat();
		System.out.printf("%.0f\n",a);
		System.out.printf("%.01f\n",a);
		System.out.printf("%.02f\n",a);
		System.out.printf("%.03f",a);
S.close();
	}

}
