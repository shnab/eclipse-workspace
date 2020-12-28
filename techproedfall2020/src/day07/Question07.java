package day07;

import java.util.Arrays;

public class Question07 {

	public static void main(String[] args) {

		/*
		 * (Pass By value)
		Create an array which has 5 elements
		Print all elements
		Create a for loop and increase all elemets by 2 then print it
		After loop print new Array
		Create a new loop and firstly change the elements then print them all
		After loop print it as array
		Change all elements permanently with loop.
		 */
		
		int arr[]= {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
		
		
		for (int w : arr) {
			System.out.print(w+2 + " ");
		}
		System.out.println("");
		System.out.println(Arrays.toString(arr));
		
		// how can increase all element by 2
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]+=2;
		}
		System.out.println(Arrays.toString(arr));
		
//		int arr [] = {1,2,3,4,5};
//		System.out.println(Arrays.toString(arr)); //[1, 2, 3, 4, 5]
//		
//		for (int w : arr) {
//			System.out.print(w+2 + " "); //3 4 5 6 7
//		}
//		
//		System.out.println("");
//		System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5] pass by value den dolayi orjinal deger tekrar console de gorunuyor. 
//		
//		// How to increase all elements by 2
//		for (int i = 0; i>arr.length; i++) {
//			arr[i]+=2;
//	}
//		System.out.println(Arrays.toString(arr));
	}
}
