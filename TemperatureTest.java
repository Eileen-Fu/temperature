$ git tag
assignment-2

/** 
 * @author Aditya Mahajan <aditya.mahajan@mcgill.ca>
 * @version 2013.10.06
 * Unit Testing Temperature class
 */



public class TemperatureTest {
	
	public static void main(String[] args){

//		The following code is used to test the getUnits(), getValue() and changeUnits() methods.
//		Most of the values are chosen entirely randomly. The exception are the lower and upper bounds for the values.
//		The lower bound is absolute zero. The upper bound is the maximum real number representable by the double type.
//		The values in this part are obtained from a Web random number generator. Each random number is one order of magnitude greater than the last.
//		This should be more than enough for day-to-day applications.
//		Note that negative numbers are not tested for values in Kelvin, because negative Kelvin values do not exist. 
//		For the same reason, values less than -273.15 Celsius and -459.67 Fahrenheit are not tested.
		
		double[] kelvinTemperatureList = {0.0, 3.0294, 16.8890, 382.1994, 2406.5627, 42461.9028, 232916.8274, 7543265.1431, 92343276.6810, 510394683.1434, Double.MAX_VALUE};
		System.out.println("Testing temperatures in Kelvin:");
		for(int i=0; i<kelvinTemperatureList.length; i++){
			Temperature a = new Temperature(kelvinTemperatureList[i], Temperature.Units.KELVIN);
			Temperature b = new Temperature(a);
			b.changeUnits(Temperature.Units.CELSIUS);
			Temperature c = new Temperature(a);
			c.changeUnits(Temperature.Units.FAHRENHEIT);
			System.out.println(" ");
			System.out.println(a.getValue() + " " + a.getUnits());
			System.out.println(b.getValue() + " " + b.getUnits());
			System.out.println(c.getValue() + " " + c.getUnits());
		}
		
		System.out.println(" ");
		
		double[] celsiusTemperatureList = {-273.15, -23.1423, -2.3456, -94.2048, 382.1994, 2406.5627, 42461.9028, 232916.8274, 7543265.1431, 92343276.6810, 510394683.1434, Double.MAX_VALUE};
		System.out.println("Testing temperatures in Celsius:");
		for(int i=0; i<celsiusTemperatureList.length; i++){
			Temperature a = new Temperature(celsiusTemperatureList[i], Temperature.Units.CELSIUS);
			Temperature b = new Temperature(a);
			b.changeUnits(Temperature.Units.KELVIN);
			Temperature c = new Temperature(a);
			c.changeUnits(Temperature.Units.FAHRENHEIT);
			System.out.println(" ");
			System.out.println(a.getValue() + " " + a.getUnits());
			System.out.println(b.getValue() + " " + b.getUnits());
			System.out.println(c.getValue() + " " + c.getUnits());
		}
		
		System.out.println(" ");
		
		double[] fahrenheitTemperatureList = {-459.67, -23.1423, -2.3456, -94.2048, 382.1994, 2406.5627, 42461.9028, 232916.8274, 7543265.1431, 92343276.6810, 510394683.1434, Double.MAX_VALUE};
		System.out.println("Testing temperatures in Fahrenheit:");
		for(int i=0; i<fahrenheitTemperatureList.length; i++){
			Temperature a = new Temperature(fahrenheitTemperatureList[i], Temperature.Units.FAHRENHEIT);
			Temperature b = new Temperature(a);
			b.changeUnits(Temperature.Units.CELSIUS);
			Temperature c = new Temperature(a);
			c.changeUnits(Temperature.Units.KELVIN);
			System.out.println(" ");
			System.out.println(a.getValue() + " " + a.getUnits());
			System.out.println(b.getValue() + " " + b.getUnits());
			System.out.println(c.getValue() + " " + c.getUnits());
		}
		
		System.out.println(" ");
		
//		It can be shown from the console output that, as values increase towards the maximum value that can be expressed by double type,
//		the Fahrenheit value can no longer be expressed properly and show up as only infinity. In the first two cases it is due to the
//		the Fahrenheit value exceeding the maximum expressible value, and therefore is not a bug. In the last case, however, it is due to the
//		algorithm used to convert between Fahrenheit and Kelvin: value in Kelvin = ((value in Fahrenheit) + 459.67) * 5.0/9.0, 
//		and value in Fahrenheit = (value in Kelvin) * 9.0/5.0 - 459.67 By the order of operation, multiplication is performed before division, and thus the error occurs.
		
//		This can be fixed by placing a pair of () around 5.0/9.0 and around 9.0/5.0.
		
	}
}
