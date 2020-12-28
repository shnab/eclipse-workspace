package day14staticblockarrays;

import java.util.Arrays;

public class Arrays01 {

	int i = 12;
	
	/*
	1) To store multiple values in a reserved area in memory, we may use "Array" s
	 2) An array can have just a single data type.
	 3) When you cretae an array you have to declaare a) Data types of the elements
	 												  b) The number of elements
	 4) What kind of data types can we store in an array?
	  a) All primitives can be stored
	  b) Non primitive ones CANNOT be stored in arrays. Heap memory icin calismaz sadece Stack memory icin calisir.  Cunku sadece references van Non-primitives kisim stored
	  c) References of non-primitive ones can be stored.
	  5) Arrays are objects so they are stored in Heap Memory, arrays have methods in heap memory next to the values
	 */
							// burasi da bir array, args de array name
	public static void main(String[] args) {
	
			//how to create an array
		int array1[] = new int[5]; // sayi yazilmali. Array is an object
		
		//How to add an element into an array
		array1[0] = 13;
		array1[3] = 25;
		array1[2] = 13;
		array1[4] = 31;
		array1[1] = 10;		
		//How to print an array on the console
		System.out.println(Arrays.toString(array1));
				
		//How to print a specific element
		System.out.println(array1[3]); //25
		
		//Create a String array. 
		String b[] = new String[3];
		
		//iF you dont assing value for an element, Java will use default values for it. 
		b[0] = "Ali";
		b[2] = "Veli";
		System.out.println(Arrays.toString(b)); //burada 1 satir yazilmadi ama default deger olarak null degeri console de gorundu. 
		//Bunlar non primitive olmasina ragmen consolede orjinal isimler gorundu. 
		//Cunku Java Stack uzerindeki references degerlerine gidiyor sonra Heap memory
	
			System.out.println(b[2]); //Veli
			
		/*
		 Cretae a double array whose length is 5.
		 Print all elemnts in a line and but "-" between the elements
							2.1-3.2-4.0
		  */
			
			double c[] = new double[5];
			c[0] = 1.2;
			c[1] = 3.4;
			c[3] = 5.2;
			c[4] = 7.8;
			//in Strings we use length () ", in arrays we use "length"
			for(int i = 0; i<c.length; i++) {
				System.out.print(c[i] + " - ");
			}
	
			
	}

}
