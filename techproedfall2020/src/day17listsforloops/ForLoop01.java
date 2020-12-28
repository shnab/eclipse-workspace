package day17listsforloops;

import java.util.ArrayList;
import java.util.List;

public class ForLoop01 {

	/*
	 for-each-loop is the updated version of for-loop
	 ==> It is easy to type
	 ==> It is easy to read
	 ==> It eliminates the possible programmer errors
	 */
	
	public static void main(String[] args) {


		List<Integer> list1 = new ArrayList<>();
		list1.add(11);
		list1.add(13);
		list1.add(15);
		list1.add(12);
		list1.add(14);
		System.out.println(list1);
		
		//Use for loop to print on the console in the same line with a space between the elements
	
		for(int i=0; i<list1.size(); i++) {
			System.out.print(list1.get(i) + " ");
		}
	
		System.out.println();
		
		//Use for-each loop to print on the console in the same line with a space between the elements
		for(Integer w : list1) {
		System.out.print(w + " ");
		}
				
		System.out.println();
		//Use for-each loop to print even elements in the list
		//1. Way: 
		for(Integer w : list1) {
			if(w%2==0) {
				System.out.print(w + " ");	
			}
		
		}
		
		System.out.println();
		
		//2. way : "continue; " keyword means skip (atla). Continue bij one bij check to options
		for(Integer w : list1) {
			if(w%2!=0) {
				continue;
			}
			System.out.print(w + " ");
		}

		System.out.println();
		
		//Use for-each loop to print last 3 elements in the list
		//1. way 
		for(Integer w : list1) {
			if(list1.indexOf(w)<list1.size()-3) {
				continue;
			}
			System.out.print(w + " ");
		}
		
		System.out.println();
		// 2. way
		
		for(Integer w : list1) {
			if(list1.indexOf(w)>=list1.size()-3) {
				System.out.print(w + " ");
			}
			
		}
		
		System.out.println();
		
		//Use for-each loop to print first 3 elements in the list
		
	//	1. way
		for(Integer w : list1) {
			if(list1.indexOf(w)<3) {
				System.out.print(w + " ");
			}
			
		}
		
		System.out.println();
		
		//2 .way
		for(Integer w : list1) {
			if(list1.indexOf(w)>=3) {
				break;
			}
			System.out.print(w + " ");
		}
		
		
		
		
	}

}
