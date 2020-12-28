package day05ifelseifnestedifternary;

import java.util.Scanner;

public class Ternary01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num = scan.nextInt();
		
		//if-Else Statement
		if(num%2==0) {System.out.println("Even");} else { System.out.println("Odd");} //even
		
		//Ternary. If else yerine kullaniliyor. Returns String vaule. Ondan value String olacak. Yani "EVEN" and "Odd" string oldugu icin 

						//Condition    QuestionMark    CodeForTrueCondition   Colon  CodeForFalseCondition
	String result =		num%2==0          ?					"Even"				:			"Odd";
	System.out.println("Ternary: " + result); //Even
	
	System.out.println("========");
	
	//If the data type for true and false conditions are different do not create result variable.
	//Put the ternary into System.outprint(ln) directly
	// eger return farkli olsaydi STRING -INT  o zaman, direk syso icine koy
	//ama icerideki degerleri SYSO icinde okutmak mumkun degil
	System.out.println(num>0 ? "Positive" : -1); //positive
	
	
	
	
	
	scan.close();
	
	}

}
