package locaterID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Facebook 
{
                    public static void main(String[] args) throws InterruptedException 
                      {
                    	System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
                        WebDriver driver=  new ChromeDriver();
                       driver.get("https://www.facebook.com/");
                       Thread.sleep(2000);
                       
                       // username
                       WebElement username = driver.findElement(By.id("email"));  
                       username.sendKeys("riyathakur2025@gmail.com");
                       
                       // password
                       WebElement password = driver.findElement(By.id("pass"));
                       password.sendKeys("sawaniana");
                  //     driver.manage().window().maximize();
                       // login
                       WebElement loginbutton = driver.findElement(By.name("login"));
                       loginbutton.click();
                      
                       String  expectedURL = "https://www.facebook.com/";
                       String actualURL = driver.getCurrentUrl();
                       if(expectedURL.equals(actualURL))
                       {
                    	   System.out.println("User is successfully able to login and hence test case is passed");
                       }
                       else
                       {
                    	   System.out.println("Test case failed.");
                       }
                       
	               	  }
            
}
