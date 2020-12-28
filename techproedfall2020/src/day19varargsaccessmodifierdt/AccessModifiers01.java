package day19varargsaccessmodifierdt;

public class AccessModifiers01 {

	/*
	 1) if a class member is a private, it cab be seen, used. accessed just from inside the class
	 If you are in a different class, private class members cannot be seen, used, accessed.
	
	 2) If a class member is "Default", it cannot be seen, accessed, used from other packages // impossible
	  DEFAULT and package private are synonims
	  
	  3) if a class is public it can be accessed from everywhere, there is no any restriction
	
	  4) If a class is "Protected", it can be accssed from the package and 
		it can be accessed from classes in different packages if the class is child class
	 */
	private int privateage = 23; //age is an instance variable
	public int publicage = 25;
	int defaultAge = 27;
	
	public static void main(String[] args) {

		

	}

}
