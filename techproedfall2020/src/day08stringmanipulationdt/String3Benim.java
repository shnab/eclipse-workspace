package day08stringmanipulationdt;

import java.util.Scanner;

public class String3Benim {

	public static void main(String[] args) {
		
		/*
		 Ask user to enter a password
		 1)Remove all spaces from the password from beginning and ending
		 2)Make the first character uppercase ‘A’ 
		 3)Make the last 2 characters ‘*’
		 4)If the password has less than 6 characters add ‘e’ after the first character to make the length more than 5 
		 5)Then give the password to the user
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your password");
		String pwd = scan.nextLine().trim();
		
		if(pwd.length()<6) {
			System.out.println("enter at least 6 characters");
		}else {
//			pwd = pwd.replace(pwd.charAt(0), 'A'); //pwd yi tekrar esitlememiz lazim. 
//			pwd = pwd.replace(pwd.substring(pwd.length()-2), "**");
			
			pwd = "A" + pwd;
			pwd = pwd.substring(0, pwd.length()-2) + "**";
						
			System.out.println(pwd);		
		}
	
	}

}
