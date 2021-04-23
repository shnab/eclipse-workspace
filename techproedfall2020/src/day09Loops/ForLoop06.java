package day09Loops;

import java.util.Scanner;

public class ForLoop06 {

	public static void main(String[] args) {
		
		/*
		 1)ask user to enter a positive integer
		 2) Create and print the following image on the console
		 
		    *
		   * *
		  * * *
		 * * * *
		 	.
		 	.
		 	.
		 	.
		 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a integer to create triangle");
		int n = scan.nextInt();
		
		
		
//		for(int i=1; i<=n; i++) {
//			for(int j=(n-i); j>0; j--) {
//				System.out.print(" ");
//			}for (int k=1; k<=i; k++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
		for(int i=1; i<=n; i++) { // n yerine herhangi bir sayi koyabiliyoruz
			
			for(int j=(n-i); j>0; j--) {//spaces
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) { //asterix 
				System.out.print("* ");
			}
			System.out.println();
		} 
		
	scan.close();
		
		

	}

}
