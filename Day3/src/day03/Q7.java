package day03;

import java.util.Scanner;

public class Q7 {

	
		/* Interview Question
		 Write a Java program to reverse a string. Use for loop and create a method called 
		  reverseString */
	
		public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your string");
		String str = scan.nextLine();
		System.out.println("your reversed string is " + reverseString(str));
	
	}
	
	public static String reverseString (String str) {
		String reversed = "";
		for (int i= str.length()-1;i>=0;i--) {
			reversed += str.charAt(i);
		}
		return reversed;

	}

}
