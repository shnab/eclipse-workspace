package day19varargsaccessmodifierdt;

public class Test3 {

	protected int i = 12;
	void m3() {
		System.out.println();
	}

}

class Test4 {
	public static void main(String[] args) {
		Test3 obj =new Test3();
		System.out.println(obj.i); ////we can acces protected variablee in the same package
		obj.m3(); //we can acces default method in the same package
	}
}
