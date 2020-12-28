package interviewQuestions;

import java.util.Arrays;

public class InterviewQuestion01 {
	
	/*
        You have 15 minutes to complete....
        Write a program to check if two given String is Anagram of each other.
        Your function should return true if two Strings are Anagram, false otherwise.
        A string is said to be an anagram if it contains the same characters and same length, but in a different order,
        For example; "army" and "Mary" are anagrams.
        You can ignore cases for this problem.
    */
    public static void main(String[] args) {
        System.out.println(isAnagram("armyy", "Mary"));
    }

    public static boolean isAnagram(String s1, String s2){
        if((s1.length()!=s2.length()) || (s1.isEmpty() || s2.isEmpty())){
            return false;
        }
        String a1[] = s1.toLowerCase().split("");
        Arrays.sort(a1);
        System.out.println(Arrays.toString(a1));

        String a2[] = s2.toLowerCase().split("");
        Arrays.sort(a2);
        System.out.println(Arrays.toString(a2));

        if(Arrays.equals(a1,a2)){
            return true;
        }else {
            return false;
        }
    }
}
