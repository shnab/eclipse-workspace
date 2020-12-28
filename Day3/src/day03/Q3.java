package day03;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		// write a program to convert centimeters to meters and kilometers with method creation
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter the value to convert meters and kilometers ");
		double sentiMeter = scan.nextDouble();
		
		convertSM(sentiMeter);
	}
	
	public static void convertSM(double num) {
		double meter = num/100;
		double kMeter = num/100000;
		System.out.println("Your "+ num + "sentimeter "+ "is equal to "+ meter+ " Meters "+ "and" 
		+kMeter + "kilometers");


	}

}
