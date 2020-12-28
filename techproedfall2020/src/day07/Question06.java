package day07;

public class Question06 {
	

	public static void main(String[] args) {
		
		/*
		 * (Pass By value)
		Create some variables for a student and assign them in main method
		-- Create a method called changeName , as parameters it will get the student’s information and after changing them it must print new ones.
		--- After calling changeName method in Main method, in second line we should print students information.
		 */

		
	String name = "Furkan";
		String surname = "Kara";
		String course = "Tester";
		
		changeName (name, surname, course);
		System.out.println(name + "," + surname + "," + course); //2/ SIRADA BU ORJINAL DEGER. Furkan,Kara,Tester

		// I want to change name in a mew method which named reallyChangeName
		name = reallyChangeName(name);
		System.out.println(name + "," + surname + "," + course); //3. sirada bu geldi. Secim,Kara,Tester
		
		
	}
	
	public static String reallyChangeName (String name)  { //Secim,Kara,Tester 3. sirada bunu yaptik 
		name = "Secim";
		return name;
		
	}
	public static void changeName(String name, String surname, String course) { //1 . sirada bu DEGISIKLIGI  yaptik. 
		name = "Secim";
		surname = "Palut";
		course = "Developer";
		System.out.println(name + "," + surname + "," + course); //Secim,Palut,Developer
	}

}
