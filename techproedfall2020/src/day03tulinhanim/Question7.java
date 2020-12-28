package day03tulinhanim;

public class Question7 {

	private char ch;
	public static void main(String[] args) {
		char ch1 = 'a';
		char ch2 = ch1;
		ch2='b';
		
	Question7 obj = new Question7();
	obj.ch='c';
	System.out.println(obj.ch +" , "+ ch1+" , "+ch2);

	}
	}
