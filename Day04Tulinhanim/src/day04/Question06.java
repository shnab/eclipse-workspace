package day04;

public class Question06 {

	public static void main(String[] args) {


		// Find the program finds the biggest element of a given array
		int [] arr = {-12,-34,-56,-5};
		int max =arr[0];
		for (int i=0; i<arr.length;i++) {
			if (arr[i]>max) {
				max=arr[i];
			}
		}
		
		System.out.println("the maximum element is " + max );

	}

}
