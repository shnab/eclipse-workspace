package day14staticblockarrays;

import java.util.Scanner;

public class StudentId {
	
	String studentName;
	int year=2000;
	String studentId;
	static int counter=1000; //static olmali
	
	public StudentId () {
		//Static01 student1 = new Static01(); // eger diger classi kullanmak istersek StudentId () contructorun icerisinde Static01 den obj creation yaparak degerleri caigirabiliriz
		//counter++; //==> counteri buraya koyarsak ilk numarayi 1001 olarak veriyor. 1 artirarak devam ediyor
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter your name");
		this.studentName= scan.next(); //Ali CAN ==> yazinca scan.next(); ten dolayi sadece ilk ismi aliyor.
		setStudentId();
		//counter++; ==> counteri buraya koyarsak ilk numarayi 1000 olarak veriyor.
	}
	

	public static void main(String[] args) {
		
		StudentId student1 = new StudentId();
		System.out.println(student1.studentName +student1.studentId); //Ali20001001
		
		StudentId student2 = new StudentId();
		System.out.println(student2.studentName + student2.studentId); //Veli20001002
		
		Static01 student3 = new Static01();
		System.out.println(student3.studentName + student3.studentId);
		
		//burada Static01 classindaki degerleri de kullanabiliyoruz.
//		Static01 student1 = new Static01();
//		System.out.println(student1.studentName + student1.studentId);
//		
//		Static01 student2 = new Static01();
//		System.out.println(student2.studentName + student2.studentId);
//
//		Static01 student3 = new Static01();
//		System.out.println(student3.studentName + student3.studentId);
	}
	
	public void setStudentId() {
		counter++; //==> counteri buraya koyarsak ilk numarayi 1001 olarak veriyor. 1 artirarak devam ediyor
		this.studentId= year + "" + counter;
	}

}
