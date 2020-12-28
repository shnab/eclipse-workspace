package Day02;

import java.util.Scanner;

public class FourthQuestion {

	public static void main(String[] args) {


		/*
		 String Methods
   create 2 words : name1 and name2
   if the name1 has even numbers of characters,
   then insert the second word in the middle of the first name
  if the first word has odd numbers
   Then print the “Name2 cannot be inserted in the name1”

 EXAMPLE:
    INPUT      : name1= Samuel
                       name2= Jack
                      
    OUTPUT  : SamJackuel
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your first name");
		String name1 = scan.next();
		
		System.out.println("Enter your second name");
		String name2 = scan.next();
		
		System.out.println(name1.substring(2,5));
		
		System.out.println(name1.length());
		
		if(name1.length()%2==0) {
			System.out.println(name1.substring(0, name1.length()/2) + 
					name2 + name1.substring(name1.length()/2));
		}else {
			System.out.println("Name2 cannot be inserted in the name1");
		}

	}

}
