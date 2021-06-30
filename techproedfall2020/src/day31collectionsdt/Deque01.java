package day31collectionsdt;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {
	
	/*
	 Double Ended Queue(Deque): Deque works with double ends. 
	 It is good to add elements to the end and remove from the beginning. (FIFO)
	 It is good to add elements to the beginning and remove from the end. (LIFO)
	*/
	public static void main(String[] args) {
		
		Deque<String> dq1 = new LinkedList<>();
		dq1.add("Ali");
		dq1.add("Metin");
		dq1.add("Joe");
		dq1.add("Mary");
		dq1.add("Angie");
		System.out.println(dq1);
		
		dq1.addFirst("AAA");
		System.out.println(dq1);	
		dq1.addLast("ZZZ");
		System.out.println(dq1);
		
		System.out.println(dq1.getFirst());//AAA
		
		System.out.println(dq1.peekFirst());//AAA
		System.out.println(dq1);
		
		/*
		 getFirst() and peekFirst() returns the first element without removing.
		 If the Deque is empty getFirst() throws "NoSuchElementException" 
		 If the Deque is empty peekFirst() returns "null" 
		*/
		
		System.out.println(dq1.getLast());//ZZZ
		
		System.out.println(dq1.peekLast());//ZZZ
		
		/*
		 getLast() and peekLast() returns the last element without removing.
		 If the Deque is empty getLast() throws "NoSuchElementException" 
		 If the Deque is empty peekLast() returns "null" 
		*/
		
		//pollFirst() retrieves and removes the first element
		System.out.println(dq1.pollFirst());//AAA
		System.out.println(dq1);//[Ali, Metin, Joe, Mary, Angie, ZZZ]
		
		System.out.println(dq1.pollLast());//ZZZ
		System.out.println(dq1);//[Ali, Metin, Joe, Mary, Angie]
		
		System.out.println(dq1.removeFirst());//Ali
		System.out.println(dq1);//[Metin, Joe, Mary, Angie]
		
		System.out.println(dq1.removeLast());//Angie
		System.out.println(dq1);//[Metin, Joe, Mary]		
		/*
		 removeFirst() and pollFirst() returns the first element and removes it.
		 If the Deque is empty removeFirst() throws "NoSuchElementException"
		 If the Deque is empty pollFirst() returns "null"
		*/
		
		/*
		 removeLast() and pollLast() returns the first element and removes it.
		 If the Deque is empty removeLast() throws "NoSuchElementException"
		 If the Deque is empty pollLast() returns "null"
		*/		
		dq1.clear();
		System.out.println(dq1);//[]
		
		//dq1.getFirst();//Exception
		System.out.println(dq1.peekFirst());//null
		
		//dq1.getLast();//Exception
		System.out.println(dq1.peekLast());//null
		
		//dq1.removeFirst();//Exception
		System.out.println(dq1.pollFirst());//null
		
		//dq1.removeLast();//Exception
		System.out.println(dq1.pollLast());//null
		
	}

}
