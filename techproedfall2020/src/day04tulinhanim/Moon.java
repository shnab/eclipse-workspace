package day04tulinhanim;

public class Moon {
	private char ch;
	public static void main(String[] args) {
	 char ch1 = 'a';
	 char ch2 = ch1;  // ch1 =a ch2=a
	 ch2= 'e';     // ch2 =e
	 
	 Moon obj1 = new Moon();
	 Moon obj2 = obj1;
	 obj1.ch = 'o';
	 obj2.ch='i';   // obj1.ch =i
	 
	 System.out.print(ch1+", "+ ch2);  // a,ei,i
	 System.out.print(obj1.ch + ", "+ obj2.ch);

	}

}
