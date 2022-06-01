package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains 
{
         public static void main(String[] args) throws InterruptedException 
         {
        	 System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
             WebDriver driver=  new ChromeDriver();
            driver.get("https://www.saucedemo.com/");
            Thread.sleep(2000);
            String title = driver.getTitle();
            System.out.println(title);
            
            // username
           // WebElement username = driver.findElement(By.xpath("//input[contains(@id,'user-name')]"));
            WebElement username = driver.findElement(By.xpath("//input[contains(@id,'name')]"));//partial text
            username.sendKeys("standard_user");
            
            // password
            //  WebElement password = driver.findElement(By.xpath("//input[contains(@id,'password')]"));
            WebElement password = driver.findElement(By.xpath("//input[contains(@id,'rd')]")); //partial text
            password.sendKeys("secret_sauce");
            
                      // login
                      WebElement loginbutton = driver.findElement(By.xpath("//input[contains(@id,'login-button')]"));
                        loginbutton.click();
            

		 }
}
