package javadevelopmentntDay01;

public class MultiThreading02 {

	public static void main(String[] args) throws InterruptedException {
		
		long startingTime00 = System.currentTimeMillis();//IV
		Thread thread1 = new Thread(new CounterMultiThread(1));
		Thread thread2 = new Thread(new CounterMultiThread(2));
		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();
		
		long endingTime00 = System.currentTimeMillis();//V
		System.out.println("Duration of thread1 and thread2: " + (endingTime00 - startingTime00));

		
		//tghe following syntax is used more to achieve multi-threading
		long startingTime01 = System.currentTimeMillis();//IV
		Thread thread3 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=1; i<=9; i++) {
					System.out.println("i=" + i + " Thread Number: 3" );
				}
			}
			
		});
		thread3.start();
		
		Thread thread4 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=1; i<=9; i++) {
					System.out.println("i=" + i + " Thread Number: 4" );
				}
			}
			
		});
		thread4.start();
		
		thread3.join();
		thread4.join();
		
		long endingTime01 = System.currentTimeMillis();//V
		System.out.println("Duration of thread3 and thread4: " + (endingTime01 - startingTime01));
	}

}

class CounterMultiThread implements Runnable {//I
	
	private int threadNumber;//II
	
	public CounterMultiThread(int threadNumber) {
		this.threadNumber = threadNumber;
	}


	@Override
	public void run() {
			
		for(int i=1; i<=9; i++) {
			System.out.println("i=" + i + " Thread Number:" + threadNumber);
				
		}
	}
	
}