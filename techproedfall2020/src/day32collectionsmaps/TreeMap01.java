package day32collectionsmaps;

import java.util.TreeMap;

public class TreeMap01 {
	
	/*
	 1) TreeMap puts the elements in natural order according to the keys
	 2) TreeMap is slowest map
	 3) TreeMap is not-syncronized and not-thread-safe
	 4)TreeMAP does not accept null as key but accepts multiple null as value
	 */

	public static void main(String[] args) {

		TreeMap<Integer, Integer> tm1 = new TreeMap<>();
		tm1.put(123, 6);
		tm1.put(98, 17);
		tm1.put(1001, 2);
		tm1.put(321, 6);
		//tm1.put(null, 0); 
		System.out.println(tm1); //natural order ==> {98=17, 123=6, 321=6, 1001=2}
	
		//tm1.put(null, 0); //NullPointerException
		//System.out.println(tm1);
		
		tm1.put(111, null);
		System.out.println(tm1); //{98=17, 111=null, 123=6, 321=6, 1001=2}
		
		tm1.put(110,null);
		System.out.println(tm1); //{98=17, 110=null, 111=null, 123=6, 321=6, 1001=2}
	
	}

}
