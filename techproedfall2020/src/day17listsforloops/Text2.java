package day17listsforloops;

public class Text2 {

	public static void main(String[] args) {

		//toplam 
		int x[][] = {{1,2}, {3,4,5,}};
		System.out.println(m(x)); //18

	}
	public static int m(int [][] m) {
		int result =3;
		for(int i= 0; i<m.length; i++) {
			for(int j=0; j< m[i].length; j++) {
				result+=m[i][j];
			}
			
		}
		return result;
	}

}
