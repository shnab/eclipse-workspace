package day13constructorsstatickeyword;

public class Animal {
	
	// behind the Animal class has a default class. When i create the that one Java calcels other
	int age;
	String name;
	int weight;
	boolean isCarnivorous;
	
	//bu ilk consructor herhangi bir parameter yok icinde 
	public Animal() {
		this("Cat", 25);
		this.age = 5;
		System.out.println("Age from the consructor without parameter: " + age);
	}
	
	//changing access modifier copleining 
	//This means in this class
	public Animal(String name, int weight) {
		//this(); //iki consrictor u ayni anda kullanmak icin. bu yukaridaki bos constructor u da kullaniyor.
		this(true);
		this.name = name;
		this.weight = weight; 
		System.out.println("Name and weight from the consructor with 2 parameters: " + name + " - " + weight);
		
	}
	
	//bu true gelen constructor yukaridaki true
	public Animal(boolean isCarnivorous) {
		this.isCarnivorous = isCarnivorous;
		System.out.println("Is the animal carnivorous: " + isCarnivorous);
	}	
		
	public static void main(String[] args) {
		
		//Create an object 
		
	//	Animal a1 = new Animal(); // bunu simdilik sildik. This () yaparak, iki consructor ayni  anda kullanilabiliyor. 
		Animal a2 = new Animal();
		
		

	}

}
