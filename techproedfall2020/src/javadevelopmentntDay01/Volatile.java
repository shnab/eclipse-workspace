package javadevelopmentntDay01;

		public class Volatile {
			
			/*
			 If the thread is running based on a variable, you have infinite loop risk. To prevent the risk
	 		you need to use "volatile" keyword for the variable before access modifier.
			 */
			
		volatile public static int age = 0;
			
		public static void main(String[] args) {
		
		Thread thread1 = new Thread(new Runnable() {


			@Override
			public void run() {
				while (true) {
					if(age==0) {
						System.out.println("thread1 is running");
					}else {
						break;
					}
				}
				
			}
			
		}); 
		thread1.start();

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				age =1;
				System.out.println("age is updated");
				
			}
			
		}); 
		thread2.start();
	}

}
