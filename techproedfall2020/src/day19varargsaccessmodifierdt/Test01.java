package day19varargsaccessmodifierdt;

public class Test01 {

	public static void main(String[] args) {
		
		m1(10);
		m1(11, 12, 13, 14);
		/*
		 	==>1
			10 
			==>4
			11 12 13 14 
		 */


	}
	static void m1 (int...a) {
		System.out.println("==>" + a.length);
		for(int w : a) {
			System.out.print(w+ " ");
		}
		System.out.println();
	}

}
