package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Question01 {

	public static void main(String[] args) {

		List<String> list2 = new ArrayList<>();
		list2.add("ALI");
		list2.add("veli");
		list2.add("Ayse");
		list2.add("fatma");
		System.out.println(list2);

		//Change the elements PERMANENTLY with for-each loop. Lets do all names uppercase
		//You need to use iterator for changing collections permanently		
		for(String w : list2) {
            
            list2.set(list2.indexOf(w), list2.get(list2.indexOf(w)).toUpperCase());
        }
		
		System.out.println("");
		System.out.println(list2);
		
		//Change the elements permanently with for loop. Let's do all names lowercase
		
		for (int i=0; i<list2.size(); i++) {
            list2.set(i, list2.get(i).toLowerCase());
        }
        System.out.println(list2); //[ali, veli, ayse, fatma]
        
      //Change the elements permanently with iterator. Uppercase
        
        ListIterator<String> it1 = list2.listIterator();
        while(it1.hasNext()) {
            String el = it1.next();
            it1.set(el=el.toUpperCase());// [ALI, VELI, AYSE, FATMA]
            System.out.print(el+" ");
            
        }
        System.out.println();
        System.out.println("after iterator" + list2);// [ALI, VELI, AYSE, FATMA]

	}

}
