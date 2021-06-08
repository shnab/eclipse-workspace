package day17listsforloops;

public class Text01 {

	public static void main(String[] args) {
		
		//how to sum of 1 index of multidimanetioanl array
		int [][] x = {{2,1}, {1,7,1}};
		System.out.println(m(x[1])); //9

	}
	public static int m(int[] m) {
		int result =0;
		for(int i=0; i<m.length; i++) {
			result += m[i];
		}
		
		return result;
	}

}
