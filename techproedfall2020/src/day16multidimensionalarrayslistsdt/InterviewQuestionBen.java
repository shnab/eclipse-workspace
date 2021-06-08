package day16multidimensionalarrayslistsdt;

import java.util.Arrays;
import java.util.Scanner;

public class InterviewQuestionBen {

	public static void main(String[] args) {

		// Type a program to count the number of different characters the in String Space excepted. 
		//Count all unique characters in a String
		//aaba, aaabbaa, 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your String");
		String s = scan.nextLine();
		
		String arr[] = s.split("");
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		int counter =0;
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i-1].equals(arr[i])) {
				counter++;
			}else {
				System.out.println("The number of character " + arr[i-1] + "  is " + (counter+1)); //after printing conuter = 0 olmali
				counter=0;
			} if(i==arr.length-1) {
				System.out.println("The number of character " + arr[i] + "  is " + (counter+1));
			}
			
		}
		
		
		
	}

}
