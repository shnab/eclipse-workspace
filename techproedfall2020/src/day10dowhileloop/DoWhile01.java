package day10dowhileloop;

public class DoWhile01 {

	public static void main(String[] args) {

		int i = 1;
		
		//While Loop : in the while loop condition is checked first then if the condiition is true 
		// loop body run, if the condition is false loop body does not run. 
		// when you use while loop it is possible to make the loop body not to run.
		while(i>1) {
			
			System.out.println("While Loop");//nothing 
		i--;

		}
		
		//do -While Loop : in the do-while loop, loop body runs first then condition is checked. 
		// because of that in do while loop, loop body runs at least once.
		do {
			System.out.println("do-while Loop");
			i--;
		} while(i>1);
		
		
	}

}
