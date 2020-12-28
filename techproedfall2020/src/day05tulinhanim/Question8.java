package day05tulinhanim;

public class Question8 {

	public static void main(String[] args) {

		int x =5;
		while(isAvailable(x)) {
			System.out.println(x);   //5 4
			//System.out.println(--x); //4 3
			x--;
		}
		}
	
	public static boolean isAvailable (int y) {  // 5  
    return y-- > 0 ? true: false;  //4 

	}

}
