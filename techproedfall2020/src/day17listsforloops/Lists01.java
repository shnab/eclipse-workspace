package day17listsforloops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists01 {
	
	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		list1.add("Ali");
		list1.add("Veli");
		list1.add("Mary");
		list1.add(1, "Angie"); //index ile add
		list1.add("Veli");
		System.out.println(list1);
		
		System.out.println(list1.size());//5
		
		System.out.println(list1.get(3));//Mary
		
		//How to check if an element exists in the list
		System.out.println(list1.contains("Veli"));//true
		System.out.println(list1.contains("XXX"));//false
		
		//How to get index of first occurence of an element
		System.out.println(list1.indexOf("Veli"));//2
		System.out.println(list1.indexOf("XXX"));//-1
		
		//How to get index of last occurence of an element
		System.out.println(list1.lastIndexOf("Veli"));//4
		System.out.println(list1.lastIndexOf("XXX"));//-1
		
		//How to remove an element by using index
		//If you use remove() method with index, it will return the element which is removed
		//For lists, using methods is enough to update, no need to make assignment
		//Because of that lists are called "mutable"
		System.out.println(list1.remove(1));//Angie
		System.out.println(list1);//[Ali, Veli, Mary, Veli]
		
				//For Strings,if you want to see updates on the String, you have to make assignment.
				//Because of that Strings are called "immutable"
				String s = "Java ooh Java";
				s.replace("a", "");
				System.out.println(s);//Java ooh Java
		
		//How to remove a specific element by using the element
		//If you use remove() with the element, it will remove the first occurence of the element
		System.out.println(list1.remove("Veli"));//true
		System.out.println(list1);//[Ali, Mary, Veli]
		System.out.println(list1.remove("XXX"));//false
		
				//Add some elements
				list1.add("Mary");
				list1.add("Mary");
				list1.add("Ali");
				list1.add("John");
				System.out.println(list1);
		
		//How to update an element with index
		list1.set(2, "Ahmet");		
		System.out.println(list1);//[Ali, Mary, Ahmet, Mary, Mary, Ali, John]
		
		
		/*
		 Create an integer list which has five elements
		 update all elements by adding "*" on the right of every element
		 Print the updated list on the console
		 Ex; [1, 2, 3, 4, 5] ==> [1*, 2*, 3*, 4*, 5*]
		 */
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		
		List<String> list3 = new ArrayList<>();
		
		for(int i=0;i<list2.size();i++) {
		list3.add(list2.get(i) + "*");
		}
		System.out.println(list3); //[1*, 2*, 3*, 4*, 5*]
		
		// how to get a part of List
		System.out.println(list1.subList(2, 5)); //[Ahmet, Mary, Mary]

		// How to add a list into another list
		list1.addAll(list3);
		System.out.println(list1); //[Ali, Mary, Ahmet, Mary, Mary, Ali, John, 1*, 2*, 3*, 4*, 5*]
		System.out.println(list3); //[1*, 2*, 3*, 4*, 5*]
		
		// How to add a list into another list at a specified index
		list3.addAll(3, list1);
		System.out.println(list3); 
		// [1*, 2*, 3*, Ali, Mary, Ahmet, Mary, Mary, Ali, John, 1*, 2*, 3*, 4*, 5*, 4*, 5*]
		
		
		// list3.removeAll() method removes all elements of list from list3
		list3.removeAll(list1);
		System.out.println(list3);  //[]
		
		//if you want to make a list empty use clear()
		System.out.println(list2); // [1,2,3,4,5]
 		list2.clear();
 		System.out.println(list2.isEmpty()); //true
		System.out.println(list2); //[]
		
		list3.add("1*");
		list3.add("Ali");
		list3.add("John");
		System.out.println(list3); //[X, Ali, Jack]
				
		// if you want to check if multiple elements exist in a list
		//Put the elements int a list then use containsAll();
		System.out.println(list1.containsAll(list3));		//true
		
		//How to sort elements in a list
		System.out.println(list1);
		Collections.sort(list1);
		//list1.sort(c);
		System.out.println(list1);
		}
	}
