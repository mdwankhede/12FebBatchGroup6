package locatersName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM 
{
          public static void main(String[] args) throws InterruptedException 
          {
        	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
              WebDriver driver=  new ChromeDriver();
             driver.get("https://opensource-demo.orangehrmlive.com/");
             Thread.sleep(2000);
             
             // username
             WebElement username = driver.findElement(By.name("txtUsername"));
             username.sendKeys("Admin");
             
             // password
             WebElement password = driver.findElement(By.name("txtPassword"));
             password.sendKeys("admin123");
             
             // login
             WebElement loginbutton = driver.findElement(By.name("Submit"));
             loginbutton.click();
             
             String  expectedtitle = "OrangeHRM";
             String actualtitle = driver.getTitle();
            if(expectedtitle.equals(actualtitle))
            {
           	 System.out.println("User is successfully able to login and hence test case is passed"); 
            }
            else
            {
           	 System.out.println("Test Case is failed.");  
            }
		 }
          
}
