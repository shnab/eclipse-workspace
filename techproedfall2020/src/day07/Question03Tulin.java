package day07;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Question03Tulin {

	public static void main(String[] args) {

	    // use add() method to add values in a list
	   // set Iterator at specified index
		// print list from second position ----> first index
		
		List<String> list = new ArrayList<String>();

		list.add("yellow");
		list.add("blue");
		list.add("orange");
		list.add("yellow");
		list.add("red");
		
		System.out.println(list); //[yellow, blue, orange, yellow, red]
		
		ListIterator<String> p = list.listIterator(1); //blue orange yellow red 
		//iterator p = list.listIterator(1);
		
		
		while(p.hasNext()) {
			System.out.print(p.next() + " "); //blue orange yellow red 

			}
			
	}
}
	

