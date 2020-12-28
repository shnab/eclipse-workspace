package day22inheritance;

public class Car extends Vehicle {
	
	/*
	 When you create a constructor with parameter in parent class, 
	 Java will remove the default constructor from parent class 
	 
	 When you a create a contsructor in child class, it will look for the 
	 deafult constructor from parent class automatically. Bu tit is removed 
	 Because of that java complains, to stop complainig 
	 you must call the existing parent constructor by using SUPER keyword
	 
	 Homework: Expalin de differences 
	 			a) Super() and this ()
	 			b)  super and this 
	 			c) super() super
	 			d) this() and this
	 */

	public int price =10;
	public String make = "Toyota";
	
		public Car() {
		super(5);
		System.out.println(this.price);  //10, burada this bu class i isaret ediyor. Java closest olani kullanior.
		System.out.println(super.price); //20
		System.out.println("Car no-parameter");
		
	}

	public Car(String make) {
		super(7);
		System.out.println("Car with parameter");
	}
	
	
	
}
