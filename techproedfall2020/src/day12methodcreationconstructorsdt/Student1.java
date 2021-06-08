package day12methodcreationconstructorsdt;

public class Student1 {

	String name;
	int age;
	String phone;
	
	Student1(){ } //bos contructor
	
	Student1 (String name, int age, String phone){
		this.name = name;
		this.phone = phone;
		//int age; ==> burada age tanimlamadigimiz icin instance variable olan default 0 sunucunu alacagiz.
	}

	public static void main(String[] args) {
		
		Student1 s1 = new Student1( );
		Student1 s2 = new Student1("John", 25, "029-998877");
		
		System.out.println(s2.name + ": " +s2.age + ", " + s2.phone); //John: 0, 029-998877
							//John:           0,          029-998877
	}

}
