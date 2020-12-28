package day19varargsaccessmodifierdt;

import day18passbyvaluepassbyreferencedatetime.AccessModifiers03; // Import yaptik from other package

public class AccessModifiers02 {

	
	public static void main(String[] args) {

		AccessModifiers01 obj1 = new AccessModifiers01();
		System.out.println(obj1.publicage); //25
		System.out.println(obj1.defaultAge); //27
		
		//If you want to use a class from another package, you need to import
		AccessModifiers03 obj2 = new AccessModifiers03();
		
		
	}

}
