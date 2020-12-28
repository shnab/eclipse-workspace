package day04ifelsestatementnt;

import java.util.Scanner;

public class IfElse01 {

	public static void main(String[] args) {


		/*
		 if it rains i will cancel the picnic else i will not.
		 
		 */
		
		if(5>3) {
			System.out.println("If body"); //If body
		} else {
			System.out.println("Else body");
			
		}
		
		/*
		 Ask user to enter an integer. if the integer is even, print EVEN
		 else print ODD onthe console
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num = scan.nextInt();
		 
		//1. way by using if else statement
		if(num%2==0) {
			System.out.println("Even ");
		}else {
			System.out.println("Odd");
		}

		System.out.println("=======");
		//2. way by using if statement
		
		if(num%2==0) {
			System.out.println("Number is even ");
		}if (num%2!=0){
			System.out.println("Number is odd");
		}
	}

}
