package day3435Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda07 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(9);
		list.add(13);
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(4);
		list.add(12);
		list.add(15);
		
		squareEvenDistinctRevSorted(list); // 144 36 16 4 
	
	}
		//Create a method to calculate the square of every even elements (filter), print then distincly and reversed sorted. 
		
	public static void squareEvenDistinctRevSorted( List<Integer> list ) {
		list.stream().filter(t->t%2==0).map(t->t*t).distinct().sorted(Comparator.reverseOrder()).forEach(Lambda01::print);	

		
}
}
