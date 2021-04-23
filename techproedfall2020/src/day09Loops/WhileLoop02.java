package day09Loops;

import java.util.Scanner;

public class WhileLoop02 {

	public static void main(String[] args) {
		
		
		/*
		 Ask user to enter a name.		
	
		If the name contains the letter ‘a’ then print “Won!” on the console
		otherwise ask user to enter another name.
		Use do-while loop.

		Type java code by using while loop,
		Write a program that prompts the user to input a positive integer.
		It should then print the multiplication table of that number.
		
		3x1=3 3x2=6 3x3=9 ................3x10=30
		  i	    i
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer to create multiplication table");
		int n = scan.nextInt(); //n burada sabit degisken oluyor. 10X1 10X2

		
//		int i = 1;
//		
//		while(i<=n) {
//			System.out.println(i*n);
//			i++;
//		}
		
		
		int i=1;
		while(i<11) {
			System.out.println(n + "x" + i + " = " + n*i); //tek tek yazdiriyor. Icinde kullandik
			i++;
		}
		
		scan.close();

	}

}
