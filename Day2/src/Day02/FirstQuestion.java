package Day02;

import java.util.Scanner;

public class FirstQuestion {

	public static void main(String[] args) {

		/*
		 Write a Java program to replace all the 'd' characters with 'f' characters. Go to the editor

   EXAMPLE:

    INPUT      :  The quick brown fox jumps over the lazy dog.
    
  OUTPUT :   The quick brown fox jumps over the lazy fog.
		 */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Write a sentence");
		
		String str = scan.nextLine();
		
		str = str.replace('d', 'f');
		
		System.out.println(str);

	}

}
