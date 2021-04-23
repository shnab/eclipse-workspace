package junit5subjecttutorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class J01Assertions {
	/*
	 1) If you run multiple test methods you will get 'red"  if any test method fails
	 bUT when you check the test method names on the left, you will understand which failed, which passed
	 We do not type access modifiers but it is not ""default"
	 It is 'public' and 'protected'
	 
	 add(){} ==> addTest(){}
	 */

	@Test
	void testToFail() {
		fail("Not yet implemented");
	}
	
	@Test
	void testLength() {
		//use "actual"  for the values which are coming from the method under test
		int actualLength = "ABCD".length();
		int expectedLength = 4;
		
		//To compare actualLength and expectedLength values we have many methods IN Junit
		//They are called 'assertions'
	
		//1 assertEquals()
		//a) with 2 parameters
		//assertEquals(4, actualLength); //true or false
		
		//b with 3 parameters
		//assertEquals(expectedLength, actualLength, "The length of the String is not matching");
		
		//2.assertTrue()
		//a)
		//assertTrue(expectedLength==actualLength);
		
		//b)
		//assertTrue(expectedLength==actualLength, "Actual length is not matching with expected length");
	
		//2.assertFalse()
		//if you need to assert the length is not 5, you can use assertFalse()
		//assertFalse(expectedLength==actualLength);
		//b)
		assertFalse(expectedLength==actualLength, "The length should not be 4 but is 4");
		
		
	}
	
	/*
	 Homework : Type 
	 
	 Create a text method to test toUpperCase() by using , assertTrue-False mothods
	 by using same way with the previous example
	 */
	
	
	@Test
	void  testContainsMethod() {
		
		boolean actualResult = "Ali Can".contains("jk");
		boolean expectedResult = false;
		
		assertEquals(expectedResult,"jk");
	}
	
	
	
}
