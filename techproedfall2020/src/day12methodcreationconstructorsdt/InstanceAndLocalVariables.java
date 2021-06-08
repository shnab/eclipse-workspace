package day12methodcreationconstructorsdt;

public class InstanceAndLocalVariables {
	
	/*
	 1) if you create a variable outside of main method, it is called 'instance variable'
	 
	 	a)If there is no assinment for instance variables, no need to worry. Java wil assign them
	 	default values
	 	Byte, short, long, Int 0
	 	For char 0,
	 	String null
	 	Float, double 0.0
	 	boolean false
	 	
	 	b)Instance vaiables can be used in entire class but local variables can be used just inside the method which you created in
	
	
	 2) If you create a variable inside a method, it is called 'local variable'
	 	
	 	a) DO not forget to initialize local variables. if you try to use local variables before initializing Java comleining
	 */
	
	static int i; //instance variables ==> classin her yerinde kullanabiliriz
	static boolean b;
	static double d;

	public static void main(String[] args) {

		int k = 7;
		
		System.out.println(i + " -" + b + "- " + d);
		

	}
	
	public static void add(int n1, int n2) {
		
		 int m =11; //bunu assign etnek gerekiyor yoksda complein
		 
		 i++;
	}

}
