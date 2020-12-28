package day32collectionsmaps;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashTable01 {
	/*
	 1)HashTable is syncronized and thread-safe 
	 2)HashTable doen not accept "null" as key a value.
	 3)HashTable puts the elements in random order
	 4)HashTable is slower than HashMap
	 5) HashTable uses {} curlie braces    [] brakets
	 */

	public static void main(String[] args) {

		Hashtable <String, Integer>  ht1 = new Hashtable<>();
		
		ht1.put("Ali Can", 23);
		ht1.put("Ali Can", 23); //console de bu gorunuyor. 
		ht1.put("Veli Han", 23);
		ht1.put("Canan Can", 23);
		ht1.put("Hakan Yildiz", 23);
		ht1.put("Angie Star", 23);
		System.out.println(ht1); // {Angie Star=23, Hakan Yilidz=23, Veli Han=23, Canan Can=23, Ali Can=23}

		//entrySet() method displays the map element in a Set
		//System.out.println(ht1.entrySet()); // [] brakets==> [Angie Star=23, Hakan Yilidz=23, Veli Han=23, Canan Can=23, Ali Can=23]
		Set<Entry<String, Integer>> s1 = ht1.entrySet();
		
		Iterator<Entry<String, Integer>> it1 = s1.iterator();
			while (it1.hasNext()) {
				Object el = it1.next();
				System.out.print(el + " * "); //Angie Star=23 * Hakan Yilidz=23 * Veli Han=23 * Canan Can=23 * Ali Can=23 * 
				//it1.remove();
			}
			
	}
	

}
