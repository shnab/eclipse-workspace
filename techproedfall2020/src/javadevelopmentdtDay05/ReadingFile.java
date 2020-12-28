package javadevelopmentdtDay05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFile {

	public static void main(String[] args) {
		
		/*
		 Scanner 1)Not multi-threading
		 	`	`2) Not synchronized
		 		 3) Slow 
		 		 4)Can be used for small data till 1 KB
		BufferedReader 	1) Multi-threading
		 	`	`		2) Synchronized
		 		 		3) Fast 
		 		 		4)Can be used for larger data till 8 KB		 
		 		 
		 */
		
		// 1.Way to read the file...
//		try(BufferedReader br  = new BufferedReader(new FileReader("FileToWrite.txt"))) {
//			
//			String line;
//			
//			while ((line = br.readLine())!=null) {//if there is something to read, go on
//				System.out.println(line);
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		// 2.Way to read the file...
//		try(Scanner scan = new Scanner(new File("FileToWrite.txt"))) {
//			String line;
//			
//			while (scan.hasNext()) {//Iterator==>hasNext
//				
//				line= scan.nextLine();
//				System.out.println(line);
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		
		//not recommended
		// 3.Way to read the file...
		try(FileInputStream fis = new FileInputStream("FileToWrite.txt")) {
		
		int k;
		while ((k=fis.read()) != -1) {
			System.out.print((char)k); // burada aslen sayi (int) olarak ASCII table degeeri aliniyor ama char sayesinde harf olrak aliniyor.
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
		
	}

}
