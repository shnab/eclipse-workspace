package javadevelopmentdtDay04;

import java.util.Scanner;

public class DataStreams {
	
	/*
	 	There are 3 streams in JAVA
	 	1)System.out: It is used to send data out if the program
	 	2) System.in: It is used to get data into the program.
	 	3) System.err: It is used if any error occurs when we  read data or file to handle the error.
	 
	 */

	public static void main(String[] args) {
		
		//System.in
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your name");
		String name= scan.nextLine();
		
		System.out.println(name); //NAME IN BLACK
		
		//system.err
		try {
			System.out.println(12/0);
		}catch (ArithmeticException e) {
			System.out.println("You are in the catch block ");
			System.err.println("You tried to divide a number by zero"); //Errror mesaj icin System.err kullan
		}
		
	
	}

}
