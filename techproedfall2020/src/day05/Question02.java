package day05;

import java.util.Arrays;
import java.util.Scanner;

public class Question02 {
	
	/* Create an array
	 * Length will be 4
	 * get numbers from user
	 */

	public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);
	        int num = 1;
	        int arr [] = new int [4];
	        int flag = 0;
	        do {
	        	System.out.println("Enter a value please: ");
	        	num = scan.nextInt();
	        	arr[flag]= num;
	        	flag++; //flag four times works than stop
	        	
	        }while (flag!=4);
	        System.out.println(Arrays.toString(arr));
	       Arrays.sort(arr); //sayilari siraya koymak icin sort konuldu
	       System.out.println(Arrays.toString(arr));
		 
		 
		 
		
	}

}
