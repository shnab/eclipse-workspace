package day03tulinhanim;

public class Question14 {

	public static void main(String[] args) {

		System.out.println("a");   //a
		try {
			System.out.println("b");  //b
			String c ="abc";
			System.out.println(c.charAt(3));  
			System.out.println("c");
		} catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
			System.out.println("d");
			
			System.out.println(e.getClass());
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("e");   
			System.out.println(e.getClass());
			
		}finally {
			System.out.println("f");  //f
		}
		System.out.println("g");    //g 

	}

}
