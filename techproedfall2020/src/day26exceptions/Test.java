package day26exceptions;

public class Test {

	public static void main(String[] args) {

		Integer z = 0;
		
		try {			
		
		String s = "abcd";

		z = Integer.parseInt(s);
		
		
		// When we get exception the code after the exception inside the try block 
		//do not run but the code outside the try block run
		System.out.println("xxxxxxx"); // does not done
		}catch(NumberFormatException e) {

		System.out.println("Good");
		
		}

		System.out.println(z); //runs
		
	}

}
