package day07;

public class Teachers {

	private String name;
	private String surname;
	private String phone;
	private String branch;
	
	private static String schoolName="Star College";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public static String getSchoolName() {
		return schoolName;
	}
	
//	static String name; // Bu staticler kaldrildi ve sonra getter setter yapildi
//	static String surname;
//	static String phone;
//	static String branch;
//	
//	private static String schoolName="Star College";
//	
//	public static void main(String[] args) { // Getter setter classinda genelde main method olmuyor.
//		/*
//		 * Create a class named Teachers and create some instance variables
//		 * which are necessary for a teacher then assign them in main method.
//		 * 
//		 * Assign values to instance variables in class level then print them in the
//		 * main method
//		 * 
//		 * Create School Information in Class level
//		 * 
//		 * 
//		 */
//		
//		name="Tulin";
//		surname="Mungan";
//		phone="5551234567";
//		branch="Java";
//		
//		System.out.println(name+ ", "+surname+", "+phone+", " + branch  );
//		
//		System.out.println(schoolName);
//		schoolName="NewStar College";
//		System.out.println(schoolName);
		
	
	
//}

}
