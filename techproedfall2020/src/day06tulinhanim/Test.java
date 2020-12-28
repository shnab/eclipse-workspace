package day06tulinhanim;

public class Test {

	public void print (byte x) {
		System.out.println("byte");
	}
	public void print (int x) {
		System.out.println("int");
	}
	public void print (Object x) {
		System.out.println("Object");
	}
	public void print (float x) {
		System.out.println("Float");
	}
	public static void main(String[] args) {
		Test t = new Test();
		short s = 123;
		t.print(s);
		t.print(true);
		t.print(6.789);
	}

}
