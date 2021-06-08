package day15arraysdt;

import java.util.Arrays;

public class ArraySorular {

	public static void main(String[] args) {

		//Bu arrayin icinde bulunan 3 lerin adedi
		int arr[] = {3,2,3,4,4,5};
		int count =0;
		
		for(int i= 0; i<arr.length; i++) {
			if(arr[i]==3) {
				count++; 
			}
		}
		System.out.println(count);
		
		
			char arr1[]= new char[4];
			arr1[0]='A';
			arr1[1]='E';
			arr1[3]='M';
			
			System.out.println(Arrays.toString(arr1)); //[A, E, , M] ==> char oldugu icin 0 olmuyor.sadece iki virgul arasinda bosluk
			
			//Array icindeki elemanlarin toplami
			int x[] = {3,5,7};
			int a=0;
			int b=0;
			while(a<x.length) {
				b= b + x[a];
				a++;	
			}
			System.out.println(b); //15
	
			
			int k =0;
			for(int c=0; c<x.length; c++) {
				k= k + x[c];
				}
			System.out.println(k); //15
	}

}
