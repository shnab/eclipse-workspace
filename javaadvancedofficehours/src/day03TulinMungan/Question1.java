package day03TulinMungan;

import java.util.Scanner;

public class Question1 {
	
	public static void main(String[] args) {
				/*
				create a method called numberOfChars and pass 2 parameters 1- char 2- String
				char ch = 'p';
				String str = "population is number of people";
				int count = 0; 
				then find how many times the given char is repeated in the String
				and print it on the console
				use for loop, increment and if statements  
				*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your string please");
		String str = scan.nextLine();
		System.out.println("Which char do you want to search");
		char ch = scan.next().charAt(0);
		
		System.out.println("you have " + ch + " for " + numberOfChars(ch,str) + "times in your string");

	}

		public static int numberOfChars (char ch, String str) {
			int count = 0;
			for(int i=0; i<=str.length()-1; i++) {
				if(str.charAt(i)==ch) {
					count ++;
				}
			}
			return count; 
		}
}
