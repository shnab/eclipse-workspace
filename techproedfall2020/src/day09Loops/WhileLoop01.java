package day09Loops;

public class WhileLoop01 {

	public static void main(String[] args) {
		
		
	// print the integers from 5 to 11 on the console in the same line with a space between two numbers
		
		
		for(int i=5; i<=11; i++) {
			System.out.print(i + " ");
		}
				
		System.out.println();
		
		int i=5;
		while(i<=11) {
			System.out.print(i + " ");
			i++;
		}
	}

}
