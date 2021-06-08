package day15arraysdt;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		
		
					//MultiDimensionalArrays
		//How to create multi-dimentional array
		int ma[][] = new int[3][2];
		//how to print multi-dimentional array
		System.out.println(Arrays.deepToString(ma)); //[ [0, 0], [0, 0], [0, 0] ]
		
		//how to assing values to the elements
		ma[0][1] = 2;
		System.out.println(Arrays.deepToString(ma)); //[ [0, 2], [0, 0], [0, 0] ]
		
		ma[2][0] = 5;
		System.out.println(Arrays.deepToString(ma)); //[ [0, 2], [0, 0], [5, 0] ]
		
		ma[0][0] = 1;
		System.out.println(Arrays.deepToString(ma)); //[ [1, 2], [0, 0], [5, 0] ]
		
		ma[1][0] = 3;
		System.out.println(Arrays.deepToString(ma)); //[ [1, 2], [3, 0], [5, 0] ]
		
		ma[1][1] = 4;
		System.out.println(Arrays.deepToString(ma)); //[ [1, 2], [3, 4], [5, 0] ]
		
		ma[2][1] = 6;
		System.out.println(Arrays.deepToString(ma)); //[ [1, 2], [3, 0], [5, 6] ]
		
		int maa[][] = { {1}, {3, 4}, {5, 6, 7} };
		System.out.println(Arrays.deepToString(maa));
		
		//how to print a specific inner arrays on the console
		System.out.println(Arrays.toString(maa[1])); //[3,4]
		
		// how to print a specific element in a multidimentioanl array
		System.out.println(maa[2][1]); // 6
		
		// How to print all elements one by one on the console in the same line with aa "*" at the beginning 
		//of very element
		
		for(int i=0; i<maa.length; i++) {
			
			for (int k=0; k<maa[i].length; k++) {
				System.out.print("*" + maa[i][k]);
			}
		}
		
		System.out.println();
		
		//How to find the product of all elements in the array "maa"
		
		int product = 1; // for addition begin with 1
		for(int i=0; i<maa.length; i++) {
			for(int k=0; k<maa[i].length; k++) {
				product = product * maa[i][k];
			}
		}
		System.out.println("The product of all elements: " + product); //2520
		
		// How to find the sum of all elements (Homework)
		
		int sum = 0; // for sum begin with 0
		for(int i=0; i<maa.length; i++) {
			for(int k=0; k<maa[i].length; k++) {
				sum = sum + maa[i][k];
			}
		}
		System.out.println("The sum of all elements: " + sum); //The sum of all elements: 26
	
		
//		int count=1;
//			for(int i=0;i<3;i++) {
//			for(int k=0;k<2;k++) {
//				ma[i][k]=count;
//				count++;
//			}
//		}
//		System.out.println(Arrays.deepToString(ma));
	
		 
	}

}
