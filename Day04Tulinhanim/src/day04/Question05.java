package day04;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {


		/*
		 * Array
	Write a Java program to check if an array of integers contains two specified elements 65 and 77.
  	INPUT : int[] array_nums = {77, 77, 65, 65, 65, 77, 65, 65, 65, 77, 65, 67, 65, 77, 65, 65, 65, 77};
    OUTPUT :  True
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter two values to search ?");
		int num1= scan.nextInt(); // 65
		int num2 = scan.nextInt(); //77
		System.out.println(isConsider (num1,num2));
		
	}	
		
	public static  boolean isConsider (int num1,int num2) {
		int[] arr = {77, 17, 35, 65, 85, 3, 66,24, 59, 3, 6, 12, 33, 80, 20, 10, 34};
		for(int i=0; i<arr.length;i++) {
			for (int j =0; j<arr.length;j++) {
				if (arr[i]== num1 && arr[j]==num2) {
					return true;
				}
			}
		}
		return false;

	}

}
