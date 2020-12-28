package day22inheritance;

public class Honda extends Car {
	
	public boolean gas = true;
	
	public Honda() {
		System.out.println("Honda no-parameter");
	}
	
	public Honda(String model) {
		System.out.println("Honda with paratemeter");
	}

}
