package javadevelopmentdtDay04;

import java.io.File;
import java.io.IOException;
public class FileCreation {

	public static void main(String[] args) throws IOException {
		/*
		 If you type just the name+extension of the file inside the File Constructor,
		 Java will put the file inside the project but outside the "src"
		 */
		
//		File file1 = new File("FirstFileOutOfSrc.txt");
//		file1.createNewFile();
//		System.out.println("File created...");
		
//		File file2 = new File("src/FirstFileInSrc.txt");
//		file2.createNewFile();
//		System.out.println("File created...");
		
//		File file3 = new File("src/javadevelopmentdtday04/FirstFileInDay04Package.txt");
//		file3.createNewFile();
//		System.out.println("File created...");
		
		//Create a file under the documents folder in your local computer and name it as your own name
		File file4 = new File("/Users/gebruiker/Documents/SuleymanAlptekin.txt");
		file4.createNewFile();
		System.out.println("File created...");
		
	}

}
