package day05tulinhanim;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Question6 {

	public static void main(String[] args) {
		List<String> hex = Arrays.asList("30", "8", "3A", "FF");
		Collections.sort(hex);
		int x = Collections.binarySearch(hex, "8");
		int y = Collections.binarySearch(hex, "3A");
		int z = Collections.binarySearch(hex, "4F");
		System.out.println(hex);
		System.out.println(x + " " + y + " " + z);

	}

}
