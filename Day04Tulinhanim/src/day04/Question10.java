package day04;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {

		   /*
         * DoWhileLoop 
         * Write a program to enter the numbers till the user wants 
         * and at the end it should display the count of positive, negative numbers and zeros entered.
         * to finish the program enter 1
         * 
         * ORNEK:
         * 
         * INPUT : 23 -2 0 54 12 -87 0 
         * OUTPUT :Count of Numbers 
         *         Negatives: 2 
         *         Positives: 3
         *         Zero: 2
         * 
         */
		
		Scanner scan = new Scanner (System.in);
		
		int num = 0;
		int countPositives=0;
		int countNegatives=0;
		int countZeros =0;
		 int sumPos =0;
		 int sumNeg =0;
		
		do {
			System.out.println("Enter your numbers to count\n1 for Exit");
			num = scan.nextInt();
			if (num>0) {
				countPositives ++;
				 sumPos+=num;
			}
			else if (num<0){
				countNegatives++;
				 sumNeg+=num;
			}
			else {
				countZeros++;
			}
		}while(num!=1);
		System.out.println("Count of Positives "+ countPositives + "\n1 Count Negatives "+ countNegatives+ "\n1 Count Zeros " +countZeros);
		System.out.println(sumPos+" "+ sumNeg);

	}

}
