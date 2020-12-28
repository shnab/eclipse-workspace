package day3435Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Lambda08 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Mark");
        list.add("Jackson");
        list.add("Amanda");
        list.add("Mariano");
        list.add("Alberto");
        list.add("Tucker");
        list.add("Christ");
        
        checkLength(list); //true
        checkInitial(list);
        checkLast(list);
        getFirstAfterSorting (list); //Optional[Amanda]
        getLastAfterSorting (list);	 //Optional[Jackson]	

	}

	//Create a method to check if the lengths of ALL elemenets are less than 8
	
	public static void checkLength(List<String> list) {
		boolean result = list.stream().allMatch(t->t.length()<8); // allMatch onemli// True false veriyor sonucu
		System.out.println(result);
	}
	
	//create a method to check if the initial of any element are not X
	
	public static void checkInitial (List<String> list) {
		boolean result = list.stream().noneMatch(t->t.startsWith("X")); //true
		System.out.println(result);
	}
	
	//create a method to check if at least one of the elements ending with "r"
	
	public static void checkLast (List<String> list) {
		boolean result = list.stream().anyMatch(t->t.endsWith("r"));
		System.out.println(result);
	
	}
	
	////create a method to get the first element after sorting the elements by using their second last characters
	
	public static void getFirstAfterSorting (List<String> list) {
		Optional<String> el = list.stream().sorted(Comparator.comparing(t->t.charAt(t.length()-2))).findFirst();
		System.out.println(el); //Optional[Amanda]
	
	}
	
	//create a method to get the last element after sorting the elements by using their lenghts
	
	public static void getLastAfterSorting (List<String> list) {
		Optional<String> el = list.
									stream().sorted(Comparator.comparing(t->t.toString().length()).reversed()).
									findFirst();
	System.out.println(el); //Optional[Jackson]
		
	
	}
}
