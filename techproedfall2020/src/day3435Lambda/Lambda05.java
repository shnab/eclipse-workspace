package day3435Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda05 {

	public static void main(String[] args) {
        List<String> list = new ArrayList<>();
            list.add("Ali");
            list.add("Mark");
            list.add("Jackson");
            list.add("Amanda");
            list.add("Jamieny");
            list.add("Jackson");
            list.add("Tucker");
            list.add("Christ");
            list.add("Alberto");

         printUpperCase1(list);
        System.out.println("===============");
        printUpperCase2(list);
        System.out.println("===============");
        printUpperCase3(list);
//        System.out.println("===============");
//        removeGreaterThanFive(list);
//        System.out.println("===============");
//        removeAorN(list);
        System.out.println("===============");
        sortLengthEl(list);
        System.out.println("===============");
        distinctsortLastEl(list);
        System.out.println("===============");
        sortLengthInitial(list);
        
    }
    //Create a method tp print all list elements in uppercase
    //Lambda Expression
    public static void printUpperCase1(List<String> list){
        list.stream().map(t->t.toUpperCase()).forEach(System.out::println);
    }
    //Method Reference
    public static void printUpperCase2(List<String> list){
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }
    //Another way...
    public static void printUpperCase3(List<String> list){
        list.replaceAll(t->t.toUpperCase());
        System.out.println(list);
    }

    //    Remove the elements if the length of the element is greater than 5
//    public static void removeGreaterThanFive(List<String> list){
//        list.removeIf(t->t.length()>5);
//        System.out.println(list);
//    }
//    Remove the elements if the element is starting with 'A' or ending with 'N'
//    public static void removeAorN(List<String> list){
//        list.removeIf(t->t.startsWith("A") || t.endsWith("N"));
//        System.out.println(list);
//    }

    //Create a method to print the elements after ordering according to their lengths
    public static void sortLengthEl(List<String> list){
        list.stream().sorted(Comparator.comparing(t->t.length())).forEach(System.out::println);
    }
    //Create a method to sort the elements by using their last characters
    
    public static void distinctsortLastEl (List<String> list) {
    	
    	list.stream().distinct().sorted(Comparator.comparing(t->t.substring(t.length()-1))).forEach(System.out::println);
    	
    }
    
    
    // Create a method to sort the elements according to their length and according to their first character
    
    public static void sortLengthInitial(List<String> list) {
    	list.
    		stream().
    		sorted(Comparator.
    		comparing(t->t.toString().length()).
    		thenComparing(t->t.toString().substring(0, 1))).
    		forEach(System.out::println);
    }
    
  
    
    
}