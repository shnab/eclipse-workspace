package day05tulinhanim;

public class Question10 {

	public static void main(String[] args) {
		int arr1 [] = {1,2,3};
		int arr2 [] = new int [5]; // 00000
		arr1=arr2; // arr1 = 0 0 0 0 0 
		//arr2 = arr1;  // 1,2,3
		for (int i : arr2) {
			System.out.print(i +" "); // 1 2 3 0 0 0 0 0
		}
		
		int arr3 [] = new int [3];
		arr3= arr2; // 0 0 0 0 0
		for (int i : arr3) {
			System.out.print(i+" "); //1 2 3
		}


	}

}
