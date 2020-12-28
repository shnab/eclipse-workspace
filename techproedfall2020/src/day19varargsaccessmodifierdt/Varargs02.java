package day19varargsaccessmodifierdt;

public class Varargs02 {

	public static void main(String[] args) {

		concat("S", "K"); // 0
		concat("S", "t", "u"); //2

	}
	public static void concat(String s, String m, String... t) {
		System.out.println(t.length);
		
	}


}
