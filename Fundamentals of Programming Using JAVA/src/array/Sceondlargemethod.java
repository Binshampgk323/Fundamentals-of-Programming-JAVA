package array;

import java.util.Arrays;
import java.util.Scanner;

public class Sceondlargemethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array\n");
		int n=s.nextInt();
		int a[]=new int[n];
		int i;int m = 0;int t=0;
		
		for(i=0;i<n;i++)
		{
			System.out.println("Index["+i+"]");
			a[i]=s.nextInt();	
		}
		Arrays.sort(a);
		System.out.println(a[n-2]);

	}

}
