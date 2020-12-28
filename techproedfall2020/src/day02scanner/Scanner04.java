package day02scanner;

import java.util.Scanner; //util is the name of the library

public class Scanner04 {

	public static void main(String[] args) {
	
			/*
			 ASk user to enter full name and adress
			 Print them on the colsole
			 */
		
	// To create object follw the steps		
	//Class name     Object name Equal sign   new Keyword     Constructor
	//	Scanner        scan          =            new         Scanner(System.in);
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your first and last name");
			
			String fullName = scan.nextLine(); //for Strings we nextLine () method
												// There is one more method for Strings which is next
												//If you use next() (sadece bir kelime varsa), you can get just the first word in the String

						
			System.out.println("Enter your adress");
			String adress = scan.nextLine();
			
			System.out.println(fullName);
			System.out.println(adress);
			scan.close();
	}
	
}
