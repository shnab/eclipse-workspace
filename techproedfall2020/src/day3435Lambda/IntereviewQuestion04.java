package day3435Lambda;

public class IntereviewQuestion04 {
	
    /*                              10 Minutes
    Given an array of integers, you have to find all pairs of elements in this array
    such that whose sum must be equal to a given number.
    For example, if {4, 5, 7, 11, 9, 13, 8, 12} is an array and 20 is the given number,
    then you have to find all pairs of elements in this array whose sum must be 20.
    In this example, (9, 11), (7, 13) and (8, 12) are such pairs whose sum is 20.
*/


	public static void main(String[] args) {
		int arr[] = {4, 5, 7, 11, 9, 13, 8, 12};
		int x =20;			

		findPairs(arr,x);
		
	}
	//ARR icinde for-loop kullanarak iki deger buluyoruz

	public static void findPairs (int arr[], int x) {
		
		for (int i=0; i<arr.length; i++) {
			for(int k=i+1; k<arr.length; k++) {
				if(arr[i] + arr[k] == x) {
					System.out.println(arr[i] + "+" + arr[k] + "=" + x);
				}
			}
		}
	}
}
