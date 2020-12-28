package day31collectionsdt;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSet01 {
	
	/*
	 1)All elements must be unique in HashSet. 
	   No duplication, ne repetition in HashSets.
	 2)If you try to add repeated data into a HashSet, 
	   it does not give CTE, it does not give Run Time Error, it overwrites.
	 3)HashSet is the fastest Set in Java. 
	   To make HashSet fast, Java made HashSet very simple. 
	   HashSet does not work to order elements, it puts the elements in random order.  
	   HashSet accepts "null" as element
	   
	 Note: If the speed is important, uniqueness is needed, null elements are not problem, order
	       of the elements is not important use HashSet.  
	 */
	
	public static void main(String[] args) {
		
		HashSet<String> hs1 = new HashSet<>();
		hs1.add("Ali");
		hs1.add("Can");
		hs1.add("Mary");
		hs1.add("Frank");
		hs1.add("Angie");
		hs1.add("Ali");
		hs1.add(null);
		hs1.add(null);
		hs1.add(null);
		System.out.println(hs1);//[null, Can, Angie, Frank, Ali, Mary]
		
		System.out.println(hs1.contains("Ali"));
		
		List<String> l1 = new ArrayList<>();
		l1.add("Mary");
		l1.add("Frank");
		l1.add(null);
		l1.add("YYY");
		//containsAll() method is used to check if multiple elements are in the HashSet or not.
		System.out.println(hs1.containsAll(l1));//false
		
		System.out.println(hs1.hashCode());//134071793

	}

}
