package day22inheritance;

public class Runner {

	public static void main(String[] args) {
		
		Honda h1 = new Honda(); // Vehicle with parameter
						// Car no-parameter
							    // Honda no-parameter
		System.out.println("=========");
		Honda h2 = new Honda("Civic"); // Vehicle with parameter
										// Car no-parameter
										// Honda with paratemeter

		System.out.println("=========");
		Car c1 = new Car();  //Vehicle with parameter
						  //Car no-parameter
		
		
		System.out.println("=========");
		
		Car c2 = new Car("Toyota"); //Vehicle with parameter
									// Car with parameter
		
		System.out.println("=========");
		
		Vehicle v1 = new Vehicle (111); //Vehicle with parameter
	}

}
