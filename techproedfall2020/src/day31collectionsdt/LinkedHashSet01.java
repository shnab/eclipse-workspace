package day31collectionsdt;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {
	
	/*
	 1)LinkedHashSet puts the elements in insertion order.
	 2)LinkedHashSet is a Set so no repetition, all elements are unique.
	 3)LinkedHashSet accepts null as element
	 4)LinkedHashSet works to order elements because of that it is slower than HashSet
	 */
	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs1 = new LinkedHashSet<>();
		lhs1.add("A");
		lhs1.add("Z");
		lhs1.add("M");
		lhs1.add("B");
		lhs1.add("R");
		lhs1.add(null);
		lhs1.add("A");
		System.out.println(lhs1);//[A, Z, M, B, R, null]

	}

}
