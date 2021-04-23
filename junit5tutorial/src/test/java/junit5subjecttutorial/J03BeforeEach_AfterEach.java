package junit5subjecttutorial;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class J03BeforeEach_AfterEach {

	String str;
	
	@BeforeEach // will be executed before every test method.In JUNIT4, it was @Before
	void beforeEach() {
		str = "JUnit5 is better than JUnit4";
		System.out.println("beforeEach() is executed");
	}
	
	@AfterEach // will be executed after every test methods. In JUNIT4, it was @After
	void afterEach() {
		str = null;
		System.out.println("afterEach() is executed");
	}
	
	@Test
	void testArrays(TestInfo info) { //TestInfo is a interface. you can easily update message
		
		//String str = "JUnit5 is better than JUnit4";
		
		String[] actualArr = str.split(" ");
		String[] expectedArr = {"JUnit5", "is", "better", "than", "JUnit4"};
		
		System.out.println(info.getDisplayName() + "is executed"); //with TestInfo update teh mesaage dynamic
		
		assertTrue(Arrays.equals(actualArr, expectedArr));
		
	}
	
	@Test
	void testStringLength(TestInfo info) {
		
		//String str = "Unit test with JUnit5";
		int actualLength = str.length();
		int expectedLength = 28;
		
		assertEquals(expectedLength, actualLength, "Lengths are not equal");
		
		System.out.println(info.getDisplayName() + "is executed");
	}
	
//	@Test
//	void testToFindMin() {
//		
//		System.out.println("testToFindMin() is executed");
//		
//		assertTrue(Math.min(12.3, 13.2)==12.3);
//		
//		assertFalse(Math.min(12.3, 13.2)!=12.3);
//		
//		assertEquals(12.3, Math.min(12.3, 13.2));
//	
//	}
}
