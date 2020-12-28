package day03;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {


		/*Perfect number, a positive integer that is equal to the sum of its proper divisors. 
		 * The smallest perfect number is 6, which is the sum of 1, 2, and 3.
		 */
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter a number please :");
	int num = scan.nextInt();
	boolean result = isPerfect (num);
	if (result == true) {
		System.out.println("It is a perfect number");
	}
	else {
		System.out.println("It isn't perfect");
	}
	}
	
	public static boolean isPerfect (int num) {
		int sum =0 ;
		for (int i=1; i<num; i++) {
			if (num%i==0) {
				sum+=i;
			}
		}
		if (sum==num) {
			return true;
		}
		else {
		return false;
	}
	}

}
