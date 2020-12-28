package Day02;

public class SecondQuestion {

	public static void main(String[] args) {


		/*
		ForLoop
		print even numbers from 100 to 0 but do not use decrement(i--).

		ORNEK:

		     INPUT      : 
		     OUTPUT  : 100 98 96 94 92 …….2 0
      */
		
		int num = 100;
		
		for(int i=num; i>=0; i=i-2) {
			
			System.out.print(i + " ");

	}

}
}
