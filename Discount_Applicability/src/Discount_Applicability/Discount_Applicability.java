package Discount_Applicability;

import java.util.Scanner;

public class Discount_Applicability {
	public static void checkDiscount(double purchaseAmount)

	{

	    if(purchaseAmount>100)
	    {
	    	System.out.println("Discount Applicable");
	    }

	}
	
	public static void main(String[] args)
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter purchaseAmount");
	   double purchaseAmount=sc.nextDouble();
	   checkDiscount(purchaseAmount);
	   
	   sc.close();
	}

}
