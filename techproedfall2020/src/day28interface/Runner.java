package day28interface;

public class Runner {

	public static void main(String[] args) {
		
		//we can not create object from interface classes. Because abstract
		//we can call all methods by creating object by using Honda class objects
		//Interfaces are open to multiple inheritance but classses not suitable
		Honda c1 = new Honda ();
		c1.move();
		c1.gas();
		c1.seat();
		c1.steerinWheel();
		c1.radio();
		c1.tire();
		c1.hood();
		c1.headLight();
		c1.color();
		c1.windowtint();
		c1.clean(); //bu method is in the both inside and outside
		
		/*
		 If you use "DEFAULT" keyword to create concrete method in an interface
		 you can access them JUST by using objects. ==>c1.polish();
		 But if you use "static " keyword to create concrete methods in an interface
		 you can access them just by using "interface name"  ==>Outside.sunroof();
		 */
		c1.polish(); // Polish the car // we are getting first time method with method body from the interface Outside
		Outside.sunroof(); // This method has method body and so concrete method .
							//We can call direct it without Syso with interface name only. 
		
		/*
		All variables are STATIC in interfaces, because of that 
		we use "interface names" to access them. If you use 
		object to access variables in an interface, Java will give you any one of them. 
		To make sure to select a specific variable you have to use interface names
	
		 */
		System.out.println(Outside.PRICE); // 30000 // we are using interface names to access variables. Because we have 2 same variables but different values.
		System.out.println(Inside.PRICE); //20000
		
		
		/*
		 For unique variables, if you use object to access the variable, it 
		 works but it is not recommended because we prefer to access static class members "class names" 
		 or "interface names"
		 */
		System.out.println(c1.NUM); //12 ==> Not recommended
		System.out.println(Outside.NUM); //12 ==>Recommended// Class or Interface name kullanmak daha mantikli

		}

}
