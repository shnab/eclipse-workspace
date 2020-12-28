package day04tulinhanim;

public class Question6 {

	public static void main(String[] args) {
		String names [] = {"Thomas", "Peter", "Joseph"};
		String pwd [] = new String [3];
		int idx = 0;
		try {
			for (String n : names) {
				pwd[idx] = n.substring(2,6); // pwd[0] =  omas 
				idx++;   //1
			}
		} catch (Exception e) {
			System.out.println("Invalid name");  // invalid name
		}
		for (String p : pwd) {        
			System.out.println(p);   // omas //null
		}

	}

}
