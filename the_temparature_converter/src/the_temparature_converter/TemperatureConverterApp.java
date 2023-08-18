package the_temparature_converter;
import java.util.*;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		TemperatureConverter  tc=new TemperatureConverter();
		Scanner sc=new Scanner(System.in);
		double Fahrenheit=sc.nextDouble();
		System.out.println (tc.convertFahrenheitToCelsius(Fahrenheit));
		
		
	}

}
