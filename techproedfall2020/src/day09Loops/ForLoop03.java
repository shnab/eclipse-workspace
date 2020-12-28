package day09Loops;

import java.util.Scanner;

public class ForLoop03 {

	public static void main(String[] args) {
		
		/*
		 ask user to enter a String 
		 2)Check the String if it is "Palidrome" or not
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your String");
		String s = scan.nextLine();
		
		String r = ""; //r yi bos deger olarak yaziyoruzki asagida bi kalip olusabilsin.
		
		for(int i=s.length()-1; i>=0; i--) {
			r = r + s.charAt(i); // r ile s yi topluyoruz. yoksa sadece s olursa her sefeinde tekil karakter olur
		} 
		System.out.println(r); //dcba
		
		if(s.equalsIgnoreCase(r)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
		
		scan.close();
		
	}

}
