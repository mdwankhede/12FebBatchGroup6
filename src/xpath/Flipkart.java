package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart 
{
                public static void main(String[] args) 
                   {
                	System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
                    WebDriver driver=  new ChromeDriver();
                   driver.get("https://www.flipkart.com/account/login?ret=%2Faccount%2Forders&fromMyOrdersPage=true");
                   
                   
                // xpath by attribute
                   WebElement username = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));  //it returns WebElement
                   username.sendKeys("7566810819");
                   
                   //password
                   WebElement password = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
                   password.sendKeys("7566may#");
                   
                   //login
                   WebElement login = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
                   login.click();
                   
                    }
}
