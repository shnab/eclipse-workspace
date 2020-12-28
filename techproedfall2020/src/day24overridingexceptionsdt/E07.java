package day24overridingexceptionsdt;

public class E07 {

		/*
		 IllegalArgumentException is used for illegal arguments. It is unchecked(RunTimeException) Exception.
		 According to your method you can throw Illegal Argument Exception in any method, any where 
		 and any times.
		 */
		
		public static void main(String[] args) {
			
			printAge(-23);
	}
		
		public static void printAge(int age) {
			
			if(age < 0) {
				
				throw new IllegalArgumentException("Age cannot be negative");
				
			}else{
				
				System.out.println(age);
				
			}

	}

}
