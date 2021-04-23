package day09Loops;

import java.util.Scanner;

public class WhileLoop05 {

	public static void main(String[] args) {
		/*
		 type java code by using while loop
		 write a program to count the factors of an integer which is entered by user.
		 Factors of 12 = 1, 2, 3, 4, 6, 12
		 */
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer to find its factors");
		int n = scan.nextInt(); //I
		
		if(n<0) {//V
			n = -n;
		}
		
		int i = 1;  //II
		
		while(i<=n) { //III
			if(n%i==0) {//burada n in bolenleri tek tek aliniyor,  12 ==> 1 2 3 4 6 12 
				System.out.print(i + " ");
			}
			i++;//IV
		}
		

	}

}
