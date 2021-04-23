package junit5tutorial;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.stream.IntStream;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class C04SortArraysInASpecifiedTimeTest {

	@Test
	void sortArraysInASpecifiedTimeTest1() {

		C04SortArraysInASpecifiedTime obj = new C04SortArraysInASpecifiedTime();
		
		assertTimeout(Duration.ofSeconds(2), () -> IntStream.rangeClosed(1, 100000).forEach(t->obj.sortArrayInASpecifiedTime()));

	}
	
	@RepeatedTest(100000)
	void sortArraysInASpecifiedTimeTest2() {
		
		C04SortArraysInASpecifiedTime obj = new C04SortArraysInASpecifiedTime();
		
		assertTimeout(Duration.ofSeconds(2), () -> obj.sortArrayInASpecifiedTime());
	}
}
