package javadevelopmentdtDay03;

import java.util.concurrent.CountDownLatch;

public class Latch {

	/*
	   1) If you want to execute all threads before everything inside the main method, you need
	      to use "latch".
	   2) To use latch, you need to create "CountDownLatch" object 
	   3) After starting all threads do not forget to use "latch.await();"  
	*/

	public static void main(String[] args) {
		
		CountDownLatch latch = new CountDownLatch(6);
		
		ThreadCreator1 thread1 = new ThreadCreator1(latch);
		ThreadCreator1 thread2 = new ThreadCreator1(latch);
		ThreadCreator1 thread3 = new ThreadCreator1(latch);
		ThreadCreator1 thread4 = new ThreadCreator1(latch);
		ThreadCreator1 thread5 = new ThreadCreator1(latch);
		ThreadCreator1 thread6 = new ThreadCreator1(latch);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
		
		try {
			latch.await();
		} catch (InterruptedException e) {
			System.out.println("Waiting for the latch to interrupt...");
		}
		
		System.out.println("All threads finished, now it is my turn");
		}

}

class ThreadCreator1 extends Thread{
	
	private CountDownLatch latch;

	public ThreadCreator1(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		
		System.out.println("Thread is running " + Thread.currentThread().getName());
		System.out.println("Thread execution is completed " + Thread.currentThread().getName());
		System.out.println("===================================");
		
		latch.countDown();
	}
}


//	public static void main(String[] args) {
//			
//			CountDownLatch latch = new CountDownLatch(4);
//			
//			ThreadCreator2 thread1 = new ThreadCreator2(latch);
//			ThreadCreator2 thread2 = new ThreadCreator2(latch);
//			ThreadCreator2 thread3 = new ThreadCreator2(latch);
//			ThreadCreator2 thread4 = new ThreadCreator2(latch);
//			
//			thread1.start();
//			thread2.start();
//			thread3.start();
//			thread4.start();
//			
//			try {
//				latch.await();//await() makes the codes different from threads wait for the threads
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			
//			System.out.println("First code inside the main method");
//			System.out.println("Second code inside the main method");
//			
//			
//			
//		}
//
//}
//
//
//	class ThreadCreator2 extends Thread{
//		
//		private CountDownLatch latch;
//
//		public ThreadCreator2(CountDownLatch latch) {
//			this.latch = latch;
//		}
//
//		@Override
//		public void run() {
//			System.out.println(Thread.currentThread().getName() + " thread is running");
//			System.out.println(Thread.currentThread().getName() + " thread execution stopped");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			latch.countDown();
//			
//		}
//	}
