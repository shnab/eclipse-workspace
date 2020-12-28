package day04ifelsestatementnt;

import java.util.Scanner;

public class IfElse04 {

	public static void main(String[] args) {


		/*
		 Ask user to enter any name of the days, then get second ,fourth, 
        and sixth letter of the day name and print them on the console, 
        in the same line.
        For example; if the user enters “Monday” output will be “ody”
		*/
		//To get a specific character from a String use the following code
		String s = "Learn Java";
		System.out.println(s.charAt(3));//r
		System.out.println(s.charAt(6));//J
		System.out.println(s.charAt(4)); //n
		System.out.println(s.charAt(1)); //e
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a day name");
		String day = scan.next(); // next HIER enough because all day names are single. no second name
		
		day = day.toLowerCase();
		
		if(day.equals("monday") || day.equals("tuesday") || day.equals("wednesday")
		   || day.equals("thursday") || day.equals("friday") || day.equals("saturday")
		   || day.equals("sunday")) {
			
			System.out.print(day.charAt(1) + day.charAt(3) + day.charAt(5)); // 332 burada + yaparsam ASCII tABLE DEGERINI TOPLUYOR.
			System.out.print(day.charAt(3));
			System.out.print(day.charAt(5));
			
		} else {
			System.out.println("Enter a valid day name");
		}
		
		scan.close();
	}

}
