package restAssuredTests;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class getBoards {
	
	String APTKey = "a576ffa109218ae9ac1265b18af41ac6";
			
	String OAuthToken = "ATTA4ebf8cf6b89cb37241c3c4f68ec4777d59ef7243acb0b4184d929a485732733b38ADB0B6";
	
	@Test
	
	public void getBoards() {
		//set the base URL
		RestAssured.baseURI = "https://api.trello.com/1/members/me/boards?key=a576ffa109218ae9ac1265b18af41ac6&token=ATTA4ebf8cf6b89cb37241c3c4f68ec4777d59ef7243acb0b4184d929a485732733b38ADB0B6";
		
		//create request object
		RequestSpecification httpRequest = RestAssured.given();
		
		
		
		
	}
	

}
