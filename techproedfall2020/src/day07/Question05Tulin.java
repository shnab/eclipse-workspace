package day07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.Scanner;

public class Question05Tulin {

	public static void main(String[] args) {


		/*
		 * Anagram is to create a new word from other word's letters.
		 * Write java code to define if Anagram or not by creating a boolean method.
		 * isAnagram("listen", "Silent") ==> true
		 */

		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your first anagram string ");
		String str1 = scan.nextLine();
		System.out.println("Enter your second anagram string");
		String str2 = scan.nextLine();
		System.out.println(isAnagram(str1, str2));
	}

		public static boolean isAnagram (String str1, String str2) {
			char[] arr1 = str1.replace(" ", "").toLowerCase().toCharArray();
			char [] arr2 = str2.replace(" ", "").toLowerCase().toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			System.out.println(arr1);
			System.out.println(arr2);
			if(str1.length()!= str2.length()) {
				return false;
			}
			for (int i = 0; i < arr2.length; i++) {
				if(arr1[i]!=arr2[i]) {
					return false;
				}
			}
			return true;
			
		}
}
