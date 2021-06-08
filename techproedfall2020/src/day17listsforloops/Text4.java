package day17listsforloops;

import java.util.Arrays;

public class Text4 {

	public static void main(String[] args) {

		//burada if 2 defa calisiyor, ayri ayri
		int arr[][] = {{3, 2, 1}, {1,2,3}};

		for(int i= 1; i<arr.length; i++) {
			for(int k=1; k< arr[i].length; k++) {
				if(arr[i][k]%2==1) {
					arr[i][k] = arr[i][k]+1; //4 sonucu geliyor
				}
				if(arr[i][k]%2==0) {
					arr[i][k] = arr[i][k] *2; //yukarida cikan 4 sonucu burada 8 oluyor.
				}
			}	

		}
		System.out.println(Arrays.deepToString(arr));//[[3, 2, 1], [1, 4, 8]]
	}
}
		
		
		
		
		
		
		
		
		
		
		