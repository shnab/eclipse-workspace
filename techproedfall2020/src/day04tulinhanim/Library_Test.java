package day04tulinhanim;

public class Library_Test {

	public static void main(String[] args) {
			Library [] books = new Library[3];
			books [1] = new Library("Les Miserables");
			books [2]= new Library("Crime and Punishment") ;
		
				for (Library w : books) {
					
					System.out.print(" "+ w.name);
				}
	}

}
