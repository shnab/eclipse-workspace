package day16multidimensionalarrayslistsdt;

public class Test01 {

	public static void main(String[] args) {
		
		String input = "Hello Welcome to Techpro Education";
		String result1[] = input.split(" ");
		String result2 [] = input.split("x");//Array da  x olmadigi icin sonuc 1
		
		System.out.println(result1.length+ "- " + result2.length); //5 - 1

	}

}
