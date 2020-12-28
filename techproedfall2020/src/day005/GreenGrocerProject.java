package day005;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GreenGrocerProject {

	static List <String> productList = new ArrayList<>();
	static List<Double> productPrices = new ArrayList<>();
	static double totalAmount;
	
	public static void main(String[] args) {
		
		/*Write a basic green grocer shopping program
		 * First Steep: Ask to the user to choose product from productList and ask how many kilograms
		 * does he likes to buy
		 * 2. Step : Ask if he wants to any other product or not-- If he doesn't want 
		 * show total amount if he wants make him choose any product from the beginning
		 * Repeat this operation until he wants to finish the shopping.
		 * 3.Step: When customer chooses any product add the price of the product to total amount.
		 * 4. Step : Show the total amount when the shopping finishes.
		 * 
		 *  Create two methods named customerChoice() and cash()  
		 */

		productList.add("Tomato---- Product ID : 0" );
		productList.add("Pepper---- Product ID : 1" );
		productList.add("Apple---- Product ID : 2" );
		productList.add("Orange---- Product ID : 3" );
		productList.add("Comen--- Product ID : 4" );
		
		productPrices.add(5.0);
		productPrices.add(7.0);
		productPrices.add(3.5);
		productPrices.add(4.5);
		productPrices.add(3.0);
		
		System.out.println(productList.toString());
		System.out.println(productPrices.toString());
		customerChoice();

	}
	
	public static void customerChoice() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Which product would you like to choose?");
		int choice = scan.nextInt();
		if(choice>4 || choice <0) {
			System.out.println("Wrong choice");
		}
		else {
			System.out.println("How many kilos would you like to buy?");
			double kG = scan.nextDouble();
			double productPrice = productPrices.get(choice);
			double totalProductPrice = kG*productPrice;
			totalAmount+=totalProductPrice;
			System.out.println("Your product is " + productList.get(choice));
			System.out.println("Your price is " + productPrice);
			System.out.println("To go on shopping enter 1 and to go to cash enter 2");
			int decision = scan.nextInt();
			if (decision == 1) {
				customerChoice();
				
			}
			else {
				cash();
			}
					
		}
				
	}
	
	public static void cash () {
		System.out.println("Total Amount to pay " + totalAmount);
	}

}
