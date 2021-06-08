package day17listsforloops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ForLoop02 {

	public static void main(String[] args) {

		/*
		 Ask user to enter 5 full nameS 
		 Get the initials of the first  and the last name, concatenate them and store them in a list
		Print on the console the list
		Example; if user enters "Ali Can", "Veli Han", "Kemal Mert" ==> [ AC, VH, KM]
		 */
		
		Scanner scan = new Scanner(System.in);
		

		//Created names list by getting names from the user
		List<String> names = new ArrayList<>();
		int i=0;
		do {
			System.out.println("Enter " + (i+1) +  ". full name");
//			String length = scan.nextLine();
//			names.add(length); ==> asagisa direkt kisa yol yaptik. scan.nextLine() i direkt icine yazdik.esitlemedik
			names.add(scan.nextLine());
			i++;
		}while(i<5);
		System.out.println(names);
		
		//How to get initials
		List<String> initials = new ArrayList<>(); //yeni bos bi array tanimliyoruz to store all elements
		
		for(String w : names) {
			initials.add("" + w.charAt(0) + w.charAt(w.indexOf(" ")+1));
		}
		System.out.println(initials);
		
		//Benim
//		List<String> name = new ArrayList<>();
//		int k =0;
//		
//		do{
//			System.out.println("Enter your " + (k+1) + " name");
//			String length = scan.nextLine();
//			name.add(length);
//			k++;
//		}while(k<3);
//		System.out.println(name);
//		
//		List<String> initiall = new ArrayList<>();
//		
//		for(String w: name) {
//			initiall.add("" + w.charAt(0) + w.charAt(w.indexOf(" ")+1));
//		}
//		
//		System.out.println(initiall);
		
		scan.close();

		
		
	}

}
