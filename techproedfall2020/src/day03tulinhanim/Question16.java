package day03tulinhanim;

import java.util.ArrayList;
import java.util.List;

public class Question16 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Sam");
		names.add("Sally");
		names.add("John");
		names.add("Sally");
		System.out.println(names.remove("Sally"));
		if(names.remove("Sally")) {
		names.remove("Micheal");  // not RTE
		}
		   System.out.println(names);

	}

}
