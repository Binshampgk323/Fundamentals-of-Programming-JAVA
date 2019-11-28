package operators;
import java.util.Scanner;
public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		System.out.println("Enter two numbers\n");
		int a=S.nextInt();
		int b=S.nextInt();
		System.out.println("Add: "+(a+b));
		System.out.println("Sub : "+(a-b));
		System.out.println("Mul :"+(a*b));
		System.out.println("Div :"+(a/b));
		System.out.println("Mod :"+(a%b));
		

	}

}
