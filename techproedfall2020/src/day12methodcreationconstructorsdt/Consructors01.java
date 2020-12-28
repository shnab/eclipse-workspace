package day12methodcreationconstructorsdt;

import java.util.Scanner;

public class Consructors01 {
	
	/*
	 1) Constructors are used to create objects from Classes (Object Builder)
	 2) When you create a class, Java gives you a constructor. Because Java knows classes are used to create objects.
	 3) The constructors java gave invisible inside the class, it is called "default consructor"
	 4) Syntax of the constructor is " public Consructors01() { }"
	 5) a)Constructor's name must be same with the class name
	 	b) Constructors do not have return type
	 	c) Constructors do not have return type because of that do not mention them as method
	 		constructors are not methods. Constructors are constructors.
	 6) When you create any constructor inside the class, java cancels default constructor.
	 */
	
	//Public is Accces modifier
	public Consructors01() {
		System.out.println("The constructor i created");
		
	}
	
	public Consructors01(int i) {
		System.out.println("I used the constructor with parameters");
	}

	//create a constructor with two parameters and create an object by using the constructor
	public Consructors01(String s, double d) {
		System.out.println("First parameter is " + s + " and " + "2nd parameter is " + d);
	}
	
	public static void main(String[] args) {

//Class name   object name       keywoord     Consructors
//	Scanner       scan        =    new          Scanner(System.in);
	
	Consructors01 obj1 = new Consructors01(); //default one. 
	Consructors01 obj2 = new Consructors01(5); //second Consructors01 i kullanacak
	Consructors01 obj3 = new Consructors01("Java", 8.0);
	}

}
