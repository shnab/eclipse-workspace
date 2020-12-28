package day5;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {


		// Find a string's reverse (tersten okuma) by using array. Use toCharArray
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your string :");
		String str = scan.nextLine();
		char [] arr = str.toCharArray();
		String reverse = "";
		
		for (int i = arr.length-1; i >=0; i--) {
			reverse+= arr[i];
			
		}
		System.out.println(reverse);
		scan.close();
		
	}

}
