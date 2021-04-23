package junit5subjecttutorial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class J08RepeatSameTestMultipleTimes {
	
	//Test substring if it gives same output when you use it then times
	
	@RepeatedTest(10)
	void subStringTest() {
		System.out.println("SubString method is executed");
		assertEquals("Java", "Java OOP concept".substring(0, 4));
	}
	
	//Test exactAdd() in Java Math class if it is working as expected for first 10 positive integers
	//1+2 - 2+3 - 3+4 ...etc
	static int x  =1;
	static int y = 2;
	static int result = 3;
	@RepeatedTest(10)
	void addExactTest() {
		assertEquals(result, Math.addExact(x, y));
		System.out.println(result);
		x++;
		y++;
		result+=2;
		
	}

	
	
}
