package day21encapsulationinheritance;

public class Dog extends Mammal {

	/*
	 1) If you create parent (super class)-Child (sub) relationship  between the classes 
	 "child class (sub class)" can use every class member whose 
	 access modifier is "public" or "protected".
	 
	 "private" class members can not be used from other classes even they are child classes. 
	 (without getter en setter is not possible)
	 
	 "default" class members can be used from inside the package 
	 because of that if the child class is in the same package 
	 with the default class member, they can be used.
	 
	 2) To create parent-child relationship we use "extends" keyword.
	 
	 3) Parent class can not use the class members from the child class. 
	 
	 4) Advantages of "parent-child relationship" (inheritance)"
	 	a) Reusability; You put common features into parent class than 
	 					all child classes will be able to use it. 
	 	b) Less coding: If you do not put common features int parents class,
	 					you should put it into every child class one by one. It needs to type same code again en again
	 	c) MAINTAIN : If you neeed to update something, it will be easy because, when you update the method 
	 					in parent class the method will  be updated for all child classes.
	 
	 5) in Java, a child class can not have multiple parents. More than a family not possible. 
	 Java does not support multiple inheritance. Because, multiple inheraitance creates 
	 problem with the parent classes have the methods whose names are same.
	 
	 6) If you have methods whose names are same in parent classes, child class will use the closest one.
	 
	 7) a) If a parent class has multiple child classes,
	   that kind of inherintace is called "Hierarchic Inheritance".
	   b) if there is child-parent-grandparent .., it is called "Multilevel inheritance"
	 */
	
	public Dog () {
		System.out.println("Dog constructor");
	}
	public static void main(String[] args) {


	}
	
	public void bark () {
		System.out.println("Dogs bark");
		
	}
	public void smelWell () {
		System.out.println("Dogs smel well");
		
	}

}
