package day09Loops;

import java.util.Scanner;

public class WhileLoop03 {

	public static void main(String[] args) {
		/*
		 Type java code by using while loop, 
        Write a program that prompts the user to input a positive integer. 
        It should then print factorial of that number. 
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer to calculate its factorial");
		int n = scan.nextInt();
		
		
//		int res =1;		
//		int i =1;
//		while(i<=n) {
//			res = res*i;
//			System.out.println(res);
//			i++;
//		}
//		System.out.println(res);

		
		
		int result = 1; //to store result
		
		int i=1; // this is flag ==> counter		
		while(i<=n) {
			result = result * i;
			System.out.println(i + "!= " + result); //bu tek tek sayilarin degerini verdi. i koydum
			i++;
		}		
		System.out.println(n + "!= " + result); // 5!= 120 en son degeri verdi. n koydum
		
 scan.close();		
		
	}

}
