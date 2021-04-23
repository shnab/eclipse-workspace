package junit5tutorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class C02FirstTwoLastTwoCharsSameTest {

	C02FirstTwoLastTwoCharsSame obj = new C02FirstTwoLastTwoCharsSame();
	
	//ABAB==>true, AB==> true, ABCD==>false, ABBA=>false, A = >false,  ""==>false

	@ParameterizedTest
	@CsvSource (value = {"true, ABAB", "false, ABBA", "false, ABCD", "true, AB", "false, A", "false, ''"})
	void checkIfFirstTwoLastSameTest(boolean rs, String str) {
		assertEquals(rs,obj.checkIfFirstTwoLastSame(str));
		
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"ABAB", "AB"})
	void checkIfFirstTwoLastSameTest2(String str) {
		assertTrue(obj.checkIfFirstTwoLastSame(str));
		
	}
	@ParameterizedTest
	@ValueSource(strings = {"ABBA", "ABCD", "A", ""})
	void checkIfFirstTwoLastSameTest3(String str) {
		assertFalse(obj.checkIfFirstTwoLastSame(str));
		
	}
}
