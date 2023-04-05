package jUnitTestingPackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basicSeleniumMethods {
	
	WebDriver driver;
	
	
	@Before
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void testingWebApplication() {
		//gets the title of the page = return type id a string
		String title = driver.getTitle();
		
		//current URL
		String currentURL = driver.getCurrentUrl();
		
		System.out.println("The Title of the page id--->"+ title);
		System.out.println("The Current URL of the page is --->"+ currentURL);
		
	}
	@After
	public void afterMethod() {
		driver.close();
	}

}
