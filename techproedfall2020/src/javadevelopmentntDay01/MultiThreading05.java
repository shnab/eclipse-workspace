package javadevelopmentntDay01;

public class MultiThreading05 {

public static void main(String[] args) throws InterruptedException {
		
		long startingTime00 = System.currentTimeMillis();
		
		Brackets2 bracket = new Brackets2(); //II
		
		Thread thread1 = new Thread(new Runnable() { //III

			@Override
			public void run() {
				for(int i=1; i<=5; i++) {
					bracket.generateBrackets();	
				}
			}
			
		});
		thread1.start();
		
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=1; i<=5; i++) {
					bracket.generateBrackets();	
				}		
			}
			
		});
		thread2.start();
		
		thread1.join();
		thread2.join();
		
		long endingTime00 = System.currentTimeMillis();
		//System.out.println("Duration of synchronized: " + (endingTime00 - startingTime00));// ==> 3333
		System.out.println("Duration of synchronized block: " + (endingTime00 - startingTime00));// ==> 1653

}

}
class Brackets2{ //I
	
	public void generateBrackets() {//No need to  synchronized keyword before the method.
		
		synchronized(this) {//IV==> That part  must be synchronized
			for(int i=1; i<=10; i++) {
				if(i<=5) {
					System.out.print("[");
				}else {
					System.out.print("]");
				}
			}
			System.out.println();
		}

		for(int i=0; i<=5; i++) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
