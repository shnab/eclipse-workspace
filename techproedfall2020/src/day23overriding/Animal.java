package day23overriding;

public class Animal {
	
	
	protected void sound () {
		System.out.println("Animals make sound");
	}

	void eat () {
		System.out.println("Animals eat food");
	}
	public Animal create () {
		return new Animal ();
	}
	
	public Long add () {
		return (long) 1234;
	}
}
