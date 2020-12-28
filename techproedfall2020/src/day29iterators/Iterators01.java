package day29iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterators01 {
	
	/*
	 We have 2 interfaces; 1) Iterator : We can navigate inside a collection by using iterator interface
	 									 We can access elements of the collection  by using iterator interface
	 									 We can remove the elements from the collection  by using iterator interface
	 					   2) ListIterator: HAS more functionality than iterator.
	 					   					You can navigate inside the colection in 2 directions
	 					   					By using hasNext() and next(), you can navigate from beginning to end.
	 					   					By usind hasPrevioust() and previous (), you can navigate from end to beginning
	 					   					NOTE: .Before using hasPrevious() and previous (), 
	 					   					you need to use  hasNext ()and next()
	 					   					
				   
	 */
	
	/*
	 Differences between iterator and Listiterator
	 1) Listiterator can travers froward and backward, itretator can traverse just forward
	 2) ListIterator has hasNext (), next (), hasPrevious(), Previous(), set(), add() and remove()
	 	Iterator has just remove()
	 3) ListIterator can be used just for Lists
	 	Iterator can be used other colloections (Maps, Sets, Lists) as well
	 4) ListInterator has some methods to use indexes, but iterators cannot run with indexes
	 	
	 */

	/*
	 By using  loop we cannot update the collections, but sometimes we need to update collections.
	 To update collections we need to use iterators
	 */
	
	
	public static void main(String[] args) {

		List<String> list1 = new ArrayList<>();
		list1.add("A");
		list1.add("C");
		list1.add("B");
		
		//Navigate among the elements by using for-each loop
		for(String w : list1) {
		//	System.out.print(w + " "); //A C B 
			w = w + "X"; // by loop You can navigate but cannot update it. Liste guncellenmedi
		}
		
		System.out.println(list1);// [A, C, B]
		
		//Navigate among the element by using iterator
		Iterator<String> it1 = list1.iterator(); 
		/*
		 hasNext () asks to the pointer ---> , if tehere is any element after the pointer. If there is a 
		 										it return "true", if there is no element it returns "false"
		next () moves the pointer in front of the next element and returns  the previous element 
		 */
		while (it1.hasNext()) {
			it1.next(); //A C B
			it1.remove(); 
						
		}
		System.out.println(list1); // []
	}

}
