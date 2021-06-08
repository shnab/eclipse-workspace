package day17listsforloops;

import java.util.Arrays;
import java.util.Scanner;

public class ForLoopExample1 {

	public static void main(String[] args) {

//		int _i = 10;
//		int _j = 10;
//		String[][] array1 = new String[_i][_j];
//		for (int i = 0; i < _i; i++) {
//		    for (int j = 0; j < _j; j++) {
//		        if(i==0 || j == 0 || i == _i-1|| j == _j-1){
//		            array1[i][j] = "*";
//		        }
//		    }
//		}
//		System.out.println(Arrays.deepToString(array1));
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("ERnter an integer");
//		int length = scan.nextInt();
//		
//				
//		//burada normal forloop kullanacqaz cunku elemizde degerleri olan bir array veya list yok
//		int arr[][] = new int[length][length];
//		for(int i=0; i<length; i++) {
//			for(int k=0; k<length; k++) {
//				
//				arr[i][k] = length;
//			}
//		}
//		System.out.println(Arrays.deepToString(arr));
	
		
	    int n = 5;
	    String [][] array = new String[n][n]; // 2-dimension array define...
	    for (int i = 0; i < array.length; i++) {
	        for (int j = 0; j < array.length; j++) {
	            if(i == 0 || (i == array.length-1 || j==0 || j==array.length-1)){ // if top,left,right,bottom line then this...
	                array[i][j] = "*|";
	            }else{ // if not border line then this...
	                     array[i][j] = "_|";

	            }
	        }

	    }

	    for (int i = 0; i < array.length; i++) {
	        for (int j = 0; j < array.length; j++) {
	           System.out.print(array[i][j] + " ");
	        }
	        System.out.println("");
    
	}
      
        
}
}
