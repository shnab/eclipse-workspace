package day04tulinhanim;

public class Question7 {

	public static void main(String[] args) {
		String s;
		public boolean equals(Question7 str) {
			return this.s.equalsIgnoreCase(str.toString());  
			// Moon.equalsIgnore(Moon.toString)
		}
		Question7(String s){
			this.s =s;
		}
		public static void main(String[] args) {
			
		String s1 ="Moon";
		Question7 s2 = new Question7("Moon"); //String s2 = "Moon";
		System.out.println(s1=="Moon");
		System.out.println(s2.equals("Moon"));
		if ((s1=="Moon")||(s2.equals("Moon"))){
			System.out.print("A"); 
		}
		else {
			System.out.print("B");  //B    
		}
		if(s1.equalsIgnoreCase(s2.s)) { // Moon.equals(Moon)
			System.out.print("C");  //C 
		}else {
			System.out.print("D");    
		}

	}

}
