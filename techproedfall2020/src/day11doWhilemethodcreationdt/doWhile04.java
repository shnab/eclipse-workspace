package day11doWhilemethodcreationdt;

import java.util.Scanner;

public class doWhile04 {

	public static void main(String[] args) {


		/*
		Ask user to enter a name.		
		If the name contains the letter ‘a’ then print “Won!” on the console
		otherwise ask user to enter another name.
		Use do-while loop.
		 */
		
		Scanner scan = new Scanner(System.in);
		String name = "";
		
		do {
			System.out.println("Enter your name");
			name = scan.nextLine();
			
			if(name.contains("a")) {
				System.out.println("Won!");
			}
		} while(!name.contains("a"));
		scan.close();
		
	}

}
