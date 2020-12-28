package day13constructorsstatickeyword;

public class Animal {

		int age = 7;

		String name = "Dog";

		boolean mammal; 

		Animal(){

			System.out.println("Good");

		}	

		Animal(boolean mammal){

			this();

			System.out.println("Bad");		

		}	

	     public static void main(String[] args) {

			Animal a1 = new Animal(true);

		}

	}

	}

}
