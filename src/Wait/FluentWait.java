package Wait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait 
{
              

				public static void main(String[] args) 
                {
                	System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
                    WebDriver driver=  new ChromeDriver();
                    driver.get("https://www.saucedemo.com/");
                       // Selenium waits - Fluent wait 
                    
                  //  Wait <WebDriver> wait = new FluentWait(WebDriver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(20)).ignoring(Exception.class);
                    
                    
                    
				}
}
