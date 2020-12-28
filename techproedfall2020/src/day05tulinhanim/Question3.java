package day05tulinhanim;

public class Question3 {

	public static void main(String[] args) {
		String s = "Hello";
		String t = new String(s); // "Hello"-- It is adress (reference) will be diffferent
		if ("Hello".equals(s)) System.out.println("one"); //one
		if (t == s) System.out.println("two");    
	    if (t.equals(s)) System.out.println("three");  //three
		if ("Hello" == s) System.out.println("four");    //four
		if ("Hello" == t) System.out.println("five");
		String f = new String(s);
		f=t;
		if (f==t)
			System.out.println("same");
		
		System.out.println(t);


	}

}
