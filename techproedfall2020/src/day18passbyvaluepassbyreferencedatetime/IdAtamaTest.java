package day18passbyvaluepassbyreferencedatetime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IdAtamaTest {
	
	//systemden isimleri al ve yanlarina 
	//ALI1000, VELI1001 gibi id ekle
	
	static int num =1000;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<String> products = new ArrayList<>();
		
		int i=0;
		
		do {
			System.out.println("Enter " + (i+1) + ".productname");
			products.add(scan.nextLine());
			i++;
	
		} while(i<3);
		System.out.println(products);
		
		List<String> productId = new ArrayList<>();
		
		for(String w: products) {
			productId.add(""+ w.charAt(0) + w.charAt(1) + num);
			num++;
		}
		System.out.println(productId);
		scan.close();

	}

}
