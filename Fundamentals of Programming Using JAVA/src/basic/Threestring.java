package basic;

import java.util.Scanner;

public class Threestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i;char ch;
		System.out.println("Enter count of strings");
		int c=s.nextInt();
		System.out.println("Enter strings");
		String b[]=new String[c];
		for( i=0;i<c;i++)
		{
			b[i]=s.next();
		}
		for( i=0;i<c;i++)
		{
			ch=b[i].charAt(0);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				
					System.out.println(b[i]);
			}
		}
		s.close();
	}

}
