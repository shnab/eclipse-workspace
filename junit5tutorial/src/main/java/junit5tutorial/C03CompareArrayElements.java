package junit5tutorial;

import java.util.Arrays;

public class C03CompareArrayElements {
	//Create a method which accepts 2 arrays as a paratameter 
	//and returns true if all elements are same, returns false if any element is different

	
	public <T> boolean compareElementsOfTwoArrays(T[] a, T[] b) {
		Arrays.sort(a);
		Arrays.sort(b);
		
		if(Arrays.equals(a, b)) {
			return true;			
		} else {
			return false;
		}
		
	}
	
}
