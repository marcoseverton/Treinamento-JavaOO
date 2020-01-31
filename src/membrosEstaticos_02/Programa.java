package membrosEstaticos_02;


import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Programa {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Calculator calc = new Calculator();
		
		System.out.println("Enter radius: ");
		double radius = scan.nextDouble();
		
		double c = calc.circumference(radius);
		
		double v = calc.volume (radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n",calc.PI);
		
		scan.close();

	}

}

