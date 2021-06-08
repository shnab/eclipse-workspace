package day21encapsulationinheritance;

public class Mammal extends Animal {
	
	public Mammal() {
		//super(); ==> burada gizli bir super keyword var. Bu parent-child iliskisinden kaynaklaniyor. 
		//Ve super constructor icersinde ilk sirada yer aliyor. Run ettgimizde ilk onc eparent icindeki constructor calisiyor. 
		System.out.println("Mammal Constructor");
	}
	
	public Mammal(int a) {
		//super();
		System.out.println("Paramerized Mammal Constructor");
	}
	
	public static void main(String[] args) {
		

	}
	
	public void giveBirth () {
		System.out.println("They give birth "); 
	}
	public void feedBaby () {
		System.out.println("They feed baby");
		
	}
	
	public void eat() {
		System.out.println("Mammals eat food");
	}

}
