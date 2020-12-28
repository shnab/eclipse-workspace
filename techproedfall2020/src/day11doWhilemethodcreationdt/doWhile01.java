package day11doWhilemethodcreationdt;

import java.util.Scanner;

public class doWhile01 {

	public static void main(String[] args) {

				
				// Ask user to enter an integer
				// If the integer is even print on the console "You won!"
				// Otherwise ask user to enter another integer
				
				Scanner scan = new Scanner(System.in);
				
				int num = 0;
				
				do {		
					System.out.println("Enter an integer");
					num = scan.nextInt();		
				}while(num%2!=0);//condition part. tersini yaziyoruz. burada odd integer
				System.out.println("You won!");
				
				scan.close();
	}


	}
