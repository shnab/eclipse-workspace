package day05tulinhanim;

import java.util.ArrayList;

public class Question5 {

	public static void main(String[] args) {

		ArrayList<Integer> values = new ArrayList<>();
		values.add(4); //4 5 4 6  6
	    values.add(5);
		values.set(1, 6);
		 values.remove(0);
		 for (Integer v : values) {
			 System.out.print(v);
		 }

	}

}
