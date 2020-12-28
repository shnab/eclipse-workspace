package day24overridingexceptionsdt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class E02 {
	
	public static void main(String[] args) {
		/*
		 1)If try block runs without any issue, catch blocks will not run.
		 2)In try-catch you can use multiple catch blocks. But the order of 
		   Exception classes are important. You have to use Child Exception classes
		   before parent Exception Classes.
		 3)After the catch blocks, you can use finally block as well. finally block runs under 
		   every condition. If there is any problem in try block "finally block" runs,
		   if there is no any problem in try block "finally block" runs.  
		 */
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream("src/day25exceptions/TextFile");
			int k;
			while((k = fis.read()) != -1) {
				System.out.print((char)k);
			}
				
		} catch (FileNotFoundException e) {
			
			System.out.println("Path is wrong or the file is deleted");
			
		} catch(IOException e) {
			
			System.out.println("The file could not be read");
			
		} finally {
			System.out.println("I am finally block");
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println("The file could not be closed");
			}			
		}

	}

}
