package questions;

public class Q18 {
	
	int i;

	public static void main(String[] args) {

		Q18 obj = new Q18();
		obj.i = 11;
		String s = "Good";
	   int i = 22;
		
		m1(i); //66
		m1(obj.i);// 33
		m1(s); //Good!

		
	}
	public static void m1(int x) {
		x = x + x + x; //66
		System.out.println(x);
	}
	public static void m1 (String s) {
		s = s + "!";
		System.out.println(s);
	}

}
