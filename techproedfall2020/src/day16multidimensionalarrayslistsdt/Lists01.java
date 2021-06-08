package day16multidimensionalarrayslistsdt;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {
	
	/*
	 1)Arrays are good but very strict in length. After declaring the length you cannot change it.
	 But lists are flexible in length, no need to declare the length at the beginning. You add elements , lists will arrange the lengths.
	 2) Lists can store JUST "non-primitive" data types but Arrays cannot.
	
	
	 */

	public static void main(String[] args) {

		//How to create a  list 3 ways
	// 1. Way
		//Lists can store JUST "non-primitive" data types
		//ArrayList<int> lits11 = new ArrayList<int>(); ==> burada int degil Integer yani Wrapper kulanmank gerekiyor
		
	ArrayList<Integer> list1 = new ArrayList<>(); //Wrapper kullan burada
	
		
	// 2. Way
	ArrayList<Integer> list2 = new ArrayList<Integer>();  //==>ArrayList ==> bu class name  ArrayList<>();==> bu constructor

	// 3. Way. The best
	// Note; Do not use "List<>" on the right, jAVA complains
	List<Integer> list3 = new ArrayList<>(); 
	
	//how to print
	System.out.println(list3);
	
	//How to add elements into a list
	list3.add(11);
	list3.add(9);
	list3.add(12);
	list3.add(1, 123); // 2. siradaki seciliyor.Araya eleman atmak icin
	list3.add(0, 77);
	System.out.println(list3); //11
	
	// How to find the number of elemnts in a list
	//list3.size())--> List icin size() Array icin length kullaniyoruz.
	
	System.out.println("tHE number of element: " + list3.size()); // 5
	
	//Get the last element form the list3 dynamically
	System.out.println(list3.get(list3.size()-1)); //last element 12
	
	//How to check if a specific element exist in a list
	System.out.println(list3.contains(77)); // true
	System.out.println(list3.contains(99)); //false. 
	}

}
