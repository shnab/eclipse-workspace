package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {

		/*
		 Get 6 numbers from the user, create a list with these numbers
		 Print the number of even elements
		 */
		
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your values : ");
        int [] nums = {scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(),scan.nextInt()};
        int count = 0;
        for(int i : nums ) {
        	if (i%2==0) {
        		count++;
        	}
        }
        System.out.println("The even numbers of arrays is " + count);
        }
	
	}

