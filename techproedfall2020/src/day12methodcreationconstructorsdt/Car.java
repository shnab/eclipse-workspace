package day12methodcreationconstructorsdt;

public class Car {
	
	/*if you create variables out of the main method, the variables are called "instance variables"
	 if you create variables inside of the method body, the variables are called "local variables"
	 Differences between "instance" and local variables:
	  	1) When you create instance variables, no need to assign any value. Java assign any value
	 		but for local variables you need to initialize. 
	 		if you assign a value for a variable when you create it, it means you "initialized"
	 		Java assigns default values to instance variables
	 		Default value for byte, short, int, long is 0
	 					for float, double is 0.0
	 					for boolean is false
	 					for String null
	 					for char '\u0000' ==> 0
	 	2) instance variables can be used in entIre class, but local variables can be used in the method body
	 */
	
	//int price = 20000; //Bunlar henuz geen value. Asagi constructor yazinca (public Car() ) o zaman bunlar default olmasina ragmen artik default degiller
	int price;
	String make;
	String model;
	int year;
	String color;
	String engine;															
	int milage;
	boolean isGas;
	
	//bu constructor create an object
	public Car() {
		
	}
	
	public Car(int price, String make, String model, int year) {
		this.price = price; //bu parameter
		this.make = make;
		this.model = model;
		this.year = year;
		
	}
	
	
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println(car1.price); //0 bunlar default degerler
		System.out.println(car1.isGas); //false bunlar default degerler
		
		Car car2 = new Car(2000, "Audi", "R8", 2018);
		System.out.println(car2.price); //20000
		System.out.println(car2.make); //Audi
		System.out.println(car2.model); //R8
		System.out.println(car2.year); //2018
	}
	
	
	
	
	
}
