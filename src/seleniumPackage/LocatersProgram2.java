package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatersProgram2 
{
    public static void main(String[] args) 
    {
    	System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
        WebDriver driver=  new ChromeDriver();
        
                     driver.manage().window().maximize();
                     driver.get("https://www.instagram.com/");
        
                       // username
                       WebElement username =  driver.findElement(By.name("username"));
                        username.sendKeys("mayuri_d55");
               
                      // password
                      WebElement password = driver.findElement(By.name("password"));
                        password.sendKeys("#mayu55");
                        
                        // log in
                        WebElement loginbutton = driver.findElement(By.className("qF0y9          Igw0E     IwRSH      eGOV_         _4EzTm    bkEs3                          CovQj                  jKUp7          DhRcB "));
                        loginbutton.clear();
               
               
       
	}
}
