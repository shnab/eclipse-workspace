package day03tulinhanim;

public class Question6 {

	public static void main(String[] args) {
		int var = 5;
		var ++;  // 6
		if(var++ <6) {  //7
			System.out.println(--var); // 6 
		}
		else {
			System.out.println(++var);   // 8
		}
		}
	}