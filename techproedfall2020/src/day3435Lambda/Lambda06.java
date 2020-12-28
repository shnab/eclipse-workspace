package day3435Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda06 {

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
        lengthNameSort(list);
    }
    //Create a method to print the length of every element in the following format in the order by their length
    //  Ali: 3        Mark: 4     Amanda: 6     etc.
    public static void lengthNameSort(List<String> list){
        list.
                stream().
                sorted(Comparator.comparing(t->t.length())).
                map(t->t + ": " + t.length()).
                forEach(System.out::println);
    }

}
