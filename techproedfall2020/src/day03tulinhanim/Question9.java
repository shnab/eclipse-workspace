package day03tulinhanim;

public class Question9 {
	
	// Is there any issue? If not what is the result?
	public static void main(String[] args) {
		int nums [][] = {{1,2},{3,4}};
		for (int i = nums.length-1; i >=0 ; i--) {
			for (int j : nums[i]) {
				System.out.print(j +" "); // 34 12
				}
			}
	
}

}
