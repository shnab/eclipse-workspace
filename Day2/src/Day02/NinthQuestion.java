package Day02;

import java.util.Scanner;

public class NinthQuestion {

	public static void main(String[] args) {
		
		/*
		 If,IfElse,
		A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
		Ask user for their salary and year of service and print the net bonus amount.
		Example:
    	INPUT     : 4 year servise
                       Salary : 4000
    	OUTPUT : 0
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Write your year");
		int year = scan.nextInt();
		System.out.println("Write your salary");
		int salary = scan.nextInt();
		double bonus = salary*0.05;
		
		if(year > 5) {
			System.out.println("Your bonus is: " + bonus);
			
		}else {
			System.out.println("Your bonus is: 0");
		}
		
		
	}

}
