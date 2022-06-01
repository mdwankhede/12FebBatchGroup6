package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndex 
{
                public static void main(String[] args) 
                {
					 System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
	                   WebDriver driver=  new ChromeDriver();
	                   driver.get("https://www.facebook.com/");
	                   String title= driver.getTitle();
	                   System.out.println(title);
	                   
	                   //username
	                   WebElement username =  driver.findElement(By.xpath("//div[@class = '_6lux'][1]"));
	                   username.sendKeys("riyathakur2025@gmail.com");
	                   
	                   // password
	                  WebElement password = driver.findElement(By.xpath("//div[@class ='_6lux'][2]")) ;
	                  password.sendKeys("sawaniana");
	                  
	               // login
	                  WebElement loginbutton = driver.findElement(By.xpath("//button[@value ='1']"));
	                  loginbutton.click();
				}
}
