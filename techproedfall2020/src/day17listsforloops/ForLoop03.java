package day17listsforloops;

import java.util.Arrays;
import java.util.Scanner;

public class ForLoop03 {

	public static void main(String[] args) {

		/*
		 Ask user to enter a String and count the vowels(a,e,i,o,u) contained in the String
		 AliCan ==> The number of a = 2
		            The number of i = 1
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String to see number of vowels");
		String s = scan.nextLine().toLowerCase();
		

		String ch[] = s.split("");
		System.out.println(Arrays.toString(ch));
		
		int aCount = 0;
		int eCount = 0;
		int iCount = 0;
		int oCount = 0;
		int uCount = 0;
		int boslukCount =0; //bosluk sayiyor
		
		for(String w : ch) {
			switch(w) {
				case "a":
					aCount++;
					break;
				case "e":
					eCount++;
					break;
				case "i":
					iCount++;
					break;
				case "o":
					oCount++;
					break;
				case "u":
					uCount++;
					break;
				case " ":
					boslukCount++;
					break;
			}
		}
		System.out.println("The number of a " + aCount);
		System.out.println("The number of e " + eCount);
		System.out.println("The number of i " + iCount);
		System.out.println("The number of o " + oCount);
		System.out.println("The number of u " + uCount);
		System.out.println("The number of bosluk " + boslukCount);

		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a String to see number of vowels");
//		String s = scan.nextLine().toLowerCase();
//		
//		String ch1[] = s.split("");
//		System.out.println(Arrays.toString(ch1));
//		
//		int a =0;
//		int i= 0;
//		int o= 0;
//		int e=0;
//		int u=0;
//		
//		for(String w: ch1) {
//			switch(w) {
//			case "a":
//				a++;
//				break;			
//			case "i":
//				i++;
//				break;
//			case "o":
//				o++;
//				break;			
//			case "e":
//				e++;
//				break;					
//			case "u":
//				u++;
//				break;			
//			}
//			System.out.print(w + " ");
//		}
//		System.out.println();
//		
//		System.out.println("The number of a " + a);
//		System.out.println("The number of i " + i);
//		System.out.println("The number of o " + o);
//		System.out.println("The number of e " + e);
//		System.out.println("The number of u " + u);
		
		scan.close();
	}
}
