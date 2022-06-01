package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramByContains 
    {
	          public static void main(String[] args) throws InterruptedException 
	          {
	        	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
	              WebDriver driver=  new ChromeDriver();
	             driver.get("https://www.instagram.com/?hl=en");
	             Thread.sleep(2000);
	             String title = driver.getTitle();
	             System.out.println(title);
	          
	             //username
	            WebElement username = driver.findElement(By.xpath("//input[contains(@name, 'username')]"));
	            username.sendKeys("mayuri_d55");
	            
	            //password
	            WebElement password = driver.findElement(By.xpath("//input[contains(@aria-label, 'Password')]"));
	            password.sendKeys("mayuri@123");
	          
	            //login
	            WebElement loginbutton = driver.findElement(By.xpath("//div[contains(text(), 'Log In')]"));
	            loginbutton.click();
	            
                    // forgot password
	               WebElement forgotpassword = driver.findElement(By.xpath("//a[contains(text(), 'Forgot')]"));
                  // WebElement forgotpassword = driver.findElement(By.xpath("//a[contains(text(), 'Forgot password?')]"));
                     forgotpassword.click();
			  }

   }
