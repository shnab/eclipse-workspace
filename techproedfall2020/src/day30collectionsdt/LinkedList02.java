package day30collectionsdt;

import java.util.LinkedList;

public class LinkedList02 {

	public static void main(String[] args) {

			LinkedList<Integer> ll1 = new LinkedList<>();
			ll1.add(3);
			ll1.add(2);
			ll1.add(0);
			ll1.add(1);
			ll1.add(33);		
			System.out.println(ll1); //[3, 2, 0, 1]
			
			/*
			 When you use remove method with an integer argument, Java definitely 
			 will accept as index. Do not try to remove an integer element  by using 
			 remove obeject method. 
			 You may get IndexOutOfBoundsException.
			 For example; if you ll1.remove(33); to remove from the linked list i get exception
			 Because there is no 33 index. To remove 33 use ll1.remove(4);
			 
			 */
			ll1.remove(2);// it returns 0 ==> Java accept 2 hier as a index. 
			System.out.println(ll1); //[3, 2, 1] 

//			ll1.remove(33);
//			System.out.println(ll1); //java.lang.IndexOutOfBoundsException
			
			
			
			ll1.clear();
			System.out.println(); // []
			
			//Do not try to use remove for empty lists
			//ll1.remove();
			//System.out.println(); //Throws "NoSuchElementException"
			
		
			
	}

}
