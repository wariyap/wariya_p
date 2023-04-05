package package1;

public class openBrowserUsingWebDriverManager {

	public static void main(String[] args) {
		

		//declare the driver object
        WebDriver driver;
        
        WebDriverManager.chromedriver().setup();

        //initialized webdriver to chromedriver
        driver = new ChromeDriver();

        // windowsUsers
        // \\C:\\Users\\khawo\\Downloads\\chromedriver_win32\\chromedriver.exe
        String url = "https://www.techcircleschool.com/";

        driver.get(url);

		
		
		
		
		
		
		
		
	}

}
