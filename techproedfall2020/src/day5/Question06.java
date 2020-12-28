package day5;

import java.util.Scanner;

public class Question06 {

	// Write a program to write phone number (444 02 34) 's reading
		// four for 4 etc. 
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
    
		System.out.println("Enter your phone number ");
		String num = scan.nextLine().replace(" ","");
		
		
		for (int i = 0; i < num.length(); i++) {
			int ones = new Integer (num.substring(i, i+1));
			switch(ones) {
			case 0 : System.out.print("zero "); break;
			case 1 : System.out.print("one "); break;
			case 2 : System.out.print("two "); break;
			case 3 : System.out.print("three "); break;
			case 4 : System.out.print("four "); break;
			case 5 : System.out.print("five "); break;
			case 6 : System.out.print("six "); break;
			case 7 : System.out.print("seven "); break;
			case 8 : System.out.print("eight "); break;
			case 9 : System.out.print("nine "); break;
			default:
				break;
			
			
			}
			
			
		}
		
		
		
		
		
//        System.out.print("Enter your phone number: ");
//        String num = scan.nextLine();
//        
//        String arr [] = num.split("");
//            for (String w : arr) {
//            switch(w) {
//            case "0" : System.out.print("Zero ");  break;
//            case "1" : System.out.print("One ");  break;
//            case "2" : System.out.print("Two ");  break;
//            case "3" : System.out.print("Three ");  break;
//            case "4" : System.out.print("Four ");  break;
//            case "5" : System.out.print("Five ");  break;
//            case "6" : System.out.print("Six ");  break;
//            case "7" : System.out.print("Seven ");  break;
//            case "8" : System.out.print("Eight ");  break;
//            case "9" : System.out.print("Nine ");  break;
//            
//            } 
//            
//        }
      }

}
