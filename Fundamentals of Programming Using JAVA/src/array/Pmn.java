package array;
import java.util.Scanner;
public class Pmn {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];int t=0;
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
for(int i=0;i<n-1;i++)
{
	if(a[i]>a[i+1])
	{
		t=a[i];
		a[i]=a[i+1];
		a[i+1]=t;
		System.out.println(t);
	}
}
	}

}
