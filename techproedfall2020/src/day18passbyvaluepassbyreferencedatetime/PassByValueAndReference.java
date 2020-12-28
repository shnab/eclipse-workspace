package day18passbyvaluepassbyreferencedatetime;

import java.util.ArrayList;
import java.util.List;

public class PassByValueAndReference {

	public static void main(String[] args) {
		
		/*
		 1) Java uses "pass by value" dus copy one, , java doesnt use "pass by reference"
		 */
		
		//Pass by value with primitives
		int y =5;
		square(y);		
		System.out.println(y);
		
		//Pass by value with non-primitives
		// 1 type
		// After using methods if the original value doesn't change 
		// it is called "immutable", so Strings are immutable
		String s = "Ali";
		System.out.println(concat(s)); //Ali*
		System.out.println(s); //Ali ==> bu orijinal value
		
		// 2. type, dit is mutable
		//After using method, original value changes in lists 
		//because of that lists are called "mutable"
		List<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(12);
		System.out.println(increase(list));
		System.out.println(list);
		
		//Pass by Reference
		//When pass by reference is used, the copy of reference is created
		//and used it in the method. Original reference and copy reference
		//points the same object. Because of that, using original or copy
		//reference updates the same data which is original.
		
		
		
		
		
		
	}
	
	public static void square(int x) {
		System.out.println(x * x);
		
	}
	
	public static String concat(String s) {
		return s + "*";
		
	}
	
	public static List<Integer> increase(List<Integer>list) {
			list.add(3);
			return list;
	}
}
