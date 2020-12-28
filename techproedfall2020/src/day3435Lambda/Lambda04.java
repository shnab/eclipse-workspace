package day3435Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lambda04 {

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
        distinctEl(list);
        System.out.println();
        squareDistinctSortedEven(list);
        System.out.println();
        sqrtDistinctReverseOdd(list);
        System.out.println();
        System.out.println(halfDistinctReverseList1(list)); //[7.5, 6.5, 6.0, 4.5, 3.0]
        System.out.println();
        System.out.println(halfDistinctReverseSet2(list)); //[4.5, 6.0, 3.0, 6.5, 7.5]
    }

	//Create a method to print list elements in natural order. Print the repeated elements just once.
    public static void distinctEl(List<Integer> list){
        list.stream().sorted().distinct().forEach(Lambda01::print);
    }
    //Create a method to print the square of distinct, even elements in natural order.
    public static void squareDistinctSortedEven(List<Integer> list){
        list.stream().filter(t->t%2==0).distinct().sorted().map(t->t*t).forEach(Lambda01::print);
    }
    //Create a method to print the square root of distinct, odd elements in reverse order.
    public static void sqrtDistinctReverseOdd(List<Integer> list){
        list.stream().filter(t->t%2!=0).distinct().map(Math::sqrt).sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
    //Create a method to print the half of distinct, greater than 5 elements in reverse order in a list.
    public static List halfDistinctReverseList1(List<Integer> list){
           return list.
                    stream().
                    filter(t->t>5).
                    map(t->t/2.0).
                    distinct().
                    sorted(Comparator.reverseOrder()).
                    collect(Collectors.toList()); //[7.5, 6.5, 6.0, 4.5, 3.0]
    }
    
    public static Set halfDistinctReverseSet2(List<Integer> list){
        return list.
                 stream().
                 filter(t->t>5).
                 map(t->t/2.0).
                 collect(Collectors.toSet()); //[4.5, 6.0, 3.0, 6.5, 7.5]
    }

}