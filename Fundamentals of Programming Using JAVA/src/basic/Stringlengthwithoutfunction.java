package basic;
import java.util.Scanner;
public class Stringlengthwithoutfunction {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int i,c=0;
		i=0;
		char a=str.charAt(i);
		for(char ch='a';ch<'z';ch++)
		{
			
			if(a==ch)
			{
				c++;
			}
			i++;
		}
		System.out.println(c);
	}

}
