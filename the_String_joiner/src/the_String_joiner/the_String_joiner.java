package the_String_joiner;
import java.util.*;

public class the_String_joiner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 strings :");
		String s1=sc.next();
		String s2=sc.next();
		System.out.println(joinStrings(s1,s2));
		
		

	}
	public static String joinStrings(String str1, String str2)
	{
		return str1+str2;
	}
 
}
