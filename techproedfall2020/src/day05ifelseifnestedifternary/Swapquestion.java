package day05ifelseifnestedifternary;

import java.util.Scanner;

public class Swapquestion {

	public static void main(String[] args) {
		
		/*
		 How to switch the values of 2 variables.
		 For example int a = 12 and int b = 13 ==> a = 13 and b = 12 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Give me 2 integers to swap");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("a: " + a ); //12
		System.out.println("b: " + b); //13
		
		System.out.println("=============");
		//1. way; By using 3rd variable
		//burada temp degeri 0. a=12 ve kopy of value temp in icine giiyor. Sonra 12 b'nin icine gidiyor
		//ve kills b'nin icindeki 13 degerini. ayni sekilde b'nin icindeki 13 de a'nin icine gidiyor. Oda onu olduruyor. Bi sandalyede 2 kisi oturamaz
		//1. step: 
		int temp = 0; 
		temp = a;
		//2. step
		a = b;
		//3. step
		b = temp;
		System.out.println("a: " + a ); //13
		System.out.println("b: " + b); //12
		
		System.out.println("=============");
		//2. way without using 3rd value
		a = a + b;//25=12+13
		b = a - b;//12=25-13
		a = a - b;//13=25-12
		
		System.out.println("a: " + a ); //13
		System.out.println("b: " + b); //12
		
		scan.close();
		
	}

}
