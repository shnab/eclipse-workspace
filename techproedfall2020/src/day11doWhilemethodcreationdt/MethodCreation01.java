package day11doWhilemethodcreationdt;

public class MethodCreation01 {
	
	/*
	 Create a methdod which adds two numbers.
	 Call the method from inside the main method.
	*/
	public static void main(String[] args) {//args ==> "arguments"
		//If you use specific values when you call a method, they are called "arguments"
		add(13,2.3);//15.3
		add(0.2, 2.8);//3.0
		//Method selection is done by Java like that: a)Looks at the method names first
		//    if the names are same                   b)Looks at the parameters than
		add(1, 2, 3);
		
		
		multiplication(2, 3, 4);
		
		//If you use return type different from "void", put the method call in System.out.println()
		//to see the output on the console.
		System.out.println(division(6, 2));//3.0
		
		System.out.println(subtraction(12.3, 8));//4.3
		
		/*
		 If you need to use same method name you have 3 options to make the methods different
		 a)Use different numbers of parameters 
		 b)Make the data types of parameters different
		 c)If the data types of parameters are different, change the order
		 */
		
		/*
		Overloading:  if you create methods with the same name by changing parameters . It is called "Method overloading"
		 */
		}
	
	//If you create variables inside the main method, they are called "parameters"
	//use static keyword in static methods
	public static void add(double num1, double num2) {	
		System.out.println(num1 + num2);
	}
	
	public static void add(int n1, double n2) {
		System.out.println(n1 + n2);
	}
	
	public static void add(double n2, int n1) {
		System.out.println(n1 + n2);
	}
	

	public static void add(double num1, double num2, double num3) {
		System.out.println(num1 + num2 + num3);
	}
	
		
	//Create multiplication method which multiplies 3 numbers and call the method from main method
	public static void multiplication(double n1, double n2, double n3) {
		System.out.println(n1*n2*n3);
	}
	
	//If you use return type different from "void", you have to use "return" keyword at the end 
	//(return keyword must be used in the last line in method body)
	public static double division(double n1, double n2) {
		return n1 / n2; //we can not use syso here
	}
	
	//Create subtraction method, make the return type "double".Call the method from main method
	//print the result on the console.
	public static double subtraction(double n1, double n2) {	
		double result = n1 - n2;	
		return result;
	}
	
}
