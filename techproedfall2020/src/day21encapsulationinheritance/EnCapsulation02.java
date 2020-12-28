package day21encapsulationinheritance;

public class EnCapsulation02 {

	public static void main(String[] args) {


		EnCapsulation01 obj1 = new EnCapsulation01(); //1. adim

		System.out.println(obj1.getCollegeName()); //FIU //2. adim. object olusturmak
		
		obj1.setCollegeName("UNF");
		System.out.println(obj1.getCollegeName()); //UNF // it is updated to UNF dankzij getter
	
		Students std1 = new Students ();
		System.out.println(std1.getAddress()); //Miami, Florida
		System.out.println(std1.getName()); // Ali Can
		System.out.println(std1.getSsn()); // *****6789
	
		//create a new student whose address is "Piscataway, NewJersey", and name is "Ayse Tan", and
		//Ssn IS 987654321. PRINT THE DATA on the console
	
		Students std2 = new Students();
		
		std2.setAddress("Piscataway, NewJersey");
		std2.getAddress();
		System.out.println(std2.getAddress()); //Piscataway, NewJersey
		
	    std2.setName("Ayse Tan");
		System.out.println(std2.getName()); //Ayse Tan
		
		
		std2.setSsn("987654321");
		System.out.println(std2.getSsn()); //*****4321

	
	
	}

}
