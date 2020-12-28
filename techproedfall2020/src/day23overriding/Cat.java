package day23overriding;

public class Cat extends Animal {

	@Override
	public void sound () {
		System.out.println("Cats meow");
	}
	
	@Override
	protected void eat () {
		System.out.println("Cats like cheese");
	}
	
	@Override
	public Cat create () { // All classes can be used as a return type
		return new Cat (); // if retunr type different from void, we must type return word
	}
	
	@Override
	public Long add() {
		return (long) 12;
	}
}
