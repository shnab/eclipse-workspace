package day17listsforloops;

import java.util.ArrayList;
import java.util.List;

public class ForLoop05 {

	public static void main(String[] args) {

		//Remove repeated elements from a list
		//Example: [a, b, c, b, a, a, d] ==> [a, b, c, d]
		
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("b");
		list.add("a");
		list.add("a");
		list.add("d");
		System.out.println(list);
		
		List<String> nonRepeatedList = new ArrayList<>();
		

		//1.Way:
		for(String w : list) {
			if(nonRepeatedList.contains(w)) { 
				continue; // if contains, skip it, dont do anything, otherwise add it
			}
			nonRepeatedList.add(w);
		}
		System.out.println(nonRepeatedList); // [a, b, c, d] tekrar edenler atildi
		
		//2.Way:
		for(String w : list) {
			if(!nonRepeatedList.contains(w)) {
				nonRepeatedList.add(w);
			}	
		}
		System.out.println(nonRepeatedList);

		
		List<String> nonRepeatedList1 = new ArrayList<>();
		for(String w: list) {
			if(nonRepeatedList1.contains(w)) { 
				break; //a, b, c ==> bu kod sadece tekrar edenleri aldi d yi almadi
			}
			nonRepeatedList1.add(w);
		}
		
		System.out.println(nonRepeatedList1);
	}

}
