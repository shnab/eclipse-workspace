package day03ifstatementnt;

public class Concatenation {

	public static void main(String[] args) {
		
		/*
		 Concatenation: It joins two or more Strings
		*/
		
		String s = "Java";
		String t = "is easy";
		System.out.println(s + " " + t);//Java is easy
		
		
		int a = 2;
		int b = 3;
		String c = "A";
		System.out.println(c + a + b);
		System.out.println(c + (a + b));
		System.out.println(a + c + b);
		System.out.println(a + b + c);
		
		int d = 2;
		int e = 3;
		String f = "Java";
		//By using d, e, and f, print 61Java-1 on the console
      System.out.println((d*e) + ((e-d) + f) + (d-e));//61Java-1
		
      
		/*
		 To join two or more Strings we use Concatenation operation
		*/
		
		String s1 = "Java";
		String s2 = "is easy";
		System.out.println(s1 + " " + s2);//Java is easy
		
		String s3 = "2";
		int i1 = 3;
		int i2 = 4;
		
		System.out.println(s3 + i1 + i2);
		System.out.println(s3 + (i1 + i2));
		System.out.println(i1 + i2 + s3);
		
		int numA = 2;
		int numB = 3;
		String str1 = "Study";
		
		//Print 5 Study
		System.out.println(numA + numB + " " + str1);
		
		//Print 61 Study-1
		System.out.println((numA*numB) + "" + (numB - numA) + " " + str1 + (numA - numB));//61 Study-1
		
		//You can use comparison operators for all primitive data types.
		//Everytime, you get boolean results from comparison operators
		System.out.println(5 == 2+3);//true
		System.out.println(5 < 2+3);//false
		System.out.println(5 <= 2+3);//true
		System.out.println(5 > 2+3);//false
		System.out.println(5 >= 2+3);//true
		System.out.println(5 != 2+3);//false
		
		System.out.println('a' == 'A');//false
		System.out.println('a' > 'A');//true
		
		System.out.println(true == true);//true
		System.out.println(true == false);//false
		
		System.out.println((d*e)+ ((e-d)+f) +(d-e));
		

		}
	
	

}
