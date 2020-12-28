package day14staticblockarrays;

public class StaticBlock01 {

	/*
	 1) Static Block is a code block, it is used to initialize "class variables"
	 2) Static block runs before everything inside the class
	 3) If you have multiple "static block", first one runs first
	 */
	
	static double pi; //0.0
	static String shape;
	static {
		pi = 3.14; // Burasi "static block" double in onune static yazmazsak Java compleining
	}
	
	static {
		shape = "Circle";
	}
	
	public static void main(String[] args) {
		System.out.println(shape + areaCircle(10));
		System.out.println(shape + periCircle(5));

	}
	
	public static double areaCircle(double r) {
		return pi * r * r;
	}
	
	public static double periCircle(double r) {
		return 2 * pi *r;
	}
}
