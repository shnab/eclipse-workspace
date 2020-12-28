package Day02;

import java.util.Scanner;

public class SevenQuestion {

	public static void main(String[] args) {


		/*
		 String Method
	Ask user for a string and print a new string made of 3 copies of the last 2
	The strings length will be at least 2.
	ORNEK:
    INPUT     : Jacob
    OUTPUT : obobob
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Write a word");
		
		String str = scan.next();
		
		if(str.length()>=2) {
			String str2 = str.substring(str.length()-2);
			System.out.print(str2 + str2 + str2 );
			
		}else {
			System.out.println("Write a new word");
		}
			
		
	}

}
