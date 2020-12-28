package day03;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {


		// Ask two numbers to the user
		// The user has to choose an operation (+,-,*,/)
		// Print the result
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter first number please");
		double num1 = input.nextDouble();
		System.out.println("Enter second number please");
		double num2 = input.nextDouble();
		System.out.println();
		
		System.out.println("Which operation do you prefer?\n1 for Sum\n2 for Abstract"
				+"\n3 for Multiplication\n4 for Division" );
		
		int operation = input.nextInt();
		
		switch(operation) {
		case 1:
			System.out.println("The result of Sum Operation is"+" "+ (num1+num2));
			break;
			
		case 2:
			System.out.println("The result of Abs Operation in"+ " "+ (num1-num2));
			break;
			
			case 3:
			System.out.println("The result of Multiplication Operation in"+ " "+ (num1*num2));
			break;
			
		case 4:
			System.out.println("The result of Division Operation is"+" "+ (num1/num2));
			break;
			default:
				System.out.println("Wrong choice");
	}
		input.close();

	}

}
