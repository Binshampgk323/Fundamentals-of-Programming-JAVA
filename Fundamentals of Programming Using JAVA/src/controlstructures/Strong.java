package controlstructures;
import java.util.Scanner;
public class Strong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int num=n;
		int sum=0;
		while(n!=0)
		{
			int fact=1;
			int a=n%10;
			for(int i=1;i<=a;i++)
			{
		
				fact=fact*i;
			}
				sum=sum+fact;
				n=n/10;
			
		}
		
		if(sum==num)
		{
			System.out.println("Strong number");
		}
		else
		{
			System.out.println("Not strong");
		}
		
s.close();
	}

}
