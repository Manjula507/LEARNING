package Arithmetic_Operations;
import java.util.*;

public class Arithmetic_Operations {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println(subtractNumbers( num1 ,num2));
		System.out.println("enter 2 numbers");
		int num11=sc.nextInt();
		int num21=sc.nextInt();
		System.out.println( multiplyNumbers( num11 ,num21));
		System.out.println("enter 2 numbers");
		int num111=sc.nextInt();
		int num211=sc.nextInt();
		System.out.println( divideNumbers( num111 ,num211));
		System.out.println("enter 2 numbers");
		int num1111=sc.nextInt();
		int num2111=sc.nextInt();
		System.out.println( divideNumbers( num1111 ,num2111));
		
		 
		 
	}

public static int subtractNumbers(int num1, int num2)
{
	return num1-num2;
}

public static int multiplyNumbers(int num1, int num2)
{
	return num1*num2;
}

public static double divideNumbers(int num1, int num2)
{
	return num1/num2;
}

public static int findRemainder(int num1, int num2)
{
   return num1%num2;	
}

}
