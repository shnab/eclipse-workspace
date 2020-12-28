package day03;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {

		/*Write a Java program to take the last three characters from a given string and
		 *  add the three characters at both the front and back of the string. 
		  String length must be greater than three and more.
			INPUT      : Ankara  6 3 length-3
		    OUTPUT  : araAnkaraara */
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a string please");
		String str = scan.nextLine();
		
		System.out.println(str.substring(str.length()-3)+str+str.substring(str.length()-3));


	}

}
