package day04;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {

		/*
		There is a lonely monkey in the island 
		He needs to eat 4 bananas every day
		there are just 165 bananas in that island 
		Create following variables and find how many days 
		monkey can survive.
		Use do while loop, increment and decrement and if statements
		int numberOfBananas =165, survivalDays = 1;
		boolean monkeyAlive = true;
		*/

		int numberOfBananas =165;
		boolean monkeyAlive = true;
		int survivalDays =0;
		
		do {
			System.out.println("Monkeys eat 4 bananas everyday ");
			numberOfBananas-=4;
			survivalDays ++;
			if (numberOfBananas<4) {
				monkeyAlive = false;
				System.out.println("Today is day "+ survivalDays + "and there is no more bananas so it has died");
			}
			
			else {
				System.out.println("Today is the day "+ survivalDays + " it is still alive");
			}
			
		} while (monkeyAlive);
		System.out.println("Total days monkey has survived is "+ survivalDays);
	}

}
