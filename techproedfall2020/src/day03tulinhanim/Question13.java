package day03tulinhanim;

public class Question13 {

	public static void main(String[] args) {
		int var =1;
		  //1
		System.out.println(methodInc(var));  // 2 
		System.out.println(var);
	}
	static int methodInc(int var) {
		// var++;  
		return var ++; 

	}

}
