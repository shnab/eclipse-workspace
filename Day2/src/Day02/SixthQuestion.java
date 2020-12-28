package Day02;

import java.util.Scanner;

public class SixthQuestion {

	public static void main(String[] args) {

/*
 String Methods:
 ask user to enter an e-mail address
then if it contains "hotmail" replace it with "gmail“
 otherwise don`t change.
EXAMPLE:
    INPUT     : firstandlastlame@hotmail.com
    OUTPUT : firstandlastlame@gmail.com
 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Write your e-mail adress");
		String email= scan.nextLine();
		
		if(email.contains("hotmail")) {
			email = email.replace("hotmail", "gmail");
			System.out.println(email);
			} else {
				System.out.println(email);
			}
	}

}
