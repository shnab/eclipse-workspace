package day05;

import java.util.ArrayList;
import java.util.Arrays;

public class Question03 {

	public static void main(String[] args) {

		// Create a method that returns the elements of a String Array which have 4 chars
		
		String arr[] = {"one", "four", "nine", "eight", "five", "seven" };
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.toString(fourChars(arr)));
	
	}
	
	public static String[] fourChars(String [] str) 	{
		ArrayList<String> list = new ArrayList<>();
		
		for (String w : str ) {
			if (w.length()==4) {
				list.add(w);
			}
		}
		String [] result = list.toArray(new String [list.size()]);
		return result;
	}
	
//	String b[] = {"ali" , "veli", "deli", "selim", "a"};
//	get4Chars(b);
//	
//}
//	public static void get4Chars(String a[]) {
//		for (String w : a) {
//			if(w.length() ==4) {
//				System.out.println(w);
//			}
//			
//		}
//		
		
		
}
