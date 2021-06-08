package day16multidimensionalarrayslistsdt;

public class InterviewQuestion4 {

	public static void main(String[] args) {
		 int ma[][] = {{5},{9, 6, 2}, {11,12} };

		 int sum =0;
		 
		 for(int i=0; i<ma.length; i++ ) { 
			 for(int k =0; k<ma[i].length; k++) {
				 sum = sum + ma[i][k];
			 }
		 }
		 System.out.println(sum); //45
		 
		 
		 //find the multiplication all elements
		 
		 int mult =1;
		 
		 for(int i=0; i<ma.length; i++ ) { 
			 for(int k =0; k<ma[i].length; k++) {
				 mult = mult * ma[i][k];
			 }
		 }
		 System.out.println(mult); //71280
	}

}
