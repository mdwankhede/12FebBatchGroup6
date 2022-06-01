package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttributes 
{
           public static void main(String[] args) 
           {
        	   System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
               WebDriver driver=  new ChromeDriver();
              driver.get("https://opensource-demo.orangehrmlive.com/");
              
              // xpath by attribute
             WebElement username = driver.findElement(By.xpath("//input[@id = 'txtUsername'] "));  //it returns WebElement
             username.sendKeys("Admin");
             
             //password
             WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
             password.sendKeys("admin123");
             
             //login
             WebElement login = driver.findElement(By.xpath("//input[@id='btnLogin']"));
             login.click();
             
	     	}
}
