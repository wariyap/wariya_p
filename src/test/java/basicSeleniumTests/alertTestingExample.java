package basicSeleniumTests;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;


public class alertTestingExample {
	WebDriver driver;

    @Before
    public void openBrowser() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
	@Test
    public void firstAlert() {
        
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	
		driver.findElement(By.xpath("//*[contains(text(), 'Click for JS Alert')]")).click();
        
        String jsText = driver.switchTo().alert().getText();
        
        System.out.println(jsText);
        
        driver.switchTo().alert().accept();
        
        
	
    }
	
	@Test
    public void secondAlert() {
        driver.findElement(By.xpath("//*[contains(text(), 'Click for JS Confirm')]")).click();
        
        String jsText = driver.switchTo().alert().getText();
        System.out.println(jsText);
       
        
        driver.switchTo().alert().accept();
    }
	
	@Test
    public void thirdAlert() {
        //pressing the alert button(blue button)
        driver.findElement(By.xpath("//*[contains(text(), 'Click for JS Prompt')]")).click();
        
        // getting the text of the alert box and printing it out
        String jsText = driver.switchTo().alert().getText();
        System.out.println(jsText);
        
        //sending string word to the alert box and accepting the alert
        String sendingString = "doll";
        driver.switchTo().alert().sendKeys(sendingString);
        driver.switchTo().alert().accept();
        
        String actualResultOnthePage =
                driver.findElement(By.xpath("//*[@id='result']")).getText();
        
//        String expectedPrint = "You entered: MrFlashlight";
        Assert.assertTrue(actualResultOnthePage.contains(sendingString));

    }
    
}
