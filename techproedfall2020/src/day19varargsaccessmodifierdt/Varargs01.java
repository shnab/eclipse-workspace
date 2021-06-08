package day19varargsaccessmodifierdt;

public class Varargs01 {
	
	//Create a method which adds 2 integers
//	}
//	public static void add(int a, int b) {
//		System.out.println(a + b);
//	}
	//public static void add(int a, int b, int c) {
//		System.out.println(a + b +c);
//	} 
	
	/*
	 1) If you use Varargs in a method paranthesis, always it should be last parameter
	 You cannot use more than 1 varargs in a method parenthesis
	 */

	public static void main(String[] args) {

		addByVarargs(3,5);
		addByVarargs(3,5,10); 
		addByVarargs();
		addByVarargs(2); //2
		addByVarargs(2,4,6,8,10);
		multiplyVarargs("REsult: ", 2 , 3, 4, 5); // 120.0
	}

	
	//Varargs is like a list. sonuna sadece ...(uc nokta) koyuyoruz. er is geen limit
	public static void addByVarargs(int... a)  {
		int sum = 0;
		for(int w : a) {
			sum = sum + w;
		}
		System.out.println(sum); //30
	}
	
	public static void multiplyVarargs(String s, double... b) { // Varargs SON sirada oluyor.
		double product = 1;
		for(double w : b) {
			product = product * w;
		}
		System.out.println(s + product);
	}
}
