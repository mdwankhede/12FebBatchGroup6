package locaterTagName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon 
{
              public static void main(String[] args) throws InterruptedException 
              {
            	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
                  WebDriver driver=  new ChromeDriver();
                  driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
                 Thread.sleep(2000);
                 
                 // Email
                 WebElement emailID = driver.findElement(By.xpath("//input[@id='ap_email']"));
                 emailID.sendKeys("wankhedemayuri22@gmail.com");
                 
                 driver.findElement(By.xpath("//input[@id='continue']")).click();
                 // password
                 WebElement password = driver.findElement(By.xpath("//input[@id='ap_password']"));
                 password.sendKeys("#mayu555");
                 
                 driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
			  }
}
