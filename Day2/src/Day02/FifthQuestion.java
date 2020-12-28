package Day02;

import java.util.Scanner;

public class FifthQuestion {

	public static void main(String[] args) {


	/*
	 	 Ternary
		    Write a code using ternary:
		    Create int variable : price
		    Create string variable : decision
		    If the price = $10 Print “cheap”
		    If price is 10-$20 print “ok” 
		    Otherwise “expensive”.
		    
		   EXAMPLE:
		     INPUT      : price= 12                
		     OUTPUT  : ok
		     INPUT      : price= 10                
		     OUTPUT  : cheap
		     INPUT      : price= 23                
		     OUTPUT  : expensive
				 */

				Scanner scan = new Scanner(System.in);
				
				System.out.println("Write a price");
				
				int price = scan.nextInt();
				
			String decision = price <= 10 ? "cheap" : price >10 && price <=20 ? "ok" : "expensive";

			System.out.println(decision);
			}
	}

