package decisionmaking;
import java.util.Scanner;
public class Nestedswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the hotel name\nA hotel\nB hotel\nC hotel\n");
		String h=s.nextLine();
		
		switch(h)
		{
		case "A":
			System.out.println("Select the food\nVeg\nNonveg");
			String f=s.nextLine();
			switch(f)
			{
				case "Veg":System.out.println("Dosha\n");
				break;
				case "Nonveg":System.out.println("Biriyani\n");
				break;
				default:System.out.println("Invalid  input\n");
				
			}
		break;
		case "B":
			System.out.println("Select the food\nVeg\nNonveg");
			String p=s.nextLine();
			switch(p)
			{
				case "Veg":System.out.println("Dosha,Idli\n");
				break;
				case "Nonveg":System.out.println("Biriyani,chilli chicken\n");
				break;
				default:System.out.println("Invalid  input\n");
			
			}
		break;
		case "C":
			System.out.println("Select the food\nVeg\nNonveg");
			String i=s.nextLine();
			switch(i)
			{
				case "Veg":System.out.println("Dosha,Idli,Samoosa\n");
				break;
				case "Nonveg":System.out.println("Biriyani,chilli chicken,Beef\n");
				break;
				default:System.out.println("Invalid  input\n");
			
			}
		break;
		default:System.out.println("Invalid\n");
		}
		
		

	}

}
