package junit5tutorial;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


class C03CompareArrayElementsTest {

	@ParameterizedTest
	@MethodSource("arrayProvider") // Bu yeni bir method. Burada kendimiz method yazabiliyoruz.
	void compareArrayElementsTest(boolean result, Object[] a1, Object[] a2 ) {
		
		C03CompareArrayElements obj = new C03CompareArrayElements();
		
		assertEquals(result, obj.compareElementsOfTwoArrays(a1,a2));
		
		System.out.println("Test is executed..");
	}
	static Stream<Arguments> arrayProvider(){
		
		String[] s1 = {"a", "b"}; 
		String[] s2 = {"a", "b"}; 
		
		String[] s3 = {"a", "b"}; 
		String[] s4 = {"b", "a"}; 
		
		String[] s5 = {"a", "b"}; 
		String[] s6 = {"c", "b"}; 
		
		Integer [] i1 = {1, 2,3};
		Integer [] i2 = {1, 3,2};
		
		Integer [] i3 = {1, 2,3};
		Integer [] i4 = {1,4};
		
		Character[] c1 = {'a'};
		Character[] c2 = {'a'};
		
		Character[] c3 = {'a', 'b'};
		Character[] c4 = {'b', 'a'};
		
		return Stream.of(
					Arguments.of(true, s1, s2),
					Arguments.of(true, s3, s4),
					Arguments.of(false, s5, s6),
					Arguments.of(true, i1, i2),
					Arguments.of(false, i3, i4),
					Arguments.of(true, c1, c2),
					Arguments.of(true, c3, c4)
				);
	}

}
