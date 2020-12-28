package day05;

import java.util.Arrays;

public class Question01 {
			public static void main(String[] args) {
			
				/* Create 3 elements String array
				 * clever, meek,nice
				 *  print it firstly one by one then as a list 
				 *  add ly to all elements 
				 */
				
				String [] arr = new String [3];
				arr [0] ="clever";
				arr[1] ="meek";
				arr[2]= "nice";
				System.out.println(Arrays.toString(arr));
				
				for (String w : arr) {
					System.out.print(w  +" ");
					
				}
				System.out.println();
				
				String add = "ly";
				for (String w: arr) {
					System.out.print(w.concat(add) +" ");
					
				}
			

	}

}
