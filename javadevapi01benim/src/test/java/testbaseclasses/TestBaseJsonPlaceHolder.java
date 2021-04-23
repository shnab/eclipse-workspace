package testbaseclasses;

import org.junit.Before;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class TestBaseJsonPlaceHolder {
	
	protected RequestSpecification spec; //RequestSpecification is an INTERFACE
	
	//Junit 4 oldugu icin Before ve public kullaniliyor
	@Before
	public void setUp() {
		spec = new RequestSpecBuilder().
				setBaseUri("https://jsonplaceholder.typicode.com").
				build();
	}

}
