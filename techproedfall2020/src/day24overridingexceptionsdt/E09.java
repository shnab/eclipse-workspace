package day24overridingexceptionsdt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E09 {
	
	/*
	 1) "Throws" keyword is used ahter the method parenthesis before the "{"
	 	"throw" keyword is used in method body
	 2)By using Throw keyword you can throw just one exception, but using "Throws"
	 	keyword you can throw multiple exceptions by putting comma between them.
	 3) "throw" keyword is usedd to throw Exception explicitly whereever you want
	 	"throws" keyword can be used just once in the method signature line.
	 4) After "throw" keyword we have to create an Exception Class object because of that
	 we have to use "new" keyword and "constructor" but after "throws " keyword 
	 we use just name of the Exception Class
	 */

	public static void main(String[] args) throws ArithmeticException, IOException {

		FileInputStream fis = new FileInputStream ("src/day25exception/TextFile");
		fis.close();
		
		int age = 12;
		if (age<0) {
			throw new IllegalArgumentException();
		} else {
			System.out.println(age);
		}

	}

}
