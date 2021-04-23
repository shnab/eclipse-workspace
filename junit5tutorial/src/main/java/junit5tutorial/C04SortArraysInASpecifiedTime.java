package junit5tutorial;

import java.util.Arrays;
import java.util.Random;

public class C04SortArraysInASpecifiedTime {

	
	//Create a metthod to sort 100000integer  arrays whose lengths are 5.
	//Array elements should be select randomly
	//Test it, if it can be done in at most 2 seconds
	
	public void sortArrayInASpecifiedTime() {
		
		Random rand = new Random();
		
		int [] a = new int[5];
		
		for(int i =0; i<a.length; i++) {
			a[i] = rand.nextInt(100000);
		}
		
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
	}
}
