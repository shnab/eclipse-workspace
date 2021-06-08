package day19varargsaccessmodifierdt;

public class Test02 {
	
	static void m2(String str, int...a) {
		System.out.println(str);
		for(int i: a) {
			System.out.print(i+ " ");
		}
		System.out.println();
	}
	

	public static void main(String[] args) {

		m2("Java", 101, 102); //Java
							//101 102

	}

}
