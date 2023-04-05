package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openingBrowserTesting {

	public static void main(String[] args) {
		
		
		
		// you setting the Chrome driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\khawo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		// initialized webdriver to Chromeddriver
		WebDriver driver = new ChromeDriver();
		 
		
		// WindowUsers
		String url = "https://www.google.com/";
		driver.get(url);
				
	}

}