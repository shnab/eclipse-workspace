package day17listsforloops;

public class Text5 {

	public static void main(String[] args) {
		
		int arr[][] = { {5,12}, {3,8,4}, {6,3}};
		System.out.println(m(arr));
		
	}
	public static int m(int[][] arr) {
		int r,c; //bunlar local variable but not initialized
		int i, k = 0; //asagida initialize edilecekler
		
		for(r =0; r<arr.length; r++) {
			for(c =0; c<arr[0].length; c++) {
				i= arr[r][c];
				if(i>k) {
					k=i;
				}
			}
		}
			return k;
		}
	
}
