package com.SauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.SauceDemo.POMClasses.LoginPagePOMClass;

public class TC01LoginFunctionality 
{
                // Going to to execute this class
	           public static void main(String[] args) 
	            {
	        	   System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
                   WebDriver driver=  new ChromeDriver();
                   System.out.println("Browser open");
                   driver.get("https://www.saucedemo.com/");
                   System.out.println("URL open");
                   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
                   
                   // Login 
                   LoginPagePOMClass lp = new LoginPagePOMClass(driver);
                   lp.sendUsername();     // usernane
                   System.out.println("Enter the username.");
                   lp.sendPassword();      // password
                   System.out.println("Enter the password.");
                   lp.clickLoginButton();   // login
                   System.out.println("click on login button..");
                   
                   String expectedresult = "Swag Labs";
                   String actualresult = driver.getTitle();
                   System.out.println("Verify the test cases");   
                   if(expectedresult.equals(actualresult))
                   {
                	   System.out.println("Test Case is passed.");
                   }
                   else
                   {
                	   System.out.println("Test Case is failed.");
                   }
                   // logout
                   driver.quit();
                   System.out.println("Close the Browser");   
    
		         }
}
