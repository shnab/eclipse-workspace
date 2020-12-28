package Day02;

import java.util.Scanner;

public class ThirdthQuestion {

	public static void main(String[] args) {


		/*
        If,IfElse,
Write a Java program that reads a floating-point number. 
If the number is zero it prints "zero", otherwise, print "positive" 
or "negative". 

EXAMPLE:

INPUT      : -2534

OUTPUT : Negative

*/

Scanner scan = new Scanner(System.in);

System.out.println("Enter your number");

float num = scan.nextFloat();

if(num==0) {
System.out.println("The number is zero");
}else if(num>0) {
System.out.println("The number is positive");
}else {
System.out.println("The number is negative");
}
	}

}
