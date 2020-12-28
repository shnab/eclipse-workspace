package day03TulinMungan;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args, double input) {
	
		//create an ATM project with switch case
		// the first balance is given
		/*
		 1 withdraw
		 2 deposit
		 3 check
		 4 exit
		 */
		
		double balance = 5000;
		System.out.println("Welcome to X BANK ");
		
		Scanner input = new Scanner(System.in);

		System.out.println("Which operation would you like to perform ? \n1 for withdraw"
				+ "\n2 for deposit \n3 for checking \n4 for Exit");
		int choice = input.nextInt();
		
		switch (choice) {
		case 1 :
			System.out.println("How much money would you like to withdraw");
			double withdraw = input.nextDouble();
			
			if (balance>=withdraw) {
				System.out.println("You can get your " + withdraw + " $");
				System.out.println("Your new balance is " + (balance-withdraw) + "$");
			}
			
			else {
				System.out.println("Your balance isn't sufficient");
			}
			break;
		case 2:
			System.out.println("How much money would you like to deposit");
			double deposit = input.nextDouble();
			
			System.out.println("You have " + (balance+deposit) + " $");
			break;
			
		case 3:
			System.out.println("You have "+ balance + " $ ");
			break;
		
		case 4:
			System.out.println("You can cancel");
			break;
			default: 
				System.out.println("You entered an invalid number");
		}
		
		input.close();
	}

}
