package day17listsforloops;

import java.util.Arrays;
import java.util.Scanner;

public class ForLoop06 {

	public static void main(String[] args) {

		/*
		 * ask user to enter an integer, and create a squared multi dimesional Array
		 Example if user enters 3 ==> [3, 3, 3]
		 							  [3, 3, 3]
		 							  [3, 3, 3]
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("ERnter an integer");
		int length = scan.nextInt();
		
		int arr[][] = new int[length][length];
		for(int i=0; i<length; i++) {
			for(int k=0; k<length; k++) {
				arr[i][k] = length;
			}
		}
		System.out.println(Arrays.deepToString(arr));

	}

}
