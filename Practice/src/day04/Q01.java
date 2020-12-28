package day04;

import java.util.Random;
import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {

		/*
		 rock paper and sciccors game (Tas kagit makas)
		 1 for rock
		 2 for paper
		 3 for sciccors
		 */

		
		int userWins =0;
		int comWins =0;
		Scanner scan = new Scanner (System.in);
		char answer = 'y';
		while (answer == 'y') {
			System.out.println("Enter your choice ? \n1 for Rock \n2 for Paper \n3 for Scissors");
			int userChoice = scan.nextInt();
			if (userChoice == 1) {
				System.out.println("You choosed Rock");
			}
			else if (userChoice ==2) {
				System.out.println("You choosed Paper");
			}
			else {
				System.out.println("You choosed Scissors");
			}
			
			Random random = new Random ();
			int comChoice = random.nextInt(3)+1;
			
			if (comChoice ==1) {
				System.out.println("Computer choosed Rock");
			}
			else if (comChoice == 2) {
				System.out.println("Computer choosed Paper");
			}
			else {
				System.out.println("Computer choosed Scissors");
			}
			
			if (userChoice == comChoice) {
				System.out.println("That is a tie");
			}
			else if (userChoice == 1 && comChoice == 3 || userChoice ==2 && comChoice ==1 || userChoice ==3 &&  comChoice ==1) {
				System.out.println("User wins");
				userWins ++;
			}
			else {
				System.out.println("Computer wins");
				comWins ++;
			}
			
			System.out.println("Would you like to continue y/n");
			
			answer = scan.next().charAt(0);
			if (answer == 'n') {
				System.out.println("We hope you enjoyed");
				System.out.println("You won "+ userWins +" times");
				System.out.println("Computer won "+ comWins + " times");
		
			if (comWins > userWins) {
				System.out.println("Computer is the champ");
			}
			else {
				System.out.println("You are the champ");
			}
			}
			
			else if (!(answer== 'n'|| answer == 'y')) {
				System.out.println("You made a wrong choice");
			}
				
			
		}

	}

}
