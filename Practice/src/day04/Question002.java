package day04;

import java.util.Scanner;

public class Question002 {

	public static void main(String[] args) {

		/* WhileLoop,DoWhile
		Ask user to enter a word. If the word has odd number of characters
		 and has 3 or more characters,
		 print the character in the middle of the word.
		 the word has even number of character print "You entered wrong word."
		     INPUT      :   tulin
		     OUTPUT :   l
		     INPUT      :   YAMALI
		     OUTPUT :   You entered wrong word.*/
		Scanner scan = new Scanner (System.in);
		String word ="";
		
	     do {
	            System.out.println("Enter a word, please");
	        word = scan.nextLine(); 
	        
	        if (word.length()%2==1 && word.length()>=3) {
	            System.out.println("the middle char is " + word.charAt(word.length()/2));
	        }
	        else {
	            System.out.println("You are entered wrong word");
	            }
	        }
	        while( word.length()%2==0 && word.length()<3);
		


	}
	

}
