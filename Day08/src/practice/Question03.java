package practice;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {


		//take 2 numbers from the user in main metyhod
		// than multiply and  print them in multiply () method
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter any number");
		int num1 = scan.nextInt();
		System.out.println("please enter any other number ");
		int num2 = scan.nextInt();
		
		multiply(num1, num2);
		System.out.println(BookStore.id);
				
	}
	private static void multiply (int num1, int num2)  {
		System.out.println(num1*num2);
	}

}
