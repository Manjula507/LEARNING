package the_Double_Trouble;
import java.util.*;

public class the_Double_Trouble {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		System.out.println(doubleTheNumber(num));
		

	}
	public static int doubleTheNumber(int num)
	{
		return num*2;
	}

}
