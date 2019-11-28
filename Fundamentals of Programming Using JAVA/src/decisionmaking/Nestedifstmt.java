package decisionmaking;

import java.util.Scanner;

public class Nestedifstmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		System.out.println("Name of company\n");
		String a=S.nextLine();
		System.out.println("Size of RAM");
		int b=S.nextInt();
		System.out.println("Size HDD");
		int c=S.nextInt();
		if(a.equals("hp"))
		{
			if(b==16)
			{
				if(c==2)
				{
					System.out.println("Successfully complete\n");
					
				}
				else
				{
					System.out.println("HDD Not");
				}	
				
			}
			else
			{
				System.out.println("16 RAM Not\n");
			}
				
		}
		else
		{
			System.out.println("Not Hp");
		}


	}

}
