package nestedif;
import java.util.*;

public class Nestedif {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Is tomotoes are available or not");
		boolean available=sc.nextBoolean();
		
		if(available==true) 
			
		{
			System.out.println("cost of 1kg tomotoes :");
			int price=sc.nextInt();
			if(price<=150)
			{
				System.out.println("Buy 1kg tomotoes");
			}
			if(price>150)
			{
				System.out.println("Buy 1/2kg tomotoes");
			}
		}
		
	}

}
