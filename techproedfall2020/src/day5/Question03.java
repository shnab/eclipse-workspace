package day5;

import java.util.Arrays;

public class Question03 {
	
    public static void main(String[] args) {
    	
    	// Create a method to find positive numbers number and negatives sum // negatiflerin toplamini
    	// Return type must be int array
    	// [a,b]
    	int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
    	System.out.println(Arrays.toString(countPositivesSumNegatives(nums))); //[10, -65]
    	
    }
    
    public static int [] countPositivesSumNegatives (int [] input) {
    	int sumNegatives =0;
    	int countPositives=0;
    	for (int w : input) {
    		if (w<0) {
    			sumNegatives+=w;
    		}
    		if (w>0) {
    			countPositives++;
    		}
    }
    	int [] totalCount = {countPositives,sumNegatives};
    	return totalCount;
	}

}
