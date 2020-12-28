package javadevelopmentdtDay04;

public class UnderstandDeadLock {

	public static void main(String[] args) {

				String lock1 = "lock1";
				String lock2 = "lock2";
				
				Thread thread1 = new Thread(new Runnable() {

					@Override
					public void run() {
						synchronized(lock1) {
							System.out.println("I am inside the thread1 and locked the lock1");
							synchronized(lock2) {
								System.out.println("I am inside the thread1 and locked the lock2");
							}
						}			
					}
					
				});
				thread1.start();
				
				Thread thread2 = new Thread(new Runnable() {

					@Override
					public void run() {
						synchronized(lock1) {
							System.out.println("I am inside the thread2 and locked the lock1");
							synchronized(lock2) {
								System.out.println("I am inside the thread2 and locked the lock2");
							}
						}			
					}
					
				});
				thread2.start();
				
				
				try {
					thread1.join();
					thread2.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("I completed the execution of threads...");

	}

}
