package day29iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterators02 {

	public static void main(String[] args) {
		
		List<String> list2 = new ArrayList<>();
		list2.add("AB");
		list2.add("CD");
		list2.add("EF");
		System.out.println(list2); //[AB, CD, EF]
		
		
		ListIterator<String> it2 = list2.listIterator();
				
		while (it2.hasNext()) {
			String el = it2.next();
		//	System.out.print(el + " "); //AB CD EF 
			
			it2.set(el + "!");
		}
	//	System.out.println();
		System.out.println(list2); //[AB!, CD!, EF!]
		
		List<String> list3 = new ArrayList<>();
		list3.add("XY");
		list3.add("ZT");
		list3.add("UV");
		System.out.println(list3); //[XY, ZT, UV]
		ListIterator<String> it3 = list3.listIterator();
		
		//Before using hasPrevious() and previous (), you need to use  hasNext ()and next()
		while(it3.hasNext()) {
			it3.next();
			
		}
		while(it3.hasPrevious()) {
			String el = it3.previous();
			System.out.print(el + " "); //UV ZT XY 
		}
				
	}

}
