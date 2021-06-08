package day16multidimensionalarrayslistsdt;

public class InterviewQuestion3 {

	public static void main(String[] args) {

		int arr[] = {3,1,7,13,9,11};
		
		//print just last 2 elements
		
		for(int i =0; i<arr.length; i++) {
			
			if(i<arr.length-2) {
				continue; //if you wanna skip. use cantinue in for
			}
			System.out.print(arr[i] + " "); //9 11
		}
		
		System.out.println();
		
		//print just first 3 elements
		
		for(int i =0; i<arr.length; i++) {
			
			if(i>2) {
				break; // bizi loop un disina cikariyor. Ending the loop
			}
			System.out.print(arr[i] + " "); //3 1 7 
		
		}
		
		System.out.println();
		//print the elements from index 2 to index 4
		
		for(int i =0; i<arr.length; i++) {
			
			if(i<2) {
				continue; //to skip steps ol loop
			}
			
			if(i>4) {
				break; // to break the loop. bizi loop un disina cikariyor. Ending the loop
			}
			System.out.print(arr[i] + " "); //7 13 9
		
		}

	}

}
