package day24overridingexceptionsdt;

import java.io.FileInputStream;
import java.io.IOException;

public class E01 {

	public static void main(String[] args) throws IOException {
			
			FileInputStream fis = new FileInputStream("src/day25exceptions/TextFile");
			
			int k;
			
			while((k = fis.read()) != -1) {
				System.out.print((char)k);
			}
			
			fis.close();


	}

}
