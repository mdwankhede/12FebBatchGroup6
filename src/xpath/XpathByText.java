package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText 
{
         public static void main(String[] args) throws InterruptedException 
         {
        	 System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
             WebDriver driver=  new ChromeDriver();
            Thread.sleep(2000);
             
             driver.manage().window().maximize();
             driver.get("https://www.facebook.com/");
             
             //username
          WebElement username  =  driver.findElement(By.xpath("//input[@id='email']"));
          username.sendKeys("riyathakur2025@gmail.com");
          
          //password
          WebElement password  =  driver.findElement(By.xpath("//input[@id='pass']"));
          password.sendKeys("sawaniana");
          
          //login
          WebElement loginbutton  =  driver.findElement(By.xpath("//button[text()='Log In']"));
          loginbutton.click();
          
		}
}
