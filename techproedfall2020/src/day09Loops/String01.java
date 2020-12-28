package day09Loops;

import java.util.Scanner;

public class String01 {

	public static void main(String[] args) {
		
		/*
		sometimes we need to update or remove just letters or just digits from a string
		replace("a", "") i need to all letters weg.
		to make it we use regular Expressions (regex) with replaceAll() method 
		
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your String");//1345678hjoiul;jkl;9090
		String s = scan.nextLine();
		
		//For letters and digits we use "\\w"
		//s.replaceAll(regex, replacement)
		//  "\\w"  ==> it means A-->Z, a-->z, 0 -->9, 
		System.out.println(s.replaceAll("\\w", "")); //;;
		
		//   "\\W" ==> IT means different from  A-->Z, a-->z, 0 -->9, 
		
		System.out.println(s.replaceAll("\\W", ""));//1345678hjoiuljkl9090
		
		
		// "\\d"  ==> it means  0 -->9,

		System.out.println(s.replaceAll("\\d", "*")); //*******hjoiul;jkl;****
		
		// "\\D"  ==> it means different from  0 -->9, removing other dan digits

		System.out.println(s.replaceAll("\\D", "-"));//1345678-----------9090
		
		// "\\s" ==> it means space
		System.out.println(s.replaceAll("\\s", ""));//1345678hjoiul;jkl;9090
		System.out.println(s.replaceAll("\\s", "&"));
		
		
		// "\\S" ==> it means non-space
	
		System.out.println(s.replaceAll("\\S", "4"));
		
		/*
		 if you use regex, you have to use replaceAll(). 
		 replace () does not work with regex
		 */
		
	}

}
