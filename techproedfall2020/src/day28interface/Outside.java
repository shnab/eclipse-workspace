package day28interface;

public interface Outside {
	
	/*
	 * VARIABLES in INTERFACE
	 1)When you create a variablle in an interface
	 you must initialize (assign a value) it. bi degere esitle int NUM = 12;
	 2) Final variables are made bold. In an interface  
	 all variables are "final" as default. Can not updated yani
	 In an interface all variables have constant (sabit) values.
	 3) All variables in an interface are "static" dus all child can see changes
	 4) Access modifiers of all variables are "public"
	 	Note: public final static int num = 12; is same with "int num= 12;" 
	 	Note: For names of final variables, use UPPERCASES for all characters. "int NUM= 12;"
	 5) Until Java 8, it was impossible to create "concrete methods" in an interface.
	 	buT in Java 8, Java gave us an option to create "concrete method" in an interface 
	 	by using "default" or "static" keywords. 
	   Note: "Default" keyword which you use to create concrete method in an interface
	 	is not access modifier.
	 
	 */

	int NUM = 12; // must constant value and with UPPERCASE
	int PRICE = 30000; 
			
	void tire(); //everytime methods are public and abstract as default. Void is return type. Return typr must
	public void hood();
	public void headLight();
	void clean(); //bu metodu inside icine de koyduk
	
	public default void polish() { // to concrete method in interface we use DEFAULT keyword // Istisna
		System.out.println("Polish the car"); //this is not abstract so no need to overriden. But if you want you can override
		
	}
	
	public static void sunroof() { // to concrete method in interface we use STATIC keyword as well
		System.out.println("It has sunroof");
	}
	
	
	
		// num = num +2; // Final variable and can not be changed

}
