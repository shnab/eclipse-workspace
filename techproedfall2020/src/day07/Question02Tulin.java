package day07;

import java.util.Scanner;

public class Question02Tulin {

	public static void main(String[] args) {
		
		//Write a program to find the missing char in a serial string
		//abdef ===>  c  kayip burada
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your serial string");
		String str = scan.nextLine();
		
		System.out.println(missingLetter(str));
		
	}
	
	public static String missingLetter (String str) {
		for (int i = 0; i < str.length()-1; i++) {
			if (str.charAt(i+1)-str.charAt(i)!=1) {
				return(char) (str.charAt(i) +1) + ""; // burada char yazunca harfi verdi. Char cikinca 
													// 
			}
		}
		return "No missing char";
	}

}
