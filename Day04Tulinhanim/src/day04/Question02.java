package day04;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {


		/* 
		 * Get a sentence from the user and find the words number
		 */
			Scanner scan = new Scanner (System.in);
			System.out.println("Enter your sentence ?");
			String str = scan.nextLine();
			System.out.println("The words number in your sentence is "+ countWord(str));
		}
		
		public static int countWord (String str) {
			String [] arr = str.split(" ");
			return arr.length;

	}

}
