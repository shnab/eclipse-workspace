package day03tulinhanim;

//Is there any issue? If not what is the result?
public class Question10 {
	int num;
	String str;

	public Question10(int num,String str) {
		this.num =num;
		this.str=str;
	}
	public static void main(String[] args) {
		Question10 obj1 = new Question10(10, "name");  //10,name
		Question10 obj2 = obj1;  // they are all same
		// Question10 obj2 = new Question10(10,"name");
		System.out.println(obj1==obj2);
		System.out.println(obj1.num==obj2.num);
		System.out.println(obj1.str.equals(obj2.str));

	}

}
