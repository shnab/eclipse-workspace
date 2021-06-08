package day21encapsulationinheritance;

public class EnCapsulation01 {
	
	/*
	 1) we use "encapsulation" to hide data and method implementations. 
	 you should some information
	 2) "encapsulation" SHOLUD have following characteristics
	  	a) Everyone knows how to access to the encapsulated data or method
	  	b) It should be used easily even the code is complicated
	  	c) There should not any effects to the code, to the rest of the application
	  	
	 3) How to make encapsulation 
	 		a) Make the access modifier "private"
	 		b)Create "getter" and "setter" methods.
	 			"getter" method is used to read encapsulated data (Tc min okunmasini istemem)
	 			"setter" is used to update the encapsulated data (Kimsenin adimi degistrimesini istemem)
	
	 4) The advantages of Encapsulation 
	 	a) it gives us flexibility, whenever we want we can update encapsulated data by using setter methods
	 	b) Reusability (Ulasilabilir), we create getter and setter just once and use them again and again from diffrent classes
	 	c) Maintainability , by using setter methods we can update the value whenever we want
	
	 5) After creatin private variables, if you do not create any setter method, it means nothing will be updated in the class. Because of that the class is called "Immutable class'
	 */
	
	private String collegeName = "FIU"; //User kan read mijn name
	private int age = 23;
	private boolean old = false; 

	public static void main(String[] args) {
		
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//For booleans getter methods name starts with "is". is olmazsa iyi practise degil
	public boolean isOld() {
		return old;
	}

	public void setOld(boolean old) {
		this.old = old;
	}
	
	/*
	 
	//How to create "getter" method. Getter method most be always public
	public String getCollegeName() {
		return collegeName;
	}
	
	//How to create setter method. // public void  olmali. Action yapiyor ondan dolayi
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName; //bu sagdaki parameter, soldaki isim
	}
	

	 */

	
}
