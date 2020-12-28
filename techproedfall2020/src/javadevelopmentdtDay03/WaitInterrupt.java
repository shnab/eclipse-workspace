package javadevelopmentdtDay03;

public class WaitInterrupt {

	static public double balance = 0;

	public static void main(String[] args) {
			
			WaitInterrupt obj = new WaitInterrupt();
			
			Thread thread1 = new Thread(new Runnable() {

				@Override
				public void run() {
					obj.withdraw(800);
				}
				
			});
			thread1.setName("thread1");
			thread1.start();
			
			Thread thread2 = new Thread(new Runnable() {

				@Override
				public void run() {
					
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					obj.deposit(2000);
					thread1.interrupt();
					
				}
				
			});
			thread2.setName("thread2");
			thread2.start();

	}
		
		public void withdraw(double amount) {
			
			synchronized(this) {
				if(balance<=0 || balance<amount) {
				
					try {
						System.out.println("Waiting for the balance to be updated");
						wait();
					}catch(InterruptedException e) {
						System.out.println("Interrupted catch block is running...");
						balance = balance - amount;
						System.out.println("Withdrawal is successful.\nThe current balance is " + balance);
					}

				}
			}
			
			
		}
		
		public void deposit(double amount) {
			balance = balance + amount;
			System.out.println("The balance is updated.\nThe current balance is " + balance);
		}

}