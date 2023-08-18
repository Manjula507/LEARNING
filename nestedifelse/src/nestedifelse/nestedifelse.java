package nestedifelse;
import java.util.*;
public class nestedifelse {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Accepted or not(true/false)");
		boolean acceptance =sc.nextBoolean();
		if (acceptance==true)
		{
			System.out.println("Enter the amount you taken from your father");
			int amount=sc.nextInt();
			if(amount>=10000)
			{
				System.out.println("go to Araku");
			}
			else if(amount<10000 && amount>5000 )
			{
				System.out.println("go to thalakona Waterfalls");
			}
			else if(amount<5000 && amount>1000 )
			{
				System.out.println("go to horsellyhills");
			}
			
		}
		else 
		{
			System.out.println(" go and clean the  house");
		}
	}

}
