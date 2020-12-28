package day5;

	import java.util.Arrays;
	import java.util.Scanner;
	
	public class Question02 {
		/*
		Ask user to enter 5 names then assign them to an array
		eg:                
		String names = "john Marry william Brian Richard";
		Then print the names 1 by 1 on the console 
		String [] arrayNames = names.split(" ");
		get all names.length one by one
		
		*/
		
		public static void main(String[] args) {
			
			Scanner scan = new Scanner (System.in);
			System.out.println("Write your names with a space please ?");
			String str = scan.nextLine();
			
			String [] arrayNames = str.split(" ");
			System.out.println(Arrays.toString(arrayNames));
			
			for (int i = 0; i < arrayNames.length; i++) {
				System.out.println(arrayNames[i].length());
				
			}

	}

}
