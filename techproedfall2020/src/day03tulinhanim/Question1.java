package day03tulinhanim;

public class Question1 {
	// Is there any issue ? If nor what is the result?
	void method1() {
		System.out.println("This i Class Question1");
	}
	public static void main(String[] args) {
		Question1 obj1= new Question1();
		Question1 obj2 = new B();
		// B obj3 = new B();
		// B obj5 =  (B) new Question1();
		Question1 obj3 = new C();
		C obj4 = new C ();
		
		obj1.method1();
		obj2.method1();
		obj3.method1();
		obj4.method1();
}
}
class B extends Question1{
	void method1() {
		System.out.println("This i Class B");
	}
}
class C extends Question1{
	void method1() {
		System.out.println("This i Class C");
	}
	
}