package javadevelopmentdtDay04;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//int ticketsAvailable =1;//Variable ==> bu burada olsa static yapardik. Ama asgida yazdigimiz icin gerekmedi

public class ReentrantLock01 {

	public static void main(String[] args) {

		Lock lock = new ReentrantLock();
		MyRunnable myRunnable = new MyRunnable(lock); //object
		
		Thread thread1 = new Thread (myRunnable, "Passenger-1");//Constructor
		//thread1.setName("Passenger1");//bu yukaridaki ile ayni 
		thread1.start();
		
		Thread thread2 = new Thread (myRunnable, "Passenger-2");//Constructor
		//thread1.setName("Passenger1");//bu yukaridaki ile ayni 
		thread2.start();
		
		Thread thread3 = new Thread (myRunnable, "Passenger-3");//Constructor
		thread3.start();
	}

}

class MyRunnable implements Runnable {

	int ticketsAvailable =2;//Variable
	Lock lock;//Lock is interface we can not create obj by using Lock
				// If it is possible use sencronized
	
	
	public MyRunnable(Lock lock) {//Consructor
		this.lock = lock;
	}


	@Override
	public void run() {//Run method
	
			System.out.println(Thread.currentThread().getName() + " is waiting to book the ticket");
			lock.lock();//im locking the process
			
			if(ticketsAvailable>0) {
				
				System.out.println(Thread.currentThread().getName() + " is booking the ticket");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				ticketsAvailable--;
				System.out.println(Thread.currentThread().getName() + " booked the ticket"); //process is completed
				System.out.println("Number of available ticket is " + ticketsAvailable);
			} else {
				System.out.println(Thread.currentThread().getName() + " could not book the ticket");
			}
			lock.unlock();//after process completing, we are unlock. second thread will run
	}
	
}
