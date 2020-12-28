package day21encapsulationinheritance;

public class NormalCalculator extends SimpleCalculator {


		public static void absolute(double a) {
			System.out.println("The absolute value is " + Math.abs(a));
		}
		

		public static void sqrRood(double a) {
			if(a>=0) {
				System.out.println("The square root is " + Math.sqrt(a));
			} else {
				System.out.println("Square root does not with negative numbers");
			}
			
		}

}
