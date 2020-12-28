package day02scanner;

import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*
		 //byte < short < int < long < float < double (kucukten buyuge siralama)
		 */
		//how to convert data types to each other. 
		//byte is ook in the short

		//1. Auto Widening: If you convert small data to large ones there is nothing to do. Java will convert outomatically
		
		byte num01 = 12;
		short num02 = num01;
		
		//2. Expliciet Narrowing; If you convert large data type to small ones, its name is explicit Narrowing. Java doesn't do it. You have to do it manually by typing small data type inside te parenthesis. 
		int num03 = 14;
		byte num04 = (byte)num03; // num03 is int. basina byte yazilmali. Yoksa JAVA copleint. Byte value maybe is in the int or maybe not in the int
	
		 //1) Convert int to double
		 int num05 = 16;
		double num06 = num05;
		
		// 2)convert float to double
		float num07 = 13.05f;
		double num08 = num07;
		
		 //3)convert double to short
		double num09= 13.3;
		short num10 = (short)num09;
		
		// 4)convert int to short
		int num11 = 25;
		//short num12 = (short)num011;
		
		
		//in how many different ways, i can fix the following error?
		float num13 = 3.23f; // float num13 = 3.23f;
							// float num13 = (float)3.23;
							// double num13 = 3.23;

		//What is the result of the following? What dio youn see on the console?
		
		int a = 5;
		int b = 2;
		//if you divide int by int the result always will be integer
		// java cancels the decimal part and returns the whole part
		//java does not make round operation.
		//5/3==>1 or 5/4==>1
		System.out.println(a/b); //2. Aslinda 2.5 ama java 2 olarak kabul ediyor.
		
		//what do you see on the console?
		int c = 5;
		double d = 3;
		//if the data types are different the result will be in the large data type.
		System.out.println(c/d); //1.6666
		
		//what do you see on the console?
		System.out.println(5f/2); //2.5 (java float oarak kabul ediyor)
		
		System.out.println(5d/2d); // 2.5 when you put d at end of any number java will aceept it as double
		
	}

}
