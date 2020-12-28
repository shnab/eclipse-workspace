package day11doWhilemethodcreationdt;

import java.util.Scanner;

public class doWhile02 {
	
	public static void main(String[] args) {

		
		/*
		 Ask user to enter his/her first name
		 If the initial is lower case print a message like “Make the initial upper case”
		 If the initial is upper case print a message like “You did it right”
		 */
	
		Scanner scan = new Scanner(System.in);
		
		char init = 'a' ;
		
		do {
			System.out.println("Enter your first name");
			init = scan.next().charAt(0);
			if(init>='A' && init<='Z') {
				System.out.println("You did it right");
			}else {
				System.out.println("Make the initial upper case");
			}
		} while(!(init>='A' && init<='Z'));
		scan.close();
		
		
		}
}
