package javadevelopmentntDay01;

public class MultiThreading06 {

	public static void main(String[] args) {

		Brackets3 bracket1 = new Brackets3();//III object creation
		Brackets3 bracket2 = new Brackets3();
		
		//more than 2 object usage, synchronized is not enough we must use also static 
		
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=1; i<=10; i++) {
					bracket1.generateBrackets("thread1");
				}
				System.out.println("thread1 is completed");
			}
			
		});
				thread1.start();
		
				Thread thread2 = new Thread(new Runnable() {

					@Override
					public void run() {
						for(int i=1; i<=10; i++) {
							bracket2.generateBrackets("thread2");	
						}		
						System.out.println("thread2 is completed");
					}
					
				});
				thread2.start();		

	}

}

class Brackets3{//I

	/*1)If you use different objects in different threads sometimes you may get different outputs in every execution.
	2)To solve that issue, we use static synchronization. The steps to apply static synchronization is;
	a)Type "synchronized static" before access modifier
	b)Create a parameter for the method
	c)When you call the method use arguments */
	
	synchronized public static void generateBrackets(String threadName) { //II==> METHOD is not static here, so we can create object
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if(i<=5) {
				System.out.print("[");
			}else {
				System.out.print("]");
			}
		}
		System.out.println("Thread executed: " + threadName );
		
	}
}