package day09Loops;

import java.util.Scanner;

public class ForLoop02 {

	public static void main(String[] args) {
		
		/* 
		 1) Ask user to enter a String
		 2)Print the String reverse
		 for example; Germany ===> ynamreG
		 */
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your String");
		String s = scan.nextLine();
		
	
		for(int i=s.length()-1; i>=0; i--) {
			System.out.print(s.charAt(i));
			
		}

		System.out.println();
		
		for (int i=s.length()-1; i>=0; ) {
			System.out.print(s.charAt(i));
			i--; // buraya da konulabilir
		}
		scan.close();
	}

}
