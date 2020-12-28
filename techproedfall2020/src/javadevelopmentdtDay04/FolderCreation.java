package javadevelopmentdtDay04;

import java.io.File;
import java.io.IOException;

public class FolderCreation {

	public static void main(String[] args) throws IOException {

//		File folder1 = new File("FirstFolderOutOfSrc");
//		folder1.mkdir();
//		System.out.println("Folder is created inside the project ouitside the src..");

//		File folder2 = new File("src/FirstFolderInOfSrc");
//		folder2.mkdir();
//		System.out.println("Folder is created under the src..");

//		File folder3 = new File("FirstFolderOutOfSrc/FirstSubFolder");
//		folder3.mkdirs();//make sub directry
//		System.out.println("Folder is created under the FirstFolderOutOfSrc...");
//		
//		File file1 = new File("FirstFolderOutOfSrc/FirstSubFolder/subFile1.txt");
//		file1.createNewFile();
//		System.out.println("File inside the subfolder is created...");

//Task: Create a folder under documents, name it as "MyFirstFolder"
//      Create a sub-folder under "MyFirstFolder", name it as "MyFirstSubFolder"
//      Create a file under "MyFirstFolder", name it as "FileOuter"
//      Create a file under "MyFirstSubFolder", name it as "FileInner"
	
//	File folderOuter = new File ("/Users/gebruiker/Documents/MyFirstFolder");
//	folderOuter.mkdir();
//	System.out.println("My first folder is created under Documents..");
		
//		File folderInner = new File ("/Users/gebruiker/Documents/MyFirstFolder/MyFirstSubFolder");
//		folderInnerr.mkdirs();
//		System.out.println("MyfirstSubFolder is created under Documents of MyFirstFolder..");
		
//		File fileOuter = new File ("/Users/gebruiker/Documents/MyFirstFolder/FileOuter.txt");
//		fileOuter.createNewFile();
//		System.out.println("fileOuter is created under Documents of MyFirstFolder..");
		
		File fileInner = new File ("/Users/gebruiker/Documents/MyFirstFolder/MyFirstSubFolder/FileInner.txt");
		fileInner.createNewFile();
		System.out.println("fileInner is created under Documents in MyFirstFolder..");
	
	}

}
