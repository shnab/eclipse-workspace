package day12methodcreationconstructorsdt;

public class MethodCreation01 {

	public static void main(String[] args) {
		
			add(5.0,4); //9.0
			add(3,4); //7==> java gebruikt de makkelijker
			add(3.0, 4.0);//7.0

	
	}

	/*
	 create 3 methods whose names are "add"
	 1st one has 2 int parameters
	 2nd one has 2 double parameters
	 3rd one has 1 int, 1 double parameters.
	 
	 */
	/*
	 1)if there is complete match, java uses the complete match method
	 2)if there is no complete match, java select the method which has Auto Widening
	 3) if there is no complete match and Auto Widening, java wil give Compile Time Error
	
	
	 */
	public static void add(int a,int b) {
		System.out.println(a+b);
	}
	public static void add(double a,double b) {
		System.out.println(a+b);
	}
public static void add(int a,double b) { // 5.0, 4 icin int kullanilmaz. Int to double possible. andersom niet mogelijk
	System.out.println(a+b);
}
	
	
}
