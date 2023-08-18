package the_journey_calculator;
import java.util.*;

public class JourneyCalculator {

	public static void main(String[] args) {
		JourneyCal c1=new JourneyCal();
		Scanner sc=new Scanner(System.in);
		double time=sc.nextDouble();
		double speed=sc.nextDouble();
		System.out.println(c1.calculateDistance(speed, time));
	}

}
