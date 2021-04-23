package com.techproed.javadevapi01;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import testbaseclasses.TestBaseHerOkuApp;
import static io.restassured.RestAssured.*;

public class GetRequest07 extends TestBaseHerOkuApp{
	
	/*
	 *When 
	  		I send a GET request to REST API URL https://restful-booker.herokuapp.com/booking/5 
	  Then 
		  HTTP Status Code should be 200
		  And response content type is “application/JSON” 
		  And response body should be like; 
		  { 
		  	"firstname": "Sally", 
		    "lastname": "Ericsson", 
		    "totalprice": 111,
		    "depositpaid": false, 
		    "bookingdates": { "checkin": "2017-05-23", 
		                      "checkout":"2019-07-02" }
		  }
		  
	 
	 */
	
	 @Test
	 public void get01 () {
		 //set the URL
		 spec.pathParams("bookingName", "booking",
				 		"idValue", 5);
		 
		 //send the request
		 Response response = given().spec(spec).when().get("/{bookingName}/{idValue}");
		 
		 response.prettyPrint();
		 
		 //Assert
		 //1. way
//		 response.
//		 		then().
//		 		assertThat().
//		 		statusCode(200).
//		 		contentType(ContentType.JSON).body("firstname", equalTo("Jim"),
//		 				"lastname", equalTo("Smith"),
//		 				"totalprice", equalTo(676),
//		 				"depositpaid", equalTo(false),
//		 				"bookingdates.checkin", equalTo("2020-05-21"),
//		 				"bookingdates.checkout", equalTo("2020-12-02")
//		 				); //Matchers.equalTo()
		 
		 //2. way: use JSON path class
		 JsonPath json = response.jsonPath(); //object json cretaing by using response
		 
//		 assertEquals("Mark", json.getString("firstname"));
//		 assertEquals("Smith", json.getString("lastname"));
//		 assertEquals(355, json.getInt("totalprice"));
//		 assertEquals(false, json.getBoolean("depositpaid"));
//		 assertEquals("2018-02-25", json.getString("bookingdate.checkin"));
//		 assertEquals("2018-12-25", json.getString("bookingdate.checkout"));
		 
		 //3. way : JsonPath + SoftAssert
		 	//1. step
		 	SoftAssert softAssert = new SoftAssert();
		 	
		 	//2. step
		 	softAssert.assertEquals(json.getString("firstname"), "Jim");
		 	softAssert.assertEquals(json.getString("laststname"), "Smith");
		 	softAssert.assertEquals(json.getInt("totalprice"), 730);
		 	softAssert.assertEquals(json.getBoolean("depositpaid"), false);
		 	softAssert.assertEquals(json.getString("bookingdate.checkin"), "2018-02-25");
		 	softAssert.assertEquals(json.getString("bookingdate.checkin"), "2018-12-25");
		 	
		 	//3. step
		 	softAssert.assertAll();
		 
		 
	 }

}
