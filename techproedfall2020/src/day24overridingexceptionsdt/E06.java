package day24overridingexceptionsdt;

public class E06 {
	
	/*
	 In Java, some Exceptions are Compile Time Exceptions(Checked Exception), it means 
	 when you type code Java will inform you about the Exception by putting red underline
	 Compile Time Exceptions: FileNotFoundException, IOException
	 
	 Some Exceptions are Run Time Exceptions(Unchecked Exception). 
	 Without running the code Java does not let you know about Exception. 
	 Run Time Exceptions: ArithmeticException, ArrayIndexOutOfBoundsException, NullPointerException
	                      NumberFormatException, ,ClassCastException
	                      
	 NOTE: You have to handle "checked exceptions" by "throwing exceptions" or by using 
	 "try-catch block".
	  For "un-checked exceptions " if you do type anything java will throw exception in Rum Time 
	 
	 */
	
	public static void main(String[] args) {
		
		//FileNotFoundException
		//FileInputStream fis = new FileInputStream("src/day25exceptions/TextFile");
		
		
		//ArithmeticException
		System.out.println(12 / 0);
		
		String s = "123";
		System.out.println(s + 1);//1231
		int num = Integer.parseInt(s);
		System.out.println(num + 1);// 124
		
		//If you try to convert a String which has at least one non-digit character
		//by using parseInt() method you will get NumberFormatException 
		String v = "abc";
		int num2 = Integer.parseInt(v);
		System.out.println(num2);//


	}

}
