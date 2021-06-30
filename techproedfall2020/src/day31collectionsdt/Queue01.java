package day31collectionsdt;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {
	/*
	 1)The elements are added to the end(insrtion order) of the collection and removed from the beginning
	   of the collection. First In First Out (FIFO)
	 */
	public static void main(String[] args) {	
		Queue<String> q1 = new LinkedList<>();
		q1.add("Meat");
		q1.add("Butter");
		q1.add("Water");
		q1.add("Cheese");
		q1.add("Milk");
		System.out.println(q1);//[Meat, Butter, Water, Cheese, Milk]
		
		q1.remove();
		System.out.println(q1);//[Butter, Water, Cheese, Milk]
		
		//element() method returns the first element(head) but it does not remove the head.(copy+paste)
		System.out.println(q1.element());//Butter
		System.out.println(q1);//[Butter, Water, Cheese, Milk]
		
		//peek() method returns the first element(head) but it does not remove the head.(copy+paste)
		System.out.println(q1.peek());
		System.out.println(q1);//[Butter, Water, Cheese, Milk]
		q1.clear();
		System.out.println(q1);//[]		
		//If you use peek() method for empty queue's it will return "null"
		System.out.println(q1.peek());//null
		//If you use element() method for empty queue's it will throw NoSuchElementException
		//System.out.println(q1.element());//NoSuchElementException		
		/*
		 If you use PriorityQueue to create a Queue object, Java uses some rules
		 to decide to select the priority. And it puts the elements in order according to the
		 priority rule.
		*/
		Queue<String> q2 = new PriorityQueue<>();
		q2.add("Meat");
		q2.add("Butter");
		q2.add("Water");
		q2.add("Cheese");
		q2.add("Milk");
		System.out.println(q2);//[Butter, Cheese, Water, Meat, Milk]		
		//poll() retrieves and removes the head of this queue (cut+paste)
		System.out.println(q2.poll());//Butter
		System.out.println(q2);//[Cheese, Water, Meat, Milk]
		
}

}
