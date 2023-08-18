package conditionalcontrolconstruct1;
import java.util.*;
public class if_else_lader {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Score");
		int score=sc.nextInt();
		Gradingsystem grade=new Gradingsystem();
		grade.check(score);
	
		

	}

}
