package day28interface;

public abstract class Car {

	public abstract void move(); // ABSTRACT METHOD Without method body
	
	public void diesel() { // concrete method
		System.out.println("Uses diesel");
	}

	public void gas () {
		System.out.println("Uses gas");
	}
}
