package day02scanner;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		/*
		 In every application, we need to communicate with the user
		 To communicatie with the user we use scanner Class.
		 First Scanner altina tikla, bekle, sonra import sec
		 */
		//1.Step
		Scanner scan = new Scanner(System.in);
		
		//With red underline there is close probleem like library. No problem.
		
		//2.Step. It ask you room name. I have to some direction
		System.out.println("Enter your age");
		
		//3. Step. User wil give me a number. Into a reserved area in memory. after all kod scan.close(); yaz.
		int age = scan.nextInt();
		System.out.println(age);
		
		scan.close(); //Kodu yazdiktan sonra Unutma bunu yazmayi
		
		
		
		
	}

}
