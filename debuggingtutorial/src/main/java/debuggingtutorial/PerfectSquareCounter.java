package debuggingtutorial;

public class PerfectSquareCounter {
	
	/*
	 Create a method to count perfect square numbers from 1 to 100
	 4 is a perfect square because square root of 4 is integer
	 Perfect Squares: 1, 4, 9, 16, 25, ..., 100                             
	 */

	static int evenPerfectSquareCounter = 0;
	
	public static void main(String[] args) {
		
		System.out.println("Total Perfect Square numbers: " + calculateCount(100));
		System.out.println("Total Even Perfect Square numbers: " + evenPerfectSquareCounter);
		
	}
	
	public static int calculateCount(int number) {
		int perfectSquareCounter = 0;
		for(int i=1; i<=number; i++) {
			if(isPerfectSquare(i)) {
				perfectSquareCounter++;
					if(i%2==0) {
					++evenPerfectSquareCounter;
				}
			}
			
		}
		return perfectSquareCounter;
	}
	
	private static boolean isPerfectSquare(int number) {
		double sqrt = Math.sqrt(number);
		double result = Math.floor(sqrt);
		return sqrt - result==0;
		
	}
	}