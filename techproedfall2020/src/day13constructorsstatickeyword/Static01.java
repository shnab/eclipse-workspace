package day13constructorsstatickeyword;

public class Static01 {
	
	/*
	 * STATIC keyword IS LIKE a moon on the sky
	 1) if you use static keyword for an instance variable, then it is called "class variable"
	 "age" is "instance (object) variable", "height" is class variable
	 
	 2) you can access "staTic" things by using just class name.
	 //System.out.println(Static01.height);
	 But to access "instance" things you have to create object.
	 //Static01 obj1 = new Static01();
	 Note: you want you can access to static ones by using 
	 objects as well but it is not recommended
	 
	  Static must have seen for everyone. but instance niet for iedereen.
	  Degeri degistirsek bile tum obj ler icin o deger ortak olur. 
	 */
	
	int age = 23; // to access an instance variable i need to get an object. if you want to memory less dont use
	static int height = 6; // but i dont need to no.  

	public static void main(String[] args) {

	//you can access "static" things by using just class name/ met alleen een step
	System.out.println(Static01.height); //6
		
	// u moet met twee stap om object te nemen.
	Static01 obj1 = new Static01(); //burada 2 step oluyor age variable ulasmak icin. oNCE OBJ CREATION SONRA CAGIRMA
	System.out.println(obj1.age); //23
	
	//Accessing static things by using object is not recommended. heel lange weg 
	System.out.println(obj1.height);
	}
	
	//that method is static
	public static void add(int n1, int n2) {
		System.out.println(n1 + n2);
	}
	
	//that method is not static
	public void subtract(int n1, int n2) {
		System.out.println(n1 - n2);
	}


}
