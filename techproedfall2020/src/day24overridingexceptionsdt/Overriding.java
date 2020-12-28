package day24overridingexceptionsdt;

public class Overriding {
	
	/*
	 1) final, static and private methods CANNOT be overridden
	 final: final method means, method body cannot be changed but in overriding
	 our goal is to change the method body. 
	 Because of that Java does not allow to override final methods.
	 
	 static : static things are common for all objects. When you change them,
	 it will be changed for all objects. Because of that no need to override to change 
	 method body
	 
	 Private: To override a method you have to access it first.
	 But private methods cannot be accessed from other classes. Do not forget 
	 for private class members, you can do nothing from the other classes except creating getters or setters.
	 
	 2) O fyou do not put "@Override" annonation, Java does not check Override rules 
	 	and does not give com;pile time error. If you do not put "@Override"  annonation Java will accept the methods completely 
	 	diffrent methods and you will not get any Compile Time Error
	 
	 3) What is the differences between "Method overloading" and "Method Overriding"
	 		a) In method overloading we change method signature ( We are changing parameters)
	 		But in method Overriding we do not touch method sinature.
	 		b) "In method Overloading" we do not change method body most of the time, but 
	 		"Method Overiding" we change the method body most of the time.	 		
	 		c)"In method Overloading" we work in the same class, we do not need inheritance, but 
	 		in "Method Overiding" we work in the diffrent classes we need inheritance. 
	 		If there is no inheritance there is no "Method Overiding"
	 		d) "Method Overloading" is done in Compile Time Error, because of that "Method Overloading"  is called
	 		"Compile Time Pollymorphism" . "Method Overiding" is done in Run Time, because of that "Method Overiding" is called "Run Time Polymorpism"
	4) What is the "Polymorphism" in Java?
		"Polymorphism" is "Method Overriding" and  "Method Overloading"
		
	 5) Explain "final" keyword in Java. 
	 	a) Final variable: If you use "final" keyword for a varibale, it means you cannot modify 
	 					   its value
	 					   If you use "final" keyword for a varibale, you have to "initialize" it. 
						   Otherwise, you will get CTE
						   if you use "final" keyword vor a varibale, name it by using UPPERCASES
		b) Final Methods: If you use "final" keyword for a method, it means the method cannot be overridden. 	
							If you want the implementation of a method to be un changable make it final
							So, nobody can not change the method body. 
							
		c) Fimal classes : If you use "final" keyword for a class cannot have a child class.
		 				   Child classes can not be inherited.Other classes cannot extend to the final class.
	 */
	
	final int AGE = 23; //initalizing yani esitleme. Final can not be chanced
	
	public static void main(String[] args) {
		Overriding obj = new Overriding();
		System.out.println(obj.AGE);
	}
	
	
	

}
