package day08stringmanipulationdt;

public class String01 {

	public static void main(String[] args) {
		
		//13.substring() ==> alt string 
		String s1 = "Java is Java";
		
		System.out.println(s1.substring(3));//a is Java
		//Print "is Java" on the console by using substring()
		System.out.println(s1.substring(5));//is Java
		
		//Get just the last character by using substring()
		System.out.println(s1.substring(s1.length()-1));//a
		System.out.println(s1.charAt(s1.length()-1));
		
		//If you use the index equals to the length you will get nothing on the console
		System.out.println(s1.substring(12));//nothing
		//If you use the index greater than the length you will get Exception(like an error)
		//System.out.println(s1.substring(15));
		
		//First index cannot be greater tha second index in substring()
		//System.out.println(s1.substring(5, 2));
		
		/*
		 In Java, there are 2 types of errors
		 1)Compile Time Error: When you type code if you get red underline it means you got Compile Time Error
		 2)Run Time Error: If you get red error messages(Exception) on the console after running the code
		                   it is called Run Time Error. 
		*/
		
		//Get all String by using substring()
		System.out.println(s1.substring(0));//Java is Java
		
		//In substring() method if you  use two parameters, first one is inclusive, second one is exclusive
		System.out.println(s1.substring(2, 7));//va is
		
		//Get "is Ja" by using substring() ==> 5 is inclusief 10 is exclusive
		System.out.println(s1.substring(5, 10));//is Ja
		
		System.out.println(s1.substring(5, 5));//You will get nothing on the console
		//In substring method beginning index can not be greater than end index
		//System.out.println(s1.substring(8, 5)); // Compile time error
		
		//14.toLowerCase()
		String s2 = "Teach more learn more";
		System.out.println(s2.toLowerCase());//teach more learn more
		
		//15.toUpperCase()
		System.out.println(s2.toUpperCase());//TEACH MORE LEARN MORE
		
		//By using Substring s2, convert just "Teach" to uppercase
		System.out.println(s2.substring(0, 5).toUpperCase() + s2.substring(5));//TEACH more learn more
		System.out.println(s2.replace("Teach", "TEACH" )); //TEACH more learn more
		System.out.println(s2.subSequence(0, 17) + s2.substring(17).toUpperCase()); //Teach more learn MORE
		
		//By using String s2, convert just "more"s to uppercase
		System.out.println(s2.substring(0,6) + s2.substring(6, 10).toUpperCase()+ 
				           s2.substring(10, 17)  +  s2.substring(17).toUpperCase());//Teach MORE learn MORE
		
		//16.Trim() bastaki ve sondaki bosluklari almak icin
		String s3 = "  Java is a programming language   ";
		System.out.println(s3);//"  Java is a programming language   "
		System.out.println(s3.trim());//"Java is a programming language"
		
		// Get  "is Ja" by using substring 
		// System.out.println(s1.subSequence(beginIndex, endIndex));
		

		
	}

}
