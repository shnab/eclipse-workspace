package com.techproed.javadevapi01;

import org.junit.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;// if restassured static is, then 

public class GetRequest01 {
	
	/*
	 	Gherkin Language:
	 	Given: it declares prerequisetes
	 	When: It defines the action which user will perform
	 	Then: Talk about outputs
	 	And: It can be used in Given, When, of you have multiple options
	 	
	 */

		/*
		 	When
			    I send a GET Request to the URL https://restful-booker.herokuapp.com/booking/3
			Then
			    HTTP Status Code should be 200
			And
			    Content Type should be JSON
			And
			    Status Line should be HTTP/1.1 200 OK
		 */
	
	@Test
	public void get01() {
		
		//1.step : set the URL
		String url ="https://restful-booker.herokuapp.com/booking/3";
		
		//2. step : Set the expected data
		
		//3. step ; Send to request to the API
		Response response = given().accept("application/json").when().get(url);
		
		response.prettyPrint();// syso gibi
		
		//4 step : Make assertions
		
		response.then().assertThat().statusCode(200).contentType(ContentType.JSON).statusLine("HTTP/1.1 200 OK"); // "application/json" also works
		
		//How to print How to print content-type, statuss code, status line, etc. on the console..
		System.out.println(response.getContentType()); //application/json; charset=utf-8
		System.out.println(response.getStatusCode()); //200
		System.out.println(response.getStatusLine()); //HTTP/1.1 200 OK
		System.out.println(response.getHeaders());
		System.out.println(response.getHeader("Date")); //Sun, 24 Jan 2021 19:15:34 GMT
		
	}	
}
