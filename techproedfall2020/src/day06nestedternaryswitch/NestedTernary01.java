package day06nestedternaryswitch;

import java.util.Scanner;

public class NestedTernary01 {

	public static void main(String[] args) {

		
		/*
		 Use nested ternary
		 
		 Ask user to enter an integer.
		 
		 If the integer is greater than or equal to 0 then check
		 If it has 2 digits or not.
		 If it has 2 digits print its square(a*a) otherwise print its cube(a*a*a)
		 
		 If the integer is less than 0 then check
		 If it is less than -10 or not.
		 If it is less than -10 print the number itself otherwise print its absolute value.
		*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int a= scan.nextInt();
		
		//benimki
		int res= a>=0 ? (a>9 && a<100 ? a*a : a*a*a ) : (a<-10 ? a : -1*a);
		System.out.println(res);
		
		if(a>0) {
			if(a>9 && a<100) {
				System.out.println(a*a);
			}else {
				System.out.println(a*a*a);
			}
		}else if(a<-10) {
			System.out.println(a);
		}else {
			System.out.println(-1*a);
		}
		
		
		
		
		//If all teype same u kan dan int maken
		//parantez olsa da olmasa da calisir.
		int result = (a>= 0 ? (a>9 && a<100 ? a*a : a*a*a ) :  (a<-10 ? a : -1*a) );
		System.out.println(result);
		
		scan.close();
	}

}
