package day07;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;
	
	public class ScrabbleGame {
		
		  /* write a game like scrabble. There will be  two players. 
	     * ex. first player enters "ca" ---> second enters "car" -----> first enters "cars"----> sencond enters "crash"
	     *  
	     *  first wins !!!
	     *  
	     *  use a method / create a list with the words 
	   
	     *  
	     *  
	     *  */
		
		public static void main(String[] args) {
		
			List<String> words = new ArrayList<>();
			Scanner scan = new Scanner (System.in);
			int whoseTurn =0;
			int gameNumber =0;
			boolean isPlayed =true;
			
			while (isPlayed) {
				whoseTurn = gameNumber%2 +1;
				System.out.println(whoseTurn + "."+ "user write your word");
				String word = scan.nextLine();
				words.add(word);
				gameNumber++;
				isPlayed = gameScrabble(words) ;
			}
			if (whoseTurn==1) {
				System.out.println("Second is winner");
			}
			else {
				System.out.println("First is winner");
			}
			
			 int winner = whoseTurn == 1?2:1;
			System.out.println(winner + "." +"user won");
			System.out.println(words);
			
		}
		public static boolean gameScrabble (List<String>words) {
				if (words.size()<2)
					return true;
				String lastWord = words.get(words.size()-1);
				String previousWord = words.get(words.size()-2);
				if(lastWord.length()-previousWord.length()!=1) {
					return false; }
				if(!lastWord.contains(previousWord)) {
					return false;
			}
				return true;
	}

}
