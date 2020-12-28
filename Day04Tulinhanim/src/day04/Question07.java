package day04;

import java.util.Scanner;

public class Question07 {

	public static void main(String[] args) {

		/* Write a method to find the prime numbers
			starts with 2
		 numbers should be divided by 1 and themselves only
		 */

		// Write a method to find the prime numbers
		/* starts with 2
		 * numbers should be divided by 1 and themselves only
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your value ");
		int num = scan.nextInt();
		
		boolean result = isPrime(num);
		if (result) {
			System.out.println("The number is prime");
		}
		else {
			System.out.println("The number isn't prime");
		}
		}
	
	public static boolean isPrime (int num) {
		int count =0;
		for (int i=1; i<=num; i++) { 
			if (num%i==0) { 
				count ++; 
			} 
		}
		if (count ==2) {
		return true;
		
	}
		return false; 

	}

}
