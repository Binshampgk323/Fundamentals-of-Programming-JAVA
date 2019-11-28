package basic;

import java.util.Scanner;


public class Stringpgm {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter strings");
		String b=s.next();
		String c=""+b.charAt(3)+b.charAt(4);
		switch(c)
		{
			case "01":System.out.println("jan");
			break;
			case "02":System.out.println("feb");
			break;
			case "03":System.out.println("mar");
			break;
			case "04":System.out.println("apl");
			break;
			case "05":System.out.println("may");
			break;
			case "06":System.out.println("june");
			break;
			case "07":System.out.println("july");
			break;
			case "08":System.out.println("aug");
			break;
			case "09":System.out.println("sep");
			break;
			case "10":System.out.println("oct");
			break;
			case "11":System.out.println("nov");
			break;
			case "12":System.out.println("dec");
			break;
		}
s.close();
	}

}
