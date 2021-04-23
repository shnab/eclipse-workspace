package junit5subjecttutorial;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class J09PerformanceTest {
	
	// 	Create a method to print positive integers from 1 to  1000000 on the console
	// 	Test if this task  can be completed in 3 second
	
	@Test
	@Disabled // not to run 
	void testPrintPerformance1() {
		assertTimeout(Duration.ofSeconds(6), ()-> IntStream.rangeClosed(1,1000000).forEach(System.out::println));
	}
	
	@Test
	void testPrintPerformance2() {
		assertTimeout(Duration.ofSeconds(2), ()-> IntStream.rangeClosed(1,1000).reduce((x, y) -> Math.addExact(x,y)));
	}
	
	
	
}
