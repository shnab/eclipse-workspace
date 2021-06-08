package day15arraysdt;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {

		//1. one will be int array whose length is 4
		int a[] = new int[4]; //[0,0,0,0] ==> default
		a[0] = 14;
		a[1] = 12;
		a[2] = 13;
		a[3] = 11;
		System.out.println(Arrays.toString(a));
		
		//How to put ascending order
		Arrays.sort(a);
		System.out.println(Arrays.toString(a)); //[11, 12, 13, 14]
		
		//Type a program to add all elements in the array[a]
		int x=0;
		int sum=0;
		while(x<a.length) {
			sum =sum+a[x];
			x++;
		}
		System.out.println("Sum : " + sum); //50
			
		//2. one will be char array whose length is 6
		char b[] = {'a', 'b', 'A', 'd', 'e', 'f'};
		Arrays.sort(b);
		System.out.println(Arrays.toString(b)); //[A, a, b, d, e, f]
		
		//How to find the number of elements in an array
		//In Strings we were using length(), in Arrays we are using length. 
		//No parenthesis for length in Arrays
		System.out.println(a.length); //4
		System.out.println(b.length); //6
		
		//Print all elements of array b on the console in reverse order.
		for(int i=b.length-1; i>=0; i--) {
			System.out.print(b[i] + " "); //f e d c b a 
		}
		
		System.out.println();
		
		//For array b, print all elements whose indexes are even on the console.
		for(int i=0; i<b.length; i++) {
			if(i%2==0) {
				System.out.print(b[i] + " ");
			}
		}
		
		System.out.println();
		
		//For array b, concatenate all elements 
		String concat= "";
		for(int i=0; i<b.length; i++) {
			concat = concat + b[i];
		}
		System.out.println("Concatenated " + concat); //Concatenated Aabdef
		
		System.out.println();
		
		//Create a String array with 5 elements 
		String c[] = new String[5];
		System.out.println(Arrays.toString(c));//[null, null, null, null, null]
		
		c[0]="Ali";
		c[2]="Brad";
		c[1]="Kasim";
		c[3]="Mary";
		c[4]="Clara";
		System.out.println(Arrays.toString(c));//[Ali, Kasim, Brad, Mary, Clara]
		
		//Sort the elements in alphabetical order
		//sort() puts the elements in ascending order if the elements are numbers, and
		//puts the elements in alphabetical order if the elements are Strings
		//In Java, ascending order and alphabetical order are called "Natural Order"
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));//[Ali, Brad, Clara, Kasim, Mary]
	
		
		//binarySearch() is used to check if an element exists in an array or not.
		//Before using binarySearch(), you HAVE TO use sort()
		
		String d[] = {"John", "Adem", "Leo", "Brad", "Adem"};
		
		//Check if "Brad" exists in the array
		Arrays.sort(d);  // [Adem, Brad, John, Leo ]
		//binarySearch() returns some integers; if the integer is NOT NEGATIVE it means, 
		//the element exists in the array and the number displays the index of the element
		System.out.println(Arrays.binarySearch(d, "Brad"));//2
		System.out.println(Arrays.binarySearch(d, "Leo")); //4
		
		//Check if "Angie" exists in the array
		//If an elemnt doesnt exist, you will get NEGATIVE numbers
		//The value after "-" sign, displays the number of the order of the element
		System.out.println(Arrays.binarySearch(d, "Angie")); //-3 ==> Bu Array'in icnde olsaydi 2. sirada olacakti
		System.out.println(Arrays.binarySearch(d, "Mary")); //-6, olsaydi 5. sirada olacakti
		
		//binarySerach() method CANNOT be USED repeated elements. If you use 
		// you will get some results but it is not meaningful
		System.out.println(Arrays.binarySearch(d, "Adem")); //0
		
				//EXISTING //
		int k[] = {3, 5, 2, 12, 4, 3, 6};
		//check if 12 exists in the arrak "k"
		Arrays.sort(k);
		System.out.println(Arrays.toString(k)); //[2, 3, 3, 4, 5, 6, 12]
		System.out.println(Arrays.binarySearch(k, 12)); //6
		
		//non-existance, negative signs displays
		System.out.println(Arrays.binarySearch(k, 9)); //-7 ==> mevcut olsaydi 7. sirada olacakti
		System.out.println(Arrays.binarySearch(k, 15)); //-8
		
		//binaryserach can not be used for repeated elements
		System.out.println(Arrays.binarySearch(k, 3)); //1
		
		
		
		}
	}