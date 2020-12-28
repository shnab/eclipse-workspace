package day3435Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class InterviewQuestion03 {
	
	/*
	 * Type a program to count the number of every word in a String
	 For example; if the String is "Ali, do you know Ali? Ali said you know him."
	the output should be like {Ali=3, do=1, you=2, know=2, said=1, him=1}
	 	
	 	*
	 	*/
	public static void main(String[] args) {
		
		String str = "Ali, do you know Ali? Ali said you know him. ";
		List<String> wordsList = new ArrayList<>();
		HashMap<String, Integer> counterMap = new HashMap<>();
		
		
		
		//Get the words from the String
		
		String words[] = str.split(" "); //
		System.out.println(Arrays.toString(words)); //[Ali,, do, you, know, Ali?, Ali, said, you, know, him.]
		
		//Remove punctuation marks and add the elements into the list// Noktalama isaretleri gitti.
		Arrays.stream(words).forEach(t->wordsList.add(t.replaceAll("\\W","")));
		System.out.println(wordsList); //[Ali, do, you, know, Ali, Ali, said, you, know, him]
		
		//call the method]
		countWords(counterMap, wordsList); //{know=2, do=1, said=1, him=1, you=2, Ali=3}
		

	}
	
	public static void putElIntoMap(HashMap<String, Integer> counterMap, String str) {
			if (counterMap.containsKey(str)) { //eger varsa +1 artirarak ekliyor.
			int numberOfWords = counterMap.get(str); //counterMap.get returns the value
			counterMap.put(str,numberOfWords+1); // if it is 2, it will be 3
		} else {
			counterMap.put(str, 1); // ilk defa burada bakiyor. Map icinde var mi diye. Eger yoksa +1. olarak ekliyor.
		}
		
	}
	public static void countWords (HashMap<String, Integer> counterMap, List<String> wordsList) {
		
		wordsList.stream().forEach(t->putElIntoMap(counterMap, t)); // java will use this method for every element by one by
		System.out.println(counterMap);
		
		
	}

}
