package day16multidimensionalarrayslistsdt;

import java.util.Arrays;
import java.util.Scanner;

public class InterviewQuestion2 {

	public static void main(String[] args) {
		/*
		 Create an array by the help of user
		 Ask user the element to remove
		 Remove the element user asked
		 Print the array on the console after removing
		 //[1, 2, 3,  4] icin
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the element");
		int length =scan.nextInt();
		
		int arr[] = new int[length];
		
		int i= 0;
		
		do {
			System.out.println("Enter the value of index : " + i);
			arr[i]= scan.nextInt();
	
			i++;
		}while(i<arr.length);
		System.out.println(Arrays.toString(arr));
		
		
		//burada arr i kullanarak yeni newArr lusturuyoruz. yoksa baska turlu remove metodu yok
		
		System.out.println("Tell me the index which you want to remove ");
		
		int idx = scan.nextInt();
		if(idx<0 || idx>=arr.length ) {
			System.out.println("Invalid index to remove. Please renter");
		} else {
			int m = 0; //index of new array
			
			int newArr[]= new int[length-1];
			for(int k =0; k<length; k++) {
				
				if(k==idx) {
					continue; //burada skip yapiyor sonrakine atliyor
				} 
				newArr[m] = arr[k];
				m++;
			}
				System.out.println(Arrays.toString(arr)); //[1, 2, 3, 4]
				System.out.println(Arrays.toString(newArr)); //[1, 2, 4]
			}
			
			
		}

	}


