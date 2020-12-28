package day21encapsulationinheritance;

public class Runner {
	
	
	/*
	 1) Object class is the parent class of all classes in java (like Adem babamiz)
	 2) in java just Object class doesn't have parent class 
	 3)Common features of all classes in Java are stored in object Class. Dus no need to extends to object class
	 */

	public static void main(String[] args) {
		
		Mammal m1 = new Mammal(5); //Paramerized Mammal Constructor
									// This is constructor to create object and to call other classes
		m1.feedBaby();
		m1.giveBirth();
		m1.drink();
		m1.eat();
		m1.move();
		
 
 
		System.out.println("===========");
		
		Cat c1 = new Cat();
		c1.meow();
		c1.feedBaby();
		c1.giveBirth();
		c1.drink();
		c1.eat();
		c1.move();
		
	
		System.out.println("===========");
		
		Dog d1 = new Dog ();
		d1.bark();
		d1.drink();
		d1.eat(); // Bu method hem parentclass'ta var hem de Mammal class'ta. Ama deger Mammal class'tan geliyor. 
		d1.feedBaby();
		d1.giveBirth();
		d1.smelWell();
		d1.move();
		
		
		System.out.println("===========");
		
		Fish f1 = new Fish ();
		f1.liveUnderWater();
		f1.drink();
		f1.eat();
		f1.move();
		
		
	
	}

}
