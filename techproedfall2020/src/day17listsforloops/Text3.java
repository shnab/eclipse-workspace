package day17listsforloops;

public class Text3 {

	public static void main(String[] args) {

		//Wat is greatest
		int x[][] = {{2, 1}, {5,6, 7}};
		System.out.println(m(x)); //7

	}
	public static int m(int [][] m) {
		int result =m[0][1];
		for(int i= 0; i<m.length; i++) {
			for(int j=0; j< m[i].length; j++) {
				if(result< m[i][j]) {
					result =m[i][j];
				}
				
			}
			
		}
		return result;
	}

}
