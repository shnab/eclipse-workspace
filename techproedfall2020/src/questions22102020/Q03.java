package questions22102020;

public class Q03 {

	public static void main(String[] args) {


		int x = 8;
		int y = 6;
		
		int z = (x-=y) + (y+=x);
		
		System.out.println(z); 
	}

}
