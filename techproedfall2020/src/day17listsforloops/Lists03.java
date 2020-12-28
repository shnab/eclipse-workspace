package day17listsforloops;

import java.util.ArrayList;
import java.util.List;

public class Lists03 {
	
	public static void main(String[] args) {
				/*
				 Create an integer array with 5 elements
				 Convert it to a list
				 Add 11, and 13 into the list, 11 will be at the beginning, 13 will at index 3
				 Increase the value of every element by 3
				 Print the multiplication of the elements from index 2 to index 5 
				*/
				
				//Create an integer array with 5 elements
				int arr[] = {1, 2, 3, 4, 5};
				
				//Convert it to a list
				List<Integer> list = new ArrayList<>();
				for(int i=0; i<arr.length; i++) {
					list.add(arr[i]);
				}
				System.out.println(list);
				
				//Add 11, and 13 into the list, 11 will be at the beginning, 13 will at index 3
				list.add(0, 11);
				System.out.println(list);
				list.add(3, 13);
				System.out.println(list);
				
				//Increase the value of every element by 3
				for(int i=0; i<list.size(); i++) {
					list.set(i, list.get(i) + 3);
				}
				System.out.println(list);
				
				//Print the multiplication of the elements from index 2 to index 5 
				int product = 1;
				for(int i=2; i<=5; i++) {
					product = product * list.get(i);
				}
				System.out.println(product);
				
				}
		}