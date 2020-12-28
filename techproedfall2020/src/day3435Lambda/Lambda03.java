package day3435Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lambda03 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(-9);
        list.add(13);
        list.add(4);
        list.add(6);
        list.add(2);
        list.add(4);
        list.add(12);
        list.add(15);
       System.out.println("Maximum element is " + maxEl0(list)); //Maximum element is 15
        System.out.println("Maximum element is " + maxEl1(list)); //Maximum element is 15
        System.out.println("Maximum element is " + maxEl2(list)); //Maximum element is 15
        System.out.println("Maximum element is " + maxEl3(list)); //Maximum element is 15
        sortedList(list); //-9 2 4 4 6 12 12 13 15 
	}
	
	//Create a method to find the maximum value from the list, use "Structured Program,ming"

	public static int maxEl0(List<Integer> list) {
		Collections.sort(list);
		return list.get(list.size()-1);
		
	}
	//Create a method to find the maximum value from the list, use "Functional Program,ming"
	//Lambda Expression 
	public static int maxEl1(List<Integer> list) {
		return list.stream().reduce(Integer.MIN_VALUE, (x,y)->x>y ? x : y);
	}
	
	//Method references with Java Methodds
	public static int maxEl2(List<Integer> list) {
		return list.stream().reduce(Integer.MIN_VALUE, Integer::max); // MIN VALUE yerine 0 konulursa negatif ssayilarda hata veriyor.
	}
	
	   //Method Reference with my own method
    public static int maxEl3(List<Integer> list){
        return list.stream().reduce(Integer.MIN_VALUE,Lambda03::maxElement);
    }
    public static int maxElement(int x, int y){
        return x>y ? x : y;
    
	}
    
    //Homework
    //Create a method to find the minimum value from the list with 3 ways, use "Functional Programing"
        
    
    // Create a method to print list element in natural order by using functioanl Programming
     public static void sortedList(List<Integer> list) {
    	list.stream().sorted().forEach(Lambda01::print); //
    }
    
    
}
