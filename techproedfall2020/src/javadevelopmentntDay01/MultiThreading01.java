package javadevelopmentntDay01;

public class MultiThreading01 {
	
		//Corbayi beklerken salatayi yapabiliriz. dIGER islemleri beklemeye gerek yok.
	public static void main(String[] args) throws InterruptedException { //throws is coming from join()
			
			long startingTime01 = System.currentTimeMillis();//IV
			CounterWithoutMultiThread counter1 = new CounterWithoutMultiThread(1);//III
			CounterWithoutMultiThread counter2 = new CounterWithoutMultiThread(2);//III
			
			counter1.countMe();
			System.out.println("=======================");
			counter2.countMe();
			long endingTime01 = System.currentTimeMillis();//V
			System.out.println(endingTime01 - startingTime01);
			
			
			System.out.println("*******************************");//ALT taraf myltithread kullaniyor.
			
			long startingTime02 = System.currentTimeMillis();
			CounterWithMultiThread counter3 = new CounterWithMultiThread(1);//VI
			CounterWithMultiThread counter4 = new CounterWithMultiThread(2);//VI
			
			counter3.start();//VII==> These test run in the same tine
			System.out.println("================");
			counter4.start();//VII
			
			//Thread.sleep(5000); // ==> To make Java wait for printing the duration of execution sleep() can be used but it is not good
			                      //     practice. Instead of using sleep() we can use join() method.
			/*
			  If you do not put Thread.sleep(5000); Java will execute System.out.println("Duration With Thread: " + (endingTime01 - startingTime01));
			  before executing obj3.start(); and obj4.start(); and the duration time will not be true.
			  
			  To solve that problem you can use Thread.sleep(5000); but it is very difficult to find the appropriate time and even you find 
			  the appropriate time it can create problems in different computers and in different internet connections. 
			  Because of that using Thread.sleep(5000); cannot be solution. */
			
			
			counter3.join();//this is the solution of Thread.sleep()
			counter4.join(); //throws is coming from join()
			
			long endingTime02 = System.currentTimeMillis();
			System.out.println(endingTime02-startingTime02);
			
		}
		
}
class CounterWithoutMultiThread{//I
		
		private int threadNum;//II

		public CounterWithoutMultiThread(int threadNum) {
			this.threadNum = threadNum;
		}
		
		public void countMe() { //mETHOD II
			for(int i=1; i<=9; i++) {
				try {
					Thread.sleep(500);//sleep method needs always try -catch
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("i=" + i + " Thread Number:" + threadNum);
			}
		}
		
	}

	class CounterWithMultiThread extends Thread{//VI
		
		private int threadNum;
		
		public CounterWithMultiThread(int threadNum) {
			this.threadNum = threadNum;
		}
		
		public void countMe() {
			for(int i=1; i<=9; i++){
//				try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
				System.out.println("i= " + i + " Thread Number: " + threadNum );
			}
		}
		@Override
		public void run() {//VII
			countMe();
		}
		}

