package javadevelopmentdtDay04;

import java.io.File;

public class FileDeletion {

	public static void main(String[] args) {
		
//		File fileToDelete1 = new File("/Users/gebruiker/Documents/MyFirstFolder/MyFirstSubFolder/FileInner.txt");
//		
//		if (fileToDelete1.delete()) {
//			System.out.println("File is deleted succesfully..");
//		} else {
//			System.out.println("File could not be deleted");
//		}
		
//		File fileToDelete2 = new File("/Users/gebruiker/Documents/MyFirstFolder/FileOuter.txtr");
//		
//		if (fileToDelete2.delete()) {
//			System.out.println("File is deleted succesfully..");
//		} else {
//			System.out.println("File could not be deleted");
//		}
		
//		File fileToDelete3 = new File("/Users/gebruiker/Documents/MyFirstFolder/MyFirstSubFolder");
//		
//		if (fileToDelete3.delete()) {
//			System.out.println("File is deleted succesfully..");
//		} else {
//			System.out.println("SubFolder could not be deleted");
//		}
		
	File fileToDelete4 = new File("/Users/gebruiker/Documents/MyFirstFolder/");
		
		if (fileToDelete4.delete()) {
			System.out.println("File is deleted succesfully..");
		} else {
			System.out.println("Folder could not be deleted");
		}
	}

}
