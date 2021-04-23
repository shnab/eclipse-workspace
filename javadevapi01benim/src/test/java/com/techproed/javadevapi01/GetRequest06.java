package com.techproed.javadevapi01;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import testbaseclasses.TestBaseHerOkuApp;

public class GetRequest06 extends TestBaseHerOkuApp{
	
				//WAT IS QUERY PARAM
	
	/*
	 When
	  		I send a GET request to REST API URL https://restful-booker.herokuapp.com/booking?firstname=Mark&&lastname=Ericsson
	  	 Then
	  		Among the data there should be someone whose first name is "Susan" and last name is "Brown"
	
	 */

	@Test 
	public void get01() {
		
		//set the URL
		spec.
			pathParam("bookingName", "booking").
			queryParams("firstname", "Susan",
						"lastname", "Brown");
		
		//set the expected data
		
		//send the request
		Response response = given().spec(spec).when().get("/{bookingName}");
		
		response.prettyPrint();
		
		//Assert
		response.then().assertThat().statusCode(200);
		
		assertTrue(response.asString().contains("bookingid"));
		
		
		
		
	}
}
