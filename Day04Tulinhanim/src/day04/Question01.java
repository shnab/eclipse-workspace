package day04;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {

		/* Write a method named isEven that accepts an integer argument. 
		 The method should return true if the argument is even, or false otherwise.*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer value ");
		int num = scan.nextInt();
		System.out.println(isEven(num));
		
	}
	
	public static boolean isEven (int num) {
		if (num%2 ==0) {
			return true;
		}
		else {
			return false;
		}


	}

}
