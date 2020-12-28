package day5;

import java.util.ArrayList;

public class Question04 {

	public static void main(String[] args) {

		//  Write a program to convert ArrayList to array
		// "Python", "JAVA", "PHP", "Perl", "C#", "C++"

		//Write a program to convert Arraylist to array
				//"Python", "JAVA", "PHP",  "Perl", "C#", "C++"
				
				ArrayList <String> list = new ArrayList<String>();
				
				list.add("Python");
				list.add("JAVA");
				list.add("PHP");
				list.add("Perl");
				list.add("C#");
				list.add("C++");
				
				String [] arr = new String [list.size()];
				list.toArray(arr);
				for (String w : arr) {
					System.out.print(w + " ");
					
				}
	}

}
