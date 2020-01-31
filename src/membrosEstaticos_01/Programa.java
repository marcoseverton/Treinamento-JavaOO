package membrosEstaticos_01;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static final double PI = 3.14159;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = scan.nextDouble();
		
		double c = circumference(radius);
		
		double v = volume (radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n",PI);
		
		scan.close();

	}
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume (double radius) {
		return 4.0 * PI * radius * radius * radius /3.0;
	}

}

