package day03;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

		/*The Fibonacci Sequence is the series of numbers:
		0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
	The next number is found by adding up the two numbers before it */
	
	int n1 = 0, n2=1;
	int n3;
	
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter any number please ");
	int n = scan.nextInt();
	
	System.out.print(n1+ " "+n2);
	
	for (int i=2; i<=n;i++) {
		n3 = n2+n1;
		System.out.print(" "+ n3);
		n1=n2;
		n2=n3;
		
	}
	


	}

}
