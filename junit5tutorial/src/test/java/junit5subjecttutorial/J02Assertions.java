package junit5subjecttutorial;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class J02Assertions {

	@Test
	void testToFindMin() {

		double actualMin = Math.min(12.3, 13.2); 
		double expectedMin =12.3;
		
		assertTrue(actualMin==expectedMin);
		
		assertFalse(actualMin!=expectedMin);
		
		
	}
	@Test
	void testArrays() {
		
		String str = "JUnit5 is better than JUnit4";
		
		String[] actualArr = str.split(" ");
		String[] expectedArr = {"JUnit5", "is", "better", "than", "JUnit4"};
		
		System.out.println("testArrays() is executed");
		
		assertTrue(Arrays.equals(actualArr, expectedArr));
		
	}

}
