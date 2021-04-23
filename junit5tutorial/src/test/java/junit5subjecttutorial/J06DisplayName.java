package junit5subjecttutorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class J06DisplayName {

	@Test
	@DisplayName("Test parseInt () to check if it is throwing NullPointerException for nondigit characters")
    void testException() {
		
		String str= "Ali Can";
        
        assertThrows(NumberFormatException.class,
                ()-> {
                	Integer.parseInt(str);
                	}
                );
        
        
    }

}
