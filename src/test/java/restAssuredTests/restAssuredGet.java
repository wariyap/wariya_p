package restAssuredTests;

import org.junit.Test;
import org.junit.Assert;



import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class restAssuredGet {
	
	@SuppressWarnings("deprecation")
	@Test
	//give Json format
	
	public void getMethodTest() {
		
		//set the base URL
		RestAssured.baseURI = "https://reqres.in/api/users?page=2";
		
		//create request object
		RequestSpecification httpRequest = RestAssured.given();
		
		//response object
		Response myResponse = httpRequest.request(Method.GET);
		
		//print#1
		
		System.out.println("This is the PRINT#1 Message : " 
		+ myResponse.getBody().asString());
		
		//print#2
		
		System.out.println("This is the PRINT#2 Message : " 
		
		+ myResponse.then().log().all());

		//print#3
		
				System.out.println("This is the PRINT#3 Message : " 
				
				+ myResponse.prettyPrint());
				
		//validate status code
				System.out.println("Status code is : ============" 
					+ myResponse.getStatusCode());
				Assert.assertEquals(200, myResponse.getStatusCode());
				System.out.println("its a pass");
		
				
	}
}