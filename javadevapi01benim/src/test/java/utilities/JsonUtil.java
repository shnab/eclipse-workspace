package utilities;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

/*
		"utilies package" is used to store useful methods.
		If in your project you need some methods to use again and again, 
		create "utilies package and store the methods in it. " 	
		*/

public class JsonUtil {

	//Create "De-Serialization " method by using Object Mapper Class
	
	//1. step:
	//Create a ObjectMapper Class object
	private static ObjectMapper mapper;
	
	//Static block
	static {
		mapper = new ObjectMapper();
	}
	
	//2. step 
	//Create a method to convert Json Data to Java Object ==> obj ==> Map vs tum object olabilir
	//public static Object convertJsonToJava(String json, Object obj ) {
	public static <T> T convertJsonToJava(String json, Class<T> cls ) {
		
		T javaObject = null;
		
		try {
			javaObject = mapper.readValue(json, cls);
		} catch (JsonParseException e) {
			System.out.println("Could not convert JSON to Java Object" + e.getMessage());
		} catch (JsonMappingException e) {
			System.out.println("Could not convert JSON to Java Object" + e.getMessage());
		} catch (IOException e) {
			System.out.println("Could not convert JSON to Java Object" + e.getMessage());
		}
			
		return javaObject;
	}
	
	//Create a method for Serialization Java ==> to JSON
	public static String convertJavaToJson(Object obj) {
		
		String jsonResult = null;
		
		try {
			jsonResult = mapper.writeValueAsString(obj);
		} catch (JsonGenerationException e) {
			System.out.println("Could not convert Java object to Json" + e.getMessage());
		} catch (JsonMappingException e) {
			System.out.println("Could not convert Java object to Json" + e.getMessage());
		} catch (IOException e) {
			System.out.println("Could not convert Java object to Json" + e.getMessage());
		}		
		
		return jsonResult;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
