package day03;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {

		/*
		 * Interview questions…
		 * 
		 * write a return method to reverse number 
		 * 
		 * Input : 12345 Output : 54321
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number please: ");
		int num = scan.nextInt();
		
		System.out.println("The reverse value of your number "+ reverseNumber(num));
	
	}
	
	public static int reverseNumber (int num) {
		int temp=0;
		int reverse =0;  
		while (num>0) { 
			temp = num %10 ; 
			num/=10;  
			reverse = reverse*10 + temp ;
		}
		return reverse ;


	}

}
