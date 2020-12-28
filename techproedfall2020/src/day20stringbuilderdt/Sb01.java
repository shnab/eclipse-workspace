package day20stringbuilderdt;

public class Sb01 {
	
	/*
	 1) String class is immutable, sometimes we need to mutable Strings, 
	 but String class cannot provide mutable String. 
	 Because of that Java created another class which is named "StringBuilder"
	 when you create a String by using StringBuilder it will be mutable.
	 2) StrigBuilder does'nt have "synchronization" feature. 
	 To be able to synchronization Java uses "StringBuffer" class.
	 StrigBuilder en StringBuffer have almost same method. The difference is in scynchronization and speed. 
	 StringBuilder than faster StringBuffer. 
	 */

	public static void main(String[] args) {


		String str1 = "Java"; 
		// buraya java X EKLEMEK istiyoruz ama Java izin vermiyor. Assign olsa olur.
		// str1 = concat(str1); bu assign anlamina geliyor. O zaman JAVAX sonucu alinirdi. 
		concat(str1);
		//Java uses pass by value and Strings are immutable, because of that e get "Java" as output
		System.out.println(str1); //Java 
		
		// How to create StringBuilder
		//1. way
		StringBuilder sb1 = new StringBuilder(); // You created an empty String
		System.out.println(sb1.capacity()); //16. if empty is, 16 capacity kullanilir

		
		// how to add String to a StringBuilder
		sb1.append("Animal");
		System.out.println(sb1); // Animal
		System.out.println("Before Trim " + sb1.capacity()); //16
		sb1.trimToSize(); // if empty is, 16 capacity kullanilir. Trim remove the unused reserved area
		System.out.println("After Trim " + sb1.capacity()); //16
		
	
		
		sb1.append("X");
		System.out.println(sb1); //AnimalX
		sb1.append("Y").append("ZZZZZZZZZZZZZZZZZZZZZZZZZZ");
		System.out.println(sb1); // AnimalXYZ
		System.out.println(sb1.capacity()); // 34 ==> 16 * 2 + 2 = 34
		
		//2. way
		StringBuilder sb2 = new StringBuilder(10); // You want to create a StringBuilder, 
												   // its "capacity" will be 10 characters
		sb2.append("People");
		System.out.println(sb2); //People
		sb2.append("XYZTU");
		System.out.println(sb2); //PeopleXYZTU
		
		
		// 3. way
		StringBuilder sb3 = new StringBuilder("Learn Java"); // if you are sure about the String content 
															// use 3. way
		sb3.append("X"); //Learn JavaX
		System.out.println(sb3); //Learn Java
		
		// HOW can i get the number of charaters in a StringBuilder
		StringBuilder sb4 = new StringBuilder("Sleep less, life is short");
		
		//1. way
		sb4.trimToSize(); // before capacity,  trim methodu kullanmak
		System.out.println(sb4.capacity()); // 25
		
		//2. way ==>recommended
		System.out.println(sb4.length()); //25
		
		//How to delete multiple characters from a StringBuilder 
		// Starting index is inclusieve, ending index is exclusive
		sb4.delete(10, sb4.length());
		System.out.println(sb4); //Sleep less
		
		
		// How to delete a character at a specific index
		sb4.deleteCharAt(sb4.length()-1);
		System.out.println(sb4); //Sleep les
		
		// How to get a part if StringBuilder
		System.out.println(sb4.substring(0, 5)); //Sleep. Bu farkli. Guncellenme olmadigi icn
		System.out.println(sb4); //Sleep les
		
		//How to get index of a specific character
		System.out.println(sb4.indexOf("p")); //4
		System.out.println(sb4.indexOf("e")); //2 // first (e) baz aliniyor.
		System.out.println(sb4.indexOf("ep")); //3 // burada e baz aliniyor.
		
		//How to get a character at  specified index
		System.out.println(sb4.charAt(0)); // S
		
		//How to add characters to a specified index
		sb4.insert(5,  "X").insert(sb4.length()-1, "s");
		System.out.println(sb4); // SleepX less
		
		//How to reverse String (Tersine cevirme)
		sb4.reverse();
		System.out.println(sb4); // ssel XpeelS
		
		//How to convert StringBuilder to String // sonuna . (nokta) koyunca cevirdigi anlasilabiliyor
		//ToString () is returning String because if that it cannot update the StringBuilder. I
		//If you want to use StringBuilder as a String use method chain.
		sb4.toString();
		
		
	}
	
	public static String concat(String str) {
		return str + "X";
		
		

	}

}
