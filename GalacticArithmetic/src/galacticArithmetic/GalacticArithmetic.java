package galacticArithmetic;
import java.util.*;

public class GalacticArithmetic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		long num1=sc.nextLong();
		long num2=sc.nextLong();
		System.out.println(galacticAddition( num1,  num2) );

	}
	public static long galacticAddition(long num1, long num2) 
	{
		return num1+num2;
	}

}
