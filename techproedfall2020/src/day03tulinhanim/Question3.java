package day03tulinhanim;

public class Question3 {

	// Is there any issue? If not what is the result?
	
	public static void main(String[] args) {
	
		String str[]= {"name1","name2","name3"};
		String str1[]=new String[3];
		int i=0;
		try {
			for (String s : str) {
				str1[i]= s.substring(2,5); // name1 //me1
				i++;}
		} catch (Exception e) {
			System.out.println("Catching the exception");
		}finally {
			System.out.println("This is finally");
		}
		for (String s : str1) {
			System.out.println(s);
		}
	}
	}
