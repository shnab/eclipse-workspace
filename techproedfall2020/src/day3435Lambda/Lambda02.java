package day3435Lambda;

import java.util.ArrayList;
import java.util.List;
public class Lambda02 {
	
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
        
        squareOfEl1(list);
        System.out.println();
        squareOfEl2(list);
        System.out.println();
        squareOfOddEl(list);
        System.out.println();
        cubeOfEven1(list);
        System.out.println();
        cubeOfEven2(list);
        System.out.println();
        System.out.println("The sum of all elements: " + sumOfAll1(list));
        System.out.println();
        System.out.println("The sum of all elements: " + sumOfAll2(list));
        System.out.println();
        System.out.println("The sum of all elements: " + sumOfAll3(list));
        System.out.println();
        System.out.println("The multiplication of all elements: " + multiplyAll1(list));
        System.out.println();
        System.out.println("The multiplication of all elements: " + multiplyAll2(list));
        System.out.println();
        System.out.println("The multiplication of all elements: " + multiplyAll3(list));
        System.out.println();
        System.out.println("The sum of even elements: " + sumSquareEven(list));

	}

	//Create a method to print the squares of every element on the console in the same line with a space between the elements
    //Lambda Expression
    public static void squareOfEl1(List<Integer> list){
        list.stream().map(t->t*t).forEach(t-> System.out.print(t + " "));
    }

	//Method Reference
    public static void squareOfEl2(List<Integer> list){
        list.stream().map(Lambda02::findSquare).forEach(Lambda01::print);
    }
    public static int findSquare(int a){
        return a*a;
    }

    //Create a method to print the squares of odd elements on the console in the same line with a space between the elements
    public static void squareOfOddEl(List<Integer> list){
        list.stream().filter(t->t%2!=0).map(Lambda02::findSquare).forEach(Lambda01::print);
    }

	//Create a method to print the cubes of even elements on the console like "The cube of 4 is 64"
    //Lambda Expression
    public static void cubeOfEven1(List<Integer> list){
        list.stream().filter(t->t%2==0).map(t->"The cube of " + t + " is " + t*t*t).forEach(System.out::println);
    }
    //Method Reference
    public static void cubeOfEven2(List<Integer> list){
        list.stream().filter(t->t%2==0).map(Lambda02::findCube).forEach(System.out::println);
    }
    public static String findCube(int t){
        return "The cube of " + t + " is " + t*t*t;
    }

    //Find the sum of all elements in the given list
    //Lambda Expression
    public static int sumOfAll1(List<Integer> list){
        return list.stream().reduce(0,(x,y)->x+y);
    }

	//Method Reference with our own method
    public static int sumOfAll2(List<Integer> list){
        return list.stream().reduce(0,Lambda02::sum);
    }
    public static int sum(int a, int b){
        return a+b;
    }

    //Method Reference with Java method
    public static int sumOfAll3(List<Integer> list){
        return list.stream().reduce(0,Integer::sum);
    }

    //Find the multiplication of all elements in the given list
    //Lambda Expression
    public static int multiplyAll1(List<Integer> list){
        return list.stream().reduce(1,(x,y)->x*y);
    }
    //Method Reference with your own method
    public static int multiplyAll2(List<Integer> list){
        return list.stream().reduce(1,Lambda02::multiply);
    }
    public static int multiply(int a, int b){
        return a*b;
    }
    //Method Reference with Java method
    public static int multiplyAll3(List<Integer> list){
        return list.stream().reduce(1,Math::multiplyExact);
    }

    //Find the sum of square of all even elements in the given list
    public static int sumSquareEven(List<Integer> list){
        return list.stream().filter(t->t%2==0).map(Lambda02::findSquare).reduce(0,Integer::sum);
        //If you want instead of "Integer::sum", you can use "Math::addExact"
    }
}
