package day03tulinhanim;

public class Question11 {
	//Is there any issue? If not what is the result?
		public static void main(String[] args) {
			 int num1[] = {1,2,3,4};
			 int num2[]= new int [1]; 
			 num2=num1;
			 for (int i : num2) {
				System.out.println(i);
			}

	}

}
