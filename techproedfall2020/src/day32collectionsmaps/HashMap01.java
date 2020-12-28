package day32collectionsmaps;

import java.util.HashMap;

public class HashMap01 {
	
	/*
	 1) Maps use { } ==> curli braces
	 2) All element of Maps are in key-value structure
	 3) Keys must be unique
	 4) Values can be repeated
	 */

	/*
	 1)HashMap is the fastest map 
	 2)HashMap does not put the elements in any order. Elemeent are in random order
	 3) If you use same key to put a new elemeent, it overwrites
	 4) You can use just one "null" as key
	 5) You can use multiple "null" for values
	 6) HashMAP is not sencronized and not thread-safe (yani iki islem ayni anda calismiyor.)
	 */
	
	public static void main(String[] args) {
		
		//<> this is diamond
		HashMap<Integer, String> hm1 = new HashMap<>(); // This is HashMap object
		
		hm1.put(101,"Milk");
		hm1.put(102,"Cheese");
		hm1.put(103,"Meat");
		hm1.put(100,"Butter");
		hm1.put(107,"Honey");
		hm1.put(108,"Pastirami");
		System.out.println(hm1); //{100=Butter, 101=Milk, 102=Cheese, 103=Meat, 107=Honey, 108=Pastirami}
		
		hm1.put(101, "Orange");
		System.out.println(hm1); //{100=Butter, 101=Orange, 102=Cheese, 103=Meat, 107=Honey, 108=Pastirami}
		
		hm1.put(110, "Butter");
		System.out.println(hm1); // {100=Butter, 101=Orange, 102=Cheese, 103=Meat, 107=Honey, 108=Pastirami, 109=Butter}
	
		hm1.put(null, "Nothing");
		System.out.println(hm1); //{null=Nothing, 100=Butter, 101=Orange, 102=Cheese, 103=Meat, 107=Honey, 108=Pastirami, 109=Butter}
	
		hm1.put(111, null);
		hm1.put(112, null);
		System.out.println(hm1); //{null=Nothing, 112=null, 100=Butter, 101=Orange, 102=Cheese, 103=Meat, 107=Honey, 108=Pastirami, 109=Butter, 111=null}
	
		// get method
		System.out.println(hm1.get(101)); //Orange
		System.out.println(hm1.get(200)); //null
		
		//getOrDefault()
		/*
		 i want to get value if the key exists
		 i want to get a message if the key does not exist
		 */
		System.out.println(hm1.getOrDefault(200, "The product you are looking for doesnt exist"));//The product you are looking for doesnt exist
		System.out.println(hm1.getOrDefault(101,"The product you are looking for doesnt exist")); //Orange
	
		// values () 
		System.out.println(hm1.values()); // [Nothing, null, Butter, Orange, Cheese, Meat, Honey, Pastirami, Butter, null]

		//keySet()
		System.out.println(hm1.keySet()); //[null, 112, 100, 101, 102, 103, 107, 108, 109, 111]
	
		//containsValue
		System.out.println(hm1.containsValue("Orange")); //True
		
		//containsKey
		System.out.println(hm1.containsKey(200)); //false
		
		//putIfAbsent ==> eger yoksa ekliyor
		hm1.putIfAbsent(200,"AAA");
		System.out.println(hm1);  //{null=Nothing, 112=null, 100=Butter, 101=Orange, 102=Cheese, 103=Meat, 200=AAA, 107=Honey, 108=Pastirami, 109=Butter, 111=null}
		hm1.putIfAbsent(100, "ZZZ"); // 100 oldugu icin bu eklenmedi
		System.out.println(hm1); //{null=Nothing, 112=null, 100=Butter, 101=Orange, 102=Cheese, 103=Meat, 200=AAA, 107=Honey, 108=Pastirami, 109=Butter, 111=null}

		// remove ()
		System.out.println(hm1.remove(107));//honey
		System.out.println(hm1); //107=Honey is verwijderd
		
		System.out.println(hm1.remove(102, "Cheese")); //True
		System.out.println(hm1); //{null=Nothing, 112=null, 100=Butter, 101=Orange, 103=Meat, 200=AAA, 108=Pastirami, 109=Butter, 111=null}

		//replace
		hm1.replace(103, "Olive");//103=Olive is added
		System.out.println(hm1); // {null=Nothing, 112=null, 100=Butter, 101=Orange, 103=Olive, 200=AAA, 108=Pastirami, 109=Butter, 111=null}
		System.out.println(hm1.replace(211, "YYY")); //null olmadigi icin doing nothing
		System.out.println(hm1);
		/*
		 Instead of replace() method do not use put () metthod. Because put() method adds new eleement
		 if the key does not exist.
		 But replace() does not add anything if the key does not exist.
		 */
	
		hm1.replace(110, "Butter", "Jam"); 
		System.out.println(hm1); //110=Jam is added
		
		
		//put All
		HashMap<Integer, String > hm2 = new HashMap<>();
		hm2.put(301, "A");
		hm2.put(302, "B");
		
		hm1.putAll(hm2);
		System.out.println(hm1); //{null=Nothing, 112=null, 100=Butter, 101=Orange, 103=Olive, 200=AAA, 108=Pastirami, 301=A, 110=Jam, 302=B, 111=null}

		
		
		
		
		
		
	} 

}
