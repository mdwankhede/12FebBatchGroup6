package locaterClassName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail 
{
               public static void main(String[] args) throws InterruptedException 
               {
            	   System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
                   WebDriver driver=  new ChromeDriver();
                  driver.get("https://accounts.google.com/");
                  Thread.sleep(2000);
                   // emailID
                WebElement emailid =  driver.findElement(By.name("identifier"));
                emailid.sendKeys("wankhedemayuri22@gmail.com");
                
                //next
                WebElement nextbutton =  driver.findElement(By.className("VfPpkd-vQzf8d"));
                nextbutton.click();
                
                // password
               WebElement password = driver.findElement(By.className("rFrNMe ze9ebf YKooDc q9Nsuf zKHdkd sdJrJc")) ;
               password.sendKeys("mayuri@1996");
               
            // login
               WebElement loginbutton = driver.findElement(By.className("VfPpkd-vQzf8d"));
               loginbutton.click();
			  }
               
               
}
