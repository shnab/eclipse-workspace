package day03tulinhanim;

public class Question2 {

	private String name;
	public int age;
	String job;
	public static void main(String[] args) {
		// Is there any issue? If not what is the result?
	Question2 obj1 = new Question2("Jack");
	Question2 obj2 = new Question2("Sam",16);	
	Question2 obj3 = new Question2("Tom",18,"Tester");
	obj1.getInfo();
	obj2.getInfo();
	obj3.getInfo();
}
	
public Question2(String name) {
	this.name =name;
	
		
}
public Question2(String name, int age) {
	setName(name); // this.name =name;
	this.age=age;
	this.job=job;
}
public Question2(String name, int age, String job) {
	// super();
	this.name = name;
	this.age = age;
	this.job = job;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
void getInfo() {
	System.out.println(name+" : "+age+" : "+job);	
}
}