package Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait    
{
                       public static void main(String[] args) 
                         {
                    	   System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
                           WebDriver driver=  new ChromeDriver();
                           driver.get("https://www.saucedemo.com/");
         // Selenium waits - implicit wait - gobally  applied means  applied to all elements in scripts.       
                           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
                           
                           // username
                           WebElement username = driver.findElement(By.id("user-name"));
                           username.clear();
                           username.sendKeys("standard_user");
                         
                           
                           // password
                           WebElement password = driver.findElement(By.id("password"));
                           password.clear();
                           password.sendKeys("secret_sauce");
                        
                           
                           // Log In
                           WebElement loginbutton = driver.findElement(By.id("login-button"));
                           loginbutton.click();
				    	}
}
