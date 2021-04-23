package day08stringmanipulationdt;

import java.util.Scanner;

public class String4Benim {

	public static void main(String[] args) {
		
		/*
		Ask user ta enter his/her first name, last name and Social Security Number. 
        Then type a program which makes 
        the initials of the first name and the last name in uppercase, 
        Other characters will be in lowercase.
        All characters except last 4 characters of the Social Security Number “*”
                         For example; Suleyman Alptekin *****5678 (9 digits)
		*/	
		
		Scanner scan= new Scanner(System.in);
		System.out.println("enter first name");
		String fn= scan.nextLine().trim();
		
		System.out.println("enter last name");
		String ln= scan.nextLine().trim();
		
		System.out.println("enter ssn");
		String ssn= scan.nextLine().trim();

		fn = fn.substring(0, 1).toUpperCase() + fn.substring(1).toLowerCase();
		
		ln = ln.substring(0, 1).toUpperCase() + ln.substring(1).toLowerCase();
		
		//ssn = "*****" + ssn.substring(5); 
		ssn= "*****"+	ssn.substring(ssn.length()-4);
		
		System.out.println(fn + " " + ln + " "+ ssn );
		
	}

}
