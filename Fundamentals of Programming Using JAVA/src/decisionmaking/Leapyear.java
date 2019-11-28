package decisionmaking;
import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the year\n");
		int n=s.nextInt();
		if(n%4==0)
		{
			if(n%100==0)
			{
				if(n%400==0)
				{
					System.out.println("Leap year\n");
				}
				else
				{
					System.out.println("Not leap year\n");
				}
				
			}
			else
			{
				System.out.println("Leap year\n");
			}
		}
		else
		{
			System.out.println("Not leap year\n");
		}
		s.close();
	}


}
