package day03;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {


		//ask user to enter  firstName and lastName  then make first initials uppercase and the rest should be 
		//all lowercase
		
		// tulin  => Tulin
		// mungan  => Mungan
		
	Scanner scan = new Scanner (System.in);
	System.out.println("What is your first name ?");
	String firstName = scan.nextLine();
	System.out.println("What is your surname ?");
	String surName = scan.nextLine();
	
	System.out.println(firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase()+ " "
			+surName.substring(0,1).toUpperCase()+surName.substring(1).toLowerCase());

	}

}
