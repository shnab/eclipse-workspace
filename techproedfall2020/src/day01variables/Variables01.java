package day01variables;

public class Variables01 {

	public static void main(String[] args) {
		/*
		 Variable is the name of reserved area in memory
		To create a variable you need to type 1)Data type 2)Variable name 3)Semi colon 
		
		a)int stands for integer
		b)After creating a variable is you put a value for it, we will tell 
		we "assigned a value" or we will tell "initialized the variable"

		*/
		int age = 23;
		
		//Create a variable whose name is weight and value is 83
		int weight = 83;
		
		//Create a String variable whose name will be first name
		//de value will be your own first name
		String firstName = "Daulet";
		
		//Typing codes short is very important in coding area
//		int height = 11;
//		int length = 12;
	//	int money = 13;
	//	int salary =14;
		
		int height = 11, length = 12, money = 13, salary = 14;
		
		/*
		 Data Types: There are 2 main data types 1)Primitive Data Types
		 										 2) Non-Primitive Data Types
		 Primitive Data Types: a) boolean: It is used for just "true" and "false" options
										   boolean retired = true; (He is retired)
										   booean data types use just 1 bit in memory
										   
		 					   b) char: It is used just for single characters A, c, 1, (single characters)
		 					            ?, !, (7) (niet possible meer dan een characters)
		 					            When you use char as data type, you have to put 
		 					            value bwetween single quotes ''
		 					            DO NOT FORGET; SPACE is character
		 					            char initial = 'A';
		 					            char number = '3';
		 					            char num = '2'; (no space, in java space is a character)
		 					            char num2 = ' '; (space is a character)
		 					            char cab be used between the single quotes you will get error
		 					            Every char variable uses 16 bits /2 bytes in memory
		 					   c)byte: it is used for de values from 
		 					   			-128 (inclusive) to 127 (inclusive) 
		 					   			byte age = 72; 
		 					   			byte length = 12;
		 					   			byte debt = -100;
		 					   			byte uses 8 bits from memory 
		 					   d)short: It is used for the integers from -32768 to 32767 (inclusive)
		 					   			short population = 23000; (for example for a village)
		 					   			short uses 16 bits from memory
		 					   e)int; It is used from -2,147, 483, 648 to  2,147, 483, 647
		 					   		  it uses 32 bits for every integer variable.
		 					   f)long: It is used from -9,223, 372, 036, 854, 755, 808 to ...807
		 					    	  it uses 64 bits from memory
		 					   g)float: it is used for decimal numbers. it uses 32 bits. 
		 					   		If you want to use float, you have to put 'f' or 'F' at the end of the number
		 					   		float num = 3.2f; (or F)
		 					   		For floats after the comma (in decimal part) you can use 7 digits at most.
		 					   		float num2 = 1.1234567f;
		 					   h)double: It is used for decimal numbers It uses 64 bits. 
		 					   	     double salary = 2345.43;
		 					   	     in decimal part you can use 16 digits at most (money meestal)
		Non-Primitive DAta Types: String is a non-primitive data type. it is used for words, sentence, 
		parapraghs, or single or multiple characters which which are put
		String name = "Ali";
		String sentence = "Ali went to the school"
		String initial = "A";(for single characters kunnen wij ook char gebruiken)
		Stirng num = "12"; (numaralar icinde kullanilabiliyor)		 					
		String str = " "; it is okay 
		String str2 = ""; it is okay
		
		What is difference between "primitive" and "non-primitive" data types?
		1) Primitive data types names can be typed by using lower cases but the initial of the non-primitive data types must be uppercase
		2)Primitive data types uses different amount of memory but all non-pritimitive data types use same amount of memory
		3)Primitive data types are created by Java, we cannot create a new pritimitive data types. We can create new non-primitive data types
		4)In primitive data types we have just values but for non-primitive ones we have value and method inside the reserved area
		5) primitive data types are stored in "Stack" memory and non-primitive data types are stored in "Heap" memory. 
		(to find it esaier java use stack memory for adress (reference) of non-primitive.
		cunku HEAP cok buyuk. Non orada kaybolur. 
		
		What is the difference between Stack en Heap
		1. stack is small, Heap is Huge.
		2. Stack can store a) Primitive data types  b) Adress (Reference) of the non-primitive data types 
		   Heap can store just non-Primitive types
		
		Print almak icin syso yaz sonra ctrl+space yap. O zaman double quotes kullanmak gerekmkiyor.
		 
		 */
		
		char num3 = ' ';
		char ch = 'a';
		String name = "Ali";
		String fullName = "Hasan";
		System.out.println("Java is easy");
		
		System.out.println("Abbas");
		
		System.out.println("The Germany");
		System.out.println("I am so tired");
		System.out.println(ch);// To type the value of a variable on the console, just put its name 
								//inside the paranthesis. 
		
		System.out.println(name);
		System.out.println(fullName);
		
		
		
		float num = 3.2f;
		
	}
}
