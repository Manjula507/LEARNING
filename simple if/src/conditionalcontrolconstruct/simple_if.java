package conditionalcontrolconstruct;
import java.util.*;
public class simple_if {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter Student Marks:");
		int marks=sc.nextInt();
		studentGreeting(marks);
		System.out.println("Welcome to kodnest");
		
	}
	public static void studentGreeting(int marks)
	{
		if(marks>=80)
		{
			System.out.println("Welcome to Tech Club");
		}
	}

}
