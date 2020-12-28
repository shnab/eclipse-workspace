package day04;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		
		/* A palindrome is a word, phrase, number or sequence of words 
		 * that reads the same backward as forward.
		 *  madam or racecar veya 10801
		 *  Write a method to check if the word or number is palindrome
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your value to check is palindrome or not");
		String str = scan.nextLine().toLowerCase().replace(" ", "").trim();
		 
		boolean result = isPalindrome (str);
		if (result) {
			System.out.println("This string is palindrome");
		}
		else {
			System.out.println("This string isn^t palindrome");
		}
		
	}
	
	public static boolean isPalindrome (String str) {
		String reverse ="";
		int count = str.length()-1;
		for (;count>=0; count--) {
			reverse = reverse + str.charAt(count);}
		if (reverse.equals(str)) {
			return true;
		}
		else {
			return false;
		}

	}

}
