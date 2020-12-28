package day04;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
	
		/* Find the numbers from 5 to 195 that can be divided by 7
		 * Use do while
		 */

		Scanner scan = new Scanner(System.in);
		
        int i=5;
        
        do{
            if(i%7==0) {
            	System.out.print(i + " ");
            }   i++;
        }while(i<195);
      
	}

}
