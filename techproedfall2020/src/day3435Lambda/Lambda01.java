package day3435Lambda;

import java.util.ArrayList;
import java.util.List;

	public class Lambda01 {

	/*
     1)Lambda is "Functional Programming" Lambda is just used in collections
       We will focus on "what to do?" instead of "How to do?"
     2)Until now we used "Structured Programming"
       In "Structured Programming" most of the times we think "how to do?" not "what to do?"
    */

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
        printListElStructured01(list);
        System.out.println();
        printListElFunctional01(list);
        System.out.println();
        printEvenListElFunctional(list);
        System.out.println();
        printLIstElLessThan10Functional1(list);
        System.out.println();
        printLIstElLessThan10Functional2(list);
     
    }

	//Create a method to print the list elements on the console in the same line with a space between the elements
   
	public static void printListElStructured01(List<Integer> list){
        for(Integer w:list){
            System.out.print(w + " ");
        }
    }
    public static void printListElFunctional01(List<Integer> list){
        list.stream().forEach(t-> System.out.print(t + " ")); // list is the name of collection
        //stream put the elements by one by in the order from top to down. 
    }
    
    //create a method to print the even list elements on the console in the same line with a space between the elements
    public static void printEvenListElFunctional(List<Integer> list){
        list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t + " "));
    }

	//create a method to print list elements less than 10 on the console in the same line with a space between the elements
    /*
      Instead of using "Lambda Expression", if it is possible we use "Method Reference"
      Method Reference means ==> Class Name :: Method Name
      t-> System.out.print(t + " ") ==> System.out :: print
     */
    public static void printLIstElLessThan10Functional0(List<Integer> list){
        list.stream().filter(t->t<10).forEach(t-> System.out.print(t + " ")); //not recommended
    }
    
    public static void printLIstElLessThan10Functional1(List<Integer> list){
        list.stream().filter(t->t<10).forEach(System.out::print); //94624
    }

    public static void printLIstElLessThan10Functional2(List<Integer> list){
        list.stream().filter(t->t<10).forEach(Lambda01::print);
    }
    public static void print(int a){
        System.out.print(a + " ");
    }

	}
