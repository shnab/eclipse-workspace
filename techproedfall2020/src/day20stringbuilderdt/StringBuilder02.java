package day20stringbuilderdt;

public class StringBuilder02 {

	public static void main(String[] args) {
		
		String str = "Learn";
		
		concat(str);
		
		System.out.println(str);
		/*
		 String is inmutable. Java has a StringBuilder class. 
		 if we create String by using StringBuilder
		 
		 */
		
	}
	public static String concat(String str) {
		return str + "X";
	}
	
}
