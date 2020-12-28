package day17listsforloops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists02 {

	public static void main(String[] args) {

		//Working with a list is easier than working with arrays
		//Because of that somtimes we need to convert arrays to lists.
		
		String s[] = {"A", "C", "M", "B"};
		
		//To convert an array to a list use asList() method from Arrays Class
		List<String> ls = Arrays.asList(s); // new yazarak object olustulur aslinda. If youn are converting dont use new word

		System.out.println(ls.size());
		
		ls.set(1, "CX");
		System.out.println(ls); //[A, CX, M, B]
		
		//If you create a list from an array by using asList method, you cannot use the methods which affects the size from ArrayList Class
		//ls.remove(1);
		//ls.add("K");
		//ls.clear();

		//If you want to be able to use all methods, do not use asList to convert 
		//Use loops to transfer elemets to a new list
		
		List<String> nls = new ArrayList<>(); // Bu list
		for(int i=0; i<s.length; i++) {
			nls.add(s[i]);
		}
		System.out.println(nls);
		
		nls.remove(1);
		System.out.println(nls); // [A, M, B]
		
		//How to convert a list to an array toArray method
		String arrayFromList[] = nls.toArray(new String[0]);
		System.out.println(Arrays.toString(arrayFromList)); //[A, M, B] this a ARRAY
		
		
	}

}
