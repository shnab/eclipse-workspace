package day13constructorsstatickeyword;

public class Animal {
	
	// behind the Animal class has a default contructor. When i create the that one Java calcels other
	int age; //i didnt assign to any value
	String name;
	int weight;
	boolean isCarnivorous;
	
	//bu ilk consructor herhangi bir parameter yok icinde 
		public Animal() {
		this("Cat", 25); // constructor call her zaman ilk siraya yaziliyor.
		this.age = 5; //without parameter but updating the age
		System.out.println("Age from the consructor without parameter: " + age);
	}
	
	//changing access modifier compleining protected yazsak da olmuyor. 
	//This means in this class
	public Animal(String name, int weight) {
		//this(); //iki consrictor u ayni anda together kullanmak icin. bu yukaridaki bos constructor u da kullaniyor.
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
		Animal a2 = new Animal(); //Is the animal carnivorous: true
								//Name and weight from the consructor with 2 parameters: Cat - 25
								//Age from the consructor without parameter: 5
		
		

	}

}
