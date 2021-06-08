package day14staticblockarrays;

import java.util.Arrays;

public class ArraysBenimCalisma {

	public static void main(String[] args) {

		//How to create Array
		int array[] = new int[3]; //==> Arrayde 3 eleman olacak.
		array[0]= 1;
		array[1]= 3;
		array[2]=4;
		//array[3]=5; ==> 4. indexi kabul etmedi. 
		System.out.println(Arrays.toString(array)); //[1, 3, 4]
		System.out.println(array[2]);
		
		//String array
		String arr[]= new String[3];
		arr[1]="Ali Can";
		arr[0]= "Veli Han";
		System.out.println(Arrays.toString(arr)); //[Veli Han, Ali Can, null]
		System.out.println(arr[2]); //null
		
		//double array yaz. arada - olsun
		
		double arr1[] = new double[3];
		arr1[0]=2.3;
		arr1[1]=4.5;
		arr1[2]=5.7;
		
		//Array icin kullanilan length icin () parantez kullanmiyoruz.
		for(int i=0; i<arr1.length; i++) { 
			System.out.print(arr1[i] + " - "); //2.3 - 4.5 - 5.7 - 
		}

	}

}
