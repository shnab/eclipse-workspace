package day21encapsulationinheritance;

public class SimpleCalculator {

	public static void add(double... v) {
		double sum = 0;
		for(double w: v) {
			sum = sum +w;
		}
		System.out.println("The sum is " + sum);
	}


	public static void multiply(double... v) {
		double product= 1;
		for(double w: v) {
			product = product * w;
		}
		System.out.println("The product is " + product);
	}
	
	public static void divide(double a, double b) {
		if(b!=0) {
			System.out.println("The result is " + a/b);
		} else {
			System.out.println("Do not divide by 0");
		}
	}
		
		public static void subtract(double a, double b ) {
			System.out.println("The result is " + (a-b));
		
	}
}
