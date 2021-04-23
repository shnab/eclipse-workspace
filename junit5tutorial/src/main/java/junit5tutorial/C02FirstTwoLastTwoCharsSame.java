package junit5tutorial;

public class C02FirstTwoLastTwoCharsSame {
	
	//ABAB==>true, AB==> true, ABCD==>false, ABBA=>false, A = >false,  ""==>false

	public boolean checkIfFirstTwoLastSame (String str) {
		if(str.length()<=1) {
			return false;
		} 
		if (str.length()==2) {
			return true;
		}
		
		String firstTwoChars = str.substring(0, 2);
		String lastTwoChars = str.substring(str.length()-2);
		return firstTwoChars.equals(lastTwoChars);
				
	}
	
}
