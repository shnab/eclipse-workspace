package day04;

import java.util.Random;
import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {

		
		int userWins=0;
		int comWins =0;
		
		
		Scanner scan = new Scanner (System.in);
		char answer = 'y';
		while (answer == 'y'){
		System.out.println("Please enter your choice \n1 for Rock \n2 for Paper \n3 for Scissor ");
		int userChoice = scan.nextInt();
		if (userChoice ==1) {
			System.out.println("You choosed rock");
		}
		else if (userChoice ==2) {
			System.out.println("You choosed paper");
		}
		else {
			System.out.println("You choosed Scissor");
		}
		
		Random random = new Random ();
		int comChoice = random.nextInt(3)+1;
		if (comChoice ==1) {
			System.out.println("Computer choosed rock");
		}
		else if (comChoice ==2) {
			System.out.println("Computer choosed paper");
		}
		else {
			System.out.println("Computer choosed Scissor");
		}
		
		
		if (comChoice == userChoice) {
			System.out.println("It's a tie");
		}
		
		else if (userChoice ==1 && comChoice==3 || userChoice ==3 && comChoice == 2 || userChoice == 2 && comChoice == 1) {
			System.out.println("you won");
			userWins ++;
		}
		else {
			System.out.println("computer won");
			comWins ++;
		}
		System.out.println("Would you like to continue? (y/n)");
	    answer = scan.next().charAt(0);
	    if (answer == 'n') {
	    	System.out.println("We hope you enjoyed");
	    	System.out.println("You won "+ userWins + " times");
	    	System.out.println("Computer won "+ comWins + " times");
	    	if (comWins>userWins) {
	    		System.out.println("Computer is the winner");
	    	}
	    	else if (comWins == userWins) {
	    		System.out.println("There is no winner");
	    	}
	    	else {
	    		System.out.println("You are the champ");
	    }
	    }
	    
	    else if (!(answer == 'n' || answer == 'y')) {
	    	System.out.println("Wrong choice");
	    }
	    
	    }
		
		scan.close();
		


	}

}
