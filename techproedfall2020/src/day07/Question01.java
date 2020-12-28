package day07;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {

		/*
		 * Ask user for numbers from 1 to 12 and print them as month names
		 * by creating method.
		 * 
		 * INPUT : 11 OUTPUT: November 
		 * INPUT : 5 OUTPUT: May 
		 * INPUT : 15 OUTPUT: Please enter 1-12 numbers
		 */
		
		int month=0;
		printMonth();
		
	}
	public static void printMonth() {
		Scanner scan  = new Scanner (System.in);
		System.out.println("Enter a number for month. ");
		int month = scan.nextInt();
		
		
		if(month > 0 && month<=12) {
		
		switch(month) {
		case 1 : 
			System.out.println("Jan");
			break;
		case 2 : 
			System.out.println("Feb");
			break;
		case 3 : 
			System.out.println("Mar");
			break;
		case 4 : 
			System.out.println("Apr");
			break;
		case 5 : 
			System.out.println("May");
			break;
		case 6 : 
			System.out.println("Jun");
			break;
		case 7 : 
			System.out.println("July");
			break;
		case 8 : 
			System.out.println("Aug");
			break;
		case 9 : 
			System.out.println("Sep");
			break;
		case 10 : 
			System.out.println("Oct");
			break;
		case 11 : 
			System.out.println("Nov");
			break;
		case 12 : 
			System.out.println("Dec");
			break;
			default:
		} }else System.out.println("Please enter 1-12 numbers");


	}

}
