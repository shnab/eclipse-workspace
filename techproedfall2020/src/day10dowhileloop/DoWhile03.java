package day10dowhileloop;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {

		/*
		// Ask user to enter a number
		// If the number user entered is less than 10 print “Won!” on the console
		// otherwise ask user to enter a number again.
		 */
			
		Scanner scan = new Scanner(System.in); //Burada object creation yapiyoruz. Bi defa do-While in disinda yazmak yeterli
		
		int num = 1;
		
		do {
			////DO-While kullanmadigimizda bunlari yukariya yaziyorduk. Simdi tekrar tekrar sorsun diye Do-While icine yazdik 
		System.out.println("Enter a number");
		num = scan.nextInt();
		
		} while(num>=10);
		
		System.out.println("Won!");
	}

}
