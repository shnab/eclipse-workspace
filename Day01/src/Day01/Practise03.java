package Day01;

import java.util.Scanner;

public class Practise03 {

	public static void main(String[] args) {
	
		
		/*
		 U have 2 numbers
		Using Multi-Branch if statements, check if num1 and num2 are equal, or not. 
		Please follow the below examples and print message accordingly:
		
		Enter 2 numbers:
		10
		10
		10 and 10 are equal
		Enter 2 numbers:
		100
		55
		100 is greater than 55
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enetr first number");
		int num1 = scan.nextInt();
		
		System.out.println("Enter second number");
		int num2 = scan.nextInt();
		
		if(num1==num2) {
			System.out.println(num1 + " and " + num2 + " are equals");
		}else if(num1 > num2 ) {
			System.out.println(num1 + " is greater than " + num2);
		}else {
			System.out.println(num2 + " is greater than " + num1);
		}
		}
	
}
