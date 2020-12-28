package javadevelopmentntDay01;

public class MultiThreading04 {

public static void main(String[] args) {
		
		Brackets bracket = new Brackets();//III object creation
		
		Thread thread1 = new Thread(new Runnable() {//IV to create tHREAD

			@Override
			public void run() {//V
				for(int i=1; i<=5; i++) {
					bracket.generateBrackets();	//BY USING bracket object
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


}
}
class Brackets{//I
	//VI
	synchronized public void generateBrackets() { //II==> METHOD is not static here, so we can create object
		for(int i=1; i<=10; i++) {
			if(i<=5) {
				System.out.print("[");
			}else {
				System.out.print("]");
			}
		}
		System.out.println();
		
	}
}
