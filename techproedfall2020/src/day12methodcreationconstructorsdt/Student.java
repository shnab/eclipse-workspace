package day12methodcreationconstructorsdt;

public class Student {
	
	String name = "Emily";
	int age = 20;
	
	
	
	Student (String name, int age){
		this.name = name;
		this.age = 22; //buraya age yerine bir degerde yazabiliyoruz. 22 ye esiltedigimiz icin sonuc 22 cikacak
	}

	public static void main(String[] args) {
		
		Student st = new Student("Oliver", 21);
		System.out.println(st.name + ": " +st.age); //Oliver: 22
		
	}

}
