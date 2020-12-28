package day04tulinhanim;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Question2 {

	public static void main(String[] args) {
	
		List<String> strArr = Arrays.asList("ONE","TWO","THREE","FOUR");
		Iterator<String> i = strArr.iterator();
		while(i.hasNext()) {
			String e =i.next();
			if(e.equals("THREE")) {
				break;
			}
			System.out.print(e+" ");
		}

	}

}
