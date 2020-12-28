package day29iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterators04 {

	public static void main(String[] args) {


		/*
		 Create an integer list which has 5 elements 
		 Multiply just first 3 elements by 2
		 Print the list elements on the console in reverse order
		 Print the list on the console in reverse order
		*/
		
		List<Integer> list4 = new ArrayList<>();
		list4.add(12);
		list4.add(13);
		list4.add(14);
		list4.add(15);
		list4.add(16);
		System.out.println(list4); //[12, 13, 14, 15, 16]
		
		ListIterator<Integer> it5 = list4.listIterator();
		
		int idx = 0;
		while(it5.hasNext()) {
			
			Integer el = it5.next();
			
			if(idx>2) {
				break;
			}
			
			it5.set(el = el*2);
			
			idx++;
		}
		while(it5.hasNext()) {
			
			it5.next();
			
		}
		while(it5.hasPrevious()) {
			
			Integer el = it5.previous();
			
			System.out.print(el + " "); //16 15 28 26 24
		}

	}

}
