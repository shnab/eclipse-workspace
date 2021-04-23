package junit5subjecttutorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class J05TestingExceptions {

	@Test
	void testException1() {
		
		String str = null;
		/*
		1) the Exception class which  you put in  expected part should be able to catch te exception
		 which is thrown. It can be same exception with the thrown or can be parent exception
		 2) iF THE METHOD under test does not throw exception, assertThroows fails the test.
		 
		 */
		
		//assertThrows(NumberFormatPointerException.class
		//assertThrows(Exception)
		
		assertThrows(NullPointerException.class, 
							() -> { System.out.println("testException1 is executed");
								str.length();
							}
							);
	}

	
	/*
	 Integer.parseInt("Ali Can") throws NumberFormatException
	 Create a test method
	 */
	@Test
    void testException2() {
		
		String str= "123";
        
        assertThrows(NumberFormatException.class,
                ()-> {
                	Integer.parseInt(str);
                	}
                );
        
        
    }
	
	/*
	 Division by 0 throws ArithmeticException. Create test method 
	 */

	@Test
    void testException3() {
		
		int num1 = 4;
		int num2 = 0;
        
        assertThrows(ArithmeticException.class,
                ()-> divide(num1, num2));    
        
    }
	
	private int divide (int a, int b) {
		return a/b;
	}

	/*
	 Negative values for ages should throws IllegalArgumentException
	 Create test method
	 */

	@Test
    void testException4() {
	      int age = -12;
        assertThrows(IllegalArgumentException.class, ()-> checkAge (age));    
    }
	
	private void checkAge (int age) { // test icin klullanilacak metodlari private yapmakta fayda var
		if(age<0) {
			throw new IllegalArgumentException();
		}else {
			System.out.println(age);
		}
	}


}
