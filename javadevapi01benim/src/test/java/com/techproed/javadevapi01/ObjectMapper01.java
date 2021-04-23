package com.techproed.javadevapi01;

import java.util.HashMap;
import org.junit.Test;
import io.restassured.response.Response;
import testbaseclasses.TestBaseJsonPlaceHolder;
import utilities.JsonUtil;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;

public class ObjectMapper01 extends TestBaseJsonPlaceHolder {
	
	/*
	 When
	 		I send GET Request to the URL https://jsonplaceholder.typicode.com/todos/198
	 		
	 	Then
	 		Status code is 200
	 		And response body is like {
									    “userId”: 10,
									    “id”: 198,
									    “title”: “quis eius est sint explicabo”,
									    “completed”: true
									  }
	 */

	@Test
	public void get01() {
		//set the url
		spec.pathParams("todos", "todos",
						"id", 198);
		
		//Set expected data
		//i need to convert JSON to java
		String expectedJson = "{\n"
                + "\"userId\": 10,\n"
                + "\"id\": 198,\n"
                + "\"title\": \"quis eius est sint explicabo\",\n"
                + "\"completed\": true\n"
                + "}";
		
		//Map is interface and abstarct. 
		HashMap <String, Object > expectedData= JsonUtil.convertJsonToJava(expectedJson, HashMap.class);
		System.out.println(expectedData); //{id=198, completed=true, title=quis eius est sint explicabo, userId=10}
		
		//send to request
		Response response = given().spec(spec).when().get("/{todos}/{id}");
		HashMap <String, Object > actualData= JsonUtil.convertJsonToJava(response.asString(), HashMap.class);
		System.out.println(actualData);//{id=198, completed=true, title=quis eius est sint explicabo, userId=10}
		
		//Assertion
		
		assertEquals(expectedData.get("completed"), actualData.get("completed"));
		assertEquals(expectedData.get("title"), actualData.get("title"));
		assertEquals(expectedData.get("userId"), actualData.get("userId"));
		
	
	}
	
	
	
}
