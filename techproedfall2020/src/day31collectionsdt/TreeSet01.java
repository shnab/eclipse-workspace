package day31collectionsdt;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {
	
	/*
	 1)TreeSet is a Set so the elements are unique.
	 2)TreeSet puts the elements in natural order(ascending + alphabetical)
	 3)TreeSet is very slow because putting elements in natural order need more time.
	 
	 Question: If you need unique data in a collection, and the data is in natural order, which
	           collection do you use?
	 Answer: TreeSet
	 
	 Question: TreeSet is very slow, what can you do to make it faster?  
	 Answer: I use HashSet to add elements then I convert HashSet to TreeSet to make it faster       
	*/

	
	public static void main(String[] args) {


		long startingTime1 = System.currentTimeMillis();
		TreeSet<String> ts1 = new TreeSet<>();
		ts1.add("Brad Bitt");
		ts1.add("Angelina Jolie");
		ts1.add("Tom Mark");
		ts1.add("Arnold Scward");
		ts1.add("Cuneyt Arkin");
		ts1.add("Ahmet Yildiz");
		ts1.add("Kemal Sunal");
		ts1.add("Ali Can");
		System.out.println(ts1);	
		long endingTime1 = System.currentTimeMillis();
		System.out.println("TreeSet time: " + (endingTime1-startingTime1)); 
				
		
		long startingTime2 = System.currentTimeMillis();
		HashSet<String> hs1 = new HashSet<>();
		hs1.add("Brad Bitt");
		hs1.add("Angelina Jolie");
		hs1.add("Tom Mark");
		hs1.add("Arnold Scward");
		hs1.add("Cuneyt Arkin");
		hs1.add("Ahmet Yildiz");
		hs1.add("Kemal Sunal");
		hs1.add("Ali Can");
		
		TreeSet<String> ts2 = new TreeSet<>(hs1); // convert yapildi
		System.out.println(ts2);

		long endingTime2 = System.currentTimeMillis();
		System.out.println("HashSet + TreeSettime: " + (endingTime2-startingTime2));
		

		
		
	}

}
