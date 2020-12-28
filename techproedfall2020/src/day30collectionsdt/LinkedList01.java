package day30collectionsdt;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList01 {

	public static void main(String[] args) {
		
		//How ta cretae a LinkedList
		LinkedList<String> ll1 = new LinkedList<>();
		
		//How to add elements
		ll1.add("Ali");
		ll1.add("Veli");
		ll1.add("Mery");
		ll1.add("Angie");
		ll1.add("Tom");
		
		//How to print LinkedList
		System.out.println(ll1);
		
		ll1.add(1, "Alex"); 
		System.out.println(ll1); //[Ali, Alex, Veli, Mery, Angie, Tom]
		
		ll1.addFirst("AAA");
		System.out.println(ll1); //[AAA, Ali, Alex, Veli, Mery, Angie, Tom]
		
		ll1.addLast("ZZZ");
		System.out.println(ll1); //[AAA, Ali, Alex, Veli, Mery, Angie, Tom, ZZZ]
		
		//LinkedList<String> ll2 = new LinkedList<>(); //Istenirse ArrayList de kullanilabilir
		ArrayList<String> ll2 = new ArrayList<>();
		ll2.add("AAA");
		ll2.add("Alex");
		ll2.add("ZZZ");
		ll2.add("Alex");
		
		//sona ll2 eklendi
		ll1.addAll(ll2);
		System.out.println(ll1); //[AAA, Ali, Alex, Veli, Mery, Angie, Tom, ZZZ, AAA, Alex, ZZZ, Alex]
		
		//Araya ll2 eklendi
		ll1.addAll(3, ll2);
		System.out.println(ll1); //[AAA, Ali, Alex, AAA, Alex, ZZZ, Alex, Veli, Mery, Angie, Tom, ZZZ, AAA, Alex, ZZZ, Alex]

		//remove() methods
		// remove() method removes the first element. Remove () returns the removed element	
		System.out.println(ll1.remove()); //AAA returns
		System.out.println(ll1); // AAA removed// [Ali, Alex, AAA, Alex, ZZZ, Alex, Veli, Mery, Angie, Tom, ZZZ, AAA, Alex, ZZZ, Alex]
		
		
		// 2) remove method removes the element at index 6. remove(6) method returns the removed element which is Veli
		System.out.println(ll1.remove(6)); //Veli
		System.out.println(ll1); // Veli removed [Ali, Alex, AAA, Alex, ZZZ, Alex, Mery, Angie, Tom, ZZZ, AAA, Alex, ZZZ, Alex]
		
		//3) remove("Alex") removes the first Alex from the list. remove("Alex")) returns boolean. If the element 
		// exist and is remomed you will get "true" otherwise you will get "false"
		System.out.println(ll1.remove("Tom")); //True 
		System.out.println(ll1);  //Tom removed ==> [Ali, Alex, AAA, Alex, ZZZ, Alex, Mery, Angie, ZZZ, AAA, Alex, ZZZ, Alex]
		
		System.out.println(ll1.remove("Alex")); //True
		System.out.println(ll1); // Frist Alex removed ==> [Ali, AAA, Alex, ZZZ, Alex, Mery, Angie, ZZZ, AAA, Alex, ZZZ, Alex]
		
		//If element dont exist MMM then java says false
		System.out.println(ll1.remove("MMM")); //False
		System.out.println(ll1); //[Ali, AAA, Alex, ZZZ, Alex, Mery, Angie, ZZZ, AAA, Alex, ZZZ, Alex]

		
		//Check if Alex exists in the 
		//If it exists romove it otherwise provide me a message like "He does not exist"
		if(ll1.remove("Alex")) {
			System.out.println("Alex exist and he is removed"); //Alex exist and he is removed
		} else {
			System.out.println("Alexa does not exist ");
		}
	
		//4) removeFirst() method reemoves the first element. removeFirst () returns the removed element
		System.out.println(ll1.removeFirst()); //Ali
		System.out.println(ll1); //Ali is removed ==>[AAA, ZZZ, Alex, Mery, Angie, ZZZ, AAA, Alex, ZZZ, Alex]
		
		
		//5) removeLast()
		System.out.println(ll1.removeLast()); //Alex
		System.out.println(ll1); //[AAA, ZZZ, Alex, Mery, Angie, ZZZ, AAA, Alex, ZZZ]
		
		//6) removeFirstOccurrence("Alex") removes the first occurence Alex
		ll1.removeFirstOccurrence("Alex"); //First Alex will be removed
		System.out.println(ll1); //[AAA, ZZZ, Mery, Angie, ZZZ, AAA, Alex, ZZZ]
		
		//7) removeLastOccurrence("ZZZ") 
		ll1.removeLastOccurrence("ZZZ"); // ZZZ is removed
		System.out.println(ll1); //[AAA, ZZZ, Mery, Angie, ZZZ, AAA, Alex]
		
		//8)removeAll(ll3) removes all elements which are in ll3 from ll1
		// removeAll() returns boolean
		//removeAll() returns false if no element is removed. It returns true if at least one element is removed 
		LinkedList<String> ll3 = new LinkedList<>(); // This is colllection
		ll3.add("Alex");
		ll3.add("Angie");
		ll3.add("NNNN");
		
		System.out.println(ll1.removeAll(ll3)); //boolean ==>> True
		System.out.println(ll1); // Alex an Angie are removed ==>> [AAA, ZZZ, Mery, ZZZ, AAA]
		
	}

}
