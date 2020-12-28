package day13constructorsstatickeyword;

public class Static01 {
	
	/*
	 1) if you use static keyword for an instance variable, then it is called "class variable"
	 "age" is "instance (object) variable", "height" is class variable
	 
	 2) you can access "staic" things by using just class name
	 but to access "instance" things you have to create object.
	 Note: you want you can access to static ones by using 
	 objects as well but it is nit recommended
	 
	  Static must have seen for everyone. but instance niet for iedereen.
	 */
	
	int age = 23; // to access an instance variable i need to get an object. if you want to memory less dont use
	static int height = 6; // but i dont need to no.  

	public static void main(String[] args) {

	//you can access "static" things by using just class name/ met alleen een step
	System.out.println(Static01.height); //6
		
	// u moet met twee stap om object te nemen.
	Static01 obj1 = new Static01();
	System.out.println(obj1.age); //23
	
	//Accessing static things by using object is not recommended. heel lang weg 
	System.out.println(obj1.height);
	}
	
	//that method is 
	public static void add(int n1, int n2) {
		System.out.println(n1 + n2);
	}
	
	public void subtract(int n1, int n2) {
		System.out.println(n1 - n2);
	}


}
