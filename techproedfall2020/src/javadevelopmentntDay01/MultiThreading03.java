package javadevelopmentntDay01;

public class MultiThreading03 {
		
		public static int counter = 0;//I==> if you use single data you must use synchronized method

			public static void main(String[] args) {
			
			Thread thread1 = new Thread(new Runnable() {//III

				@Override
				public void run() {
					Counter.count();
					System.out.println("thread1 is completed...");
				}
				
			});
			thread1.start();
			
			Thread thread2 = new Thread(new Runnable() {//III

				@Override
				public void run() {
					Counter.count();
					System.out.println("thread2 is completed...");
				}
				
			});
			thread2.start();
			
		}

}

	class Counter{//II
		/*
		  If you use a single data for different threads, you have to synchronize the method, otherwise 
		  you will get different outputs in every execution.
		  
		  To synchronize a method just using "synchronized" keyword before the access modifier is enough
		 */

		synchronized public static void count() { //IV==>synchronized
			for(int i=1; i<=1000; i++) {
				MultiThreading03.counter++;
			}
			System.out.println("Counter: " + MultiThreading03.counter);
		}
		}
