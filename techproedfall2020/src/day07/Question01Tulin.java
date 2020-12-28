package day07;

import java.util.Arrays;
import java.util.Scanner;

public class Question01Tulin {

	//Create a method to find an element's index in an array
	// Get the element from the user
	
	
		public static void main(String[] args) {
		
				
				int[] my_array = {12,15,43,23,56,76,78,90,77,43};
				System.out.println(Arrays.toString(my_array));
				Scanner scan = new Scanner (System.in);
				System.out.println("Enter your number to find index ?");
				int num = scan.nextInt();
				System.out.println(num + "number is"+ findIndex(my_array, num)+ ". index of arrray");
				scan.close();
				
					
				} 
				
				public static int findIndex (int[] myArray, int t) {
					if (myArray == null)
						return -1;
					int len = myArray.length;
					int i=0;
					while (i<len) {
						if (myArray[i]==t)
							return i;
						else i=i+1;
					}
					
					return -1;

//					   public static void main(String[] args) {
//					        
//					        System.out.println("enter a number to see the element");
//					        Scanner scan = new Scanner(System.in);
//					        int element = scan.nextInt();
//					        System.out.println(getElement(element));
//					        
//					    }
//					    
//					    public static int getElement(int element) {
//					        int[] my_array = {12,15,43,23,56,76,78,90,77,43};
//					        Arrays.sort(my_array);
//					        return my_array[element];
					
					
//					Scanner scan = new Scanner(System.in);
//					System.out.println("Please enter the element you want to see");
//					int element = scan.nextInt();
//					System.out.println(elementOfArray(element));
//					}
//				
//				public static int elementOfArray(int element) {
//					int[] my_array = {12,15,43,23,56,76,78,90,77,43};
//					return my_array[element];
//				}

	
		}
		
}
