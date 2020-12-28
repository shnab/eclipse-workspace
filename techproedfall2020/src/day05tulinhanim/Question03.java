package day05tulinhanim;

public class Question03 {

	public static void main(String[] args) {

		String s = "Hello";
		int a = 3;
		String t = new String(s); // ths is an obj vslue ="Hello"
		if ("Hello".equals(s)) System.out.println("one"); //one 
		if (t == s) System.out.println("two");    
	    if (t.equals(s)) System.out.println("three");  // three
		if ("Hello" == s) System.out.println("four");    //four
		if ("Hello" == t) System.out.println("five");
		String f = new String(s); //Hello
		f=t; //assignment 
		if (f==t)
			System.out.println("same");
		if (a==3) {
			System.out.println("same");
		}
		if (f.equals(t))
			System.out.println("same");

	}

}
