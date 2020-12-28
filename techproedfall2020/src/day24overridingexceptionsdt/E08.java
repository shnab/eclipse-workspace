package day24overridingexceptionsdt;

import java.util.Scanner;

public class E08 {

	public static void main(String[] args) {

		
		int numOfEggs = 12;
		if(numOfEggs<0) {
			throw new IllegalArgumentException("Number of eggs cannot be negative");
		}else {
			System.out.println(numOfEggs);
		}
		
		String s = "1023";
		boolean r = true;
		for(int i=0; i<s.length(); i++) {
			if(!(s.charAt(i)>='0'&&s.charAt(i)<='9')) {
				r = false;
			}
		}
		
		if(!r) {
			throw new NumberFormatException("Some characters are not digit");
		}else {
			int result = Integer.parseInt(s);
			System.out.println(result + 1);
		}
		
		
		String v = "abc"; // burasi normalde null idi. O zaman  NullPointerException veriyor.
		if (v.equals(null)) {
			throw new NullPointerException();
		}else {
			System.out.println(v.length());
		}
		
		
		int arr[] = {11, 12, 13};
		Scanner scan = new Scanner(System.in);
		System.out.println("Which index do you want to use");
		int idx = scan.nextInt();
		if(idx<0 || idx>=arr.length) {
			throw new ArrayIndexOutOfBoundsException("Use valid index");
		} else {
			System.out.println(arr[idx]);
		}
		
		/*
		 Between the primitives you can do "explicit narrowing" but for some
		 classes explicit narrowing does not work. Fpr example you can not cast Oject class 
		 to a String class object. If you insist to convert an abject from Object Class to 
		 String Class you will get ClassCastException
		 */
		Object obj = new Object();
		String str = (String) obj; // ClassCastException
		
		
	}

}
