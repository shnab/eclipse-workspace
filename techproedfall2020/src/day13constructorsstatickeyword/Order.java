package day13constructorsstatickeyword;

public class Order {

		int age = 7;

		String name = "Dog";

		boolean mammal; 

		Order(){

			System.out.println("Good");

		}	

		Order(boolean mammal){

			this();

			System.out.println("Bad");		

		}	

	     public static void main(String[] args) {

			Order a1 = new Order(true);
			//a1 = new Order();

		}



}
