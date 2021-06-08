package day5;

import java.util.Scanner;

public class Question07 {
	
	public static void main(String[] args) {

		/* Ask for a letter from the user. If it is a vowel print it's a vowel else 
		 * print consonant. If it's not a letter or greater than one char print an error 
		 * message. (The input is case sensitive)
		 * Vowel letters : a,e,i,o,u
			
		 */
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter your char please :");
		String in = input.next().toLowerCase();
		//boolean uppercase = in.charAt(0)>='A' && in.charAt(0)<='Z';
		boolean lowercase = in.charAt(0)>='a' && in.charAt(0)<='z';
		boolean vowel = in.equals("a") || in.equals("e") || in.equals("i") || in.equals("o") || in.equals("u");
		
		
		if (in.length()>1) {
			System.out.println("Choose a char please");
		}
		
		else if (!(lowercase)) {
			System.out.println("Please enter a letter");
		}
		else if (vowel) {
			System.out.println("It is a vowel");
			
		}
		else{
			System.out.println("It is a consanant");
		}

		
		
		

	}
}