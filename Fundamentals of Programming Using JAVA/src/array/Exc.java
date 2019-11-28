package array;
import java.util.Scanner;
class Exc
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
	     String str=s.nextLine();
	     int n=str.length();
	     int c=0;
	     for(int i=0;i<n;i++)
	     {
	    	 char ah=str.charAt(i);
	    	 if(ah=='a'||ah=='e'||ah=='i'||ah=='o'||ah=='u'||ah=='A'||ah=='I'||ah=='O'||ah=='U')
	    	 {
	    		 c++;
	    		 for(int k=0;k<c;k++)
		    		{
		    			System.out.print("*");
		    		}
	    			System.out.print(ah);
	    		for(int j=0;j<c;j++)
	    		{
	    			System.out.print("*");
	    		}
	    	 }
	    	 else
	    	 {
	    		System.out.print(ah); 
	    	 }
	    	 
	    	 
	     }
	     
	      
    }
}