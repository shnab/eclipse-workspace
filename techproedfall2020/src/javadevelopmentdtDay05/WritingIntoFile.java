package javadevelopmentdtDay05;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingIntoFile {

	public static void main(String[] args) {

//		File folder = new File("src/javadevelopmentdtDay05/Folder1");
//		folder.mkdir();
	
		File file = new File("FileToWrite.txt");
				
//		try {
//			file.createNewFile();
//		} catch (IOException e) {
//			System.err.println(e.getMessage());
//		}
		
//		FileWriter fw;
//		try {
//			//if you do not want to delete previous text from the file use True as second argument 
//			//inside the  FileWriter(file, true);
//			fw = new FileWriter(file, true);
//			BufferedWriter bw = new BufferedWriter(fw);
//	
//			bw.write("Java is easy.");
//			bw.newLine();
//			bw.write("If you think it is hard, dream the money which you will earn.");
//			bw.newLine();
//			bw.write("Everything can be easy if you study systematically.");
//			bw.newLine();
//			
//			//Close kullanmazsak guvenlik acigi olusur ve hafizanin dolma riski var. Application yavas decreasing
//			bw.close();
//			
//			
//		} catch (IOException e) {
//			System.err.println("Some errors occured while writing into the file");
//		}
		
		//Recommended because no need to use close() for bw object, Java will close everthing
		//2. metod. Try'in icinde do the object creation
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
	
			bw.write("Java is easy.");
			bw.newLine();
			bw.write("If you think it is hard, dream the money which you will earn.");
			bw.newLine();
			bw.write("Everything can be easy if you study systematically.");
			bw.newLine();
		
			
		} catch (IOException e) {
			System.err.println("Some errors occured while writing into the file");
		}
		
	}
	}




