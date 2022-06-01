package locaterID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDeme 
{
	public static void main(String[] args) throws InterruptedException    
    {
  	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
        WebDriver driver=  new ChromeDriver();
       Thread.sleep(2000);
        
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        
        // username
        WebElement username = driver.findElement(By.id("user-name"));
        username.clear();
        username.sendKeys("standard_user");
        Thread.sleep(2000);
        
        // password
        WebElement password = driver.findElement(By.id("password"));
        password.clear();
        password.sendKeys("secret_sauce");
        Thread.sleep(2000);
        
        // Log In
        WebElement loginbutton = driver.findElement(By.id("login-button"));
        loginbutton.click();
        Thread.sleep(2000);
        
      //  System.out.println("End of program");
        
       String  expectedtitle = "Swag Labs";
        String actualtitle = driver.getTitle();   
       if(expectedtitle.equals(actualtitle))
       {
      	 System.out.println("Test Case is passed."); 
       }
       else
       {
      	 System.out.println("Test Case is failed.");  // because the title is == Swag Lab(write wrong title )
       }
        
        
	 }
}
