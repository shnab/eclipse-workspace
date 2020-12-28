package day32collectionsmaps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class LinkedHashSet01 {

	public static void main(String[] args) {

		LinkedHashSet<Integer> lhs1 = new LinkedHashSet<>();

		lhs1.add(21);
		lhs1.add(25);
		lhs1.add(22);
		lhs1.add(29);
		lhs1.add(24);
		System.out.println(lhs1);
		
		//Try to print the element at index 2 on the console
		
		//1. way : Convert to LinkedHashSet to Array then get the specific element
		Integer arr[] = new Integer[lhs1.size()];
		arr = lhs1.toArray(arr);
		System.out.println(arr[2]); //22
		
		//2. way  : Convert to LinkedHashSet to a List then get the specific element
		List<Integer> l1 = new ArrayList<>(lhs1);
		System.out.println(l1.get(2)); //22
		
		//3. way: use iterator to get a specifik element from the LinkedHashSet
		
		get(lhs1); //1
					//The element at index 1is 25
	
	}
	
	//Burada yeni method yazdik
	public static void get(LinkedHashSet<Integer> lhs1) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the index (0-4)");
		int idx = scan.nextInt();
		int currentIndex = 0;
		Iterator<Integer> it1 = lhs1.iterator();
		while(it1.hasNext()) {
			Integer el = it1.next();
			if(currentIndex ==idx) {
			System.out.println("The element at index " + idx + " is " + el); //The element at index 1is 25
		}
		
		currentIndex++;

	}
	}
	
}
