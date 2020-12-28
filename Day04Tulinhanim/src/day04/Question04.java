package day04;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {

		//Write a method to find the biggest of three number 
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your three number please ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		biggestNumber(num1, num2, num3);
		
	}
	
	public static void biggestNumber (double a, double b, double c) {
		if (a>b && a>c) {
			System.out.println("The biggest is "+a);
		}
		else if (b>a && b>c) {
			System.out.println("The biggest is "+ b);
		}
		else if (c>a && c>b) {
			System.out.println("The biggest is " + c);
		}
		else {
			System.out.println("They are equal");
		}


	}

}
