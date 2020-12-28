package day07;

public class Question05 {

	public static void main(String[] args) {

		/*
		 * (Encapsulation) Create a new class named Question05 and by using
		 * Teachers class, create new teachers with objects then print their
		 * informations.
		 * 
		 * -- Print school information from teachers class and change the school name
		 */
		
		Teachers teacher01 = new Teachers();
		System.out.println("before asinning : " + teacher01.getName());
		
		
		teacher01.setName("mehmet");
		teacher01.setBranch("Java");
		teacher01.setSurname("Bulutluoz");
		teacher01.setPhone("5553214567");
		
		System.out.println("after assigning : "+ teacher01.getName()+ ", "+teacher01.getSurname()+", "+teacher01.getBranch()+", " + teacher01.getPhone()  );
		
		Teachers teacher02 = new Teachers();
		teacher02.setName("Mehmet");
		teacher02.setBranch("SQL");
		teacher02.setSurname("Bulut");
		teacher02.setPhone("555321234");
		System.out.println("teacher02 : " + teacher02.getName()+ ", "+teacher02.getSurname()+", "+teacher02.getPhone()+", " + teacher02.getBranch()  );
		
		System.out.println("The last name of teacher01 : " + teacher01.getSurname());
		
		
		System.out.println(Teachers.getSchoolName());
		// if you want to use instance variables in the main method you need to make them static
		
	
		System.out.println(Teachers.getSchoolName());


	}

}
