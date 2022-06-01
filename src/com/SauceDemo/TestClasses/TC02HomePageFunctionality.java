package com.SauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.SauceDemo.POMClasses.HomePagePOMClass;
import com.SauceDemo.POMClasses.LoginPagePOMClass;

public class TC02HomePageFunctionality 
{
         public static void main(String[] args) 
         {
        	 System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
             WebDriver driver=  new ChromeDriver();
             System.out.println("Browser open");
             driver.get("https://www.saucedemo.com/");
             System.out.println("URL open");
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
             
             // login
             LoginPagePOMClass lp = new LoginPagePOMClass(driver);
             lp.sendUsername();     // usernane
             System.out.println("Enter the username.");
             lp.sendPassword();      // password
             System.out.println("Enter the password.");
             lp.clickLoginButton();   // login
             System.out.println("click on login button..");
             
             // log out
             HomePagePOMClass hp = new HomePagePOMClass(driver);
             hp.clickMenuButtion();
             System.out.println("Clicked on Menu Button");
             hp.clicklogoutButtion();
             System.out.println("Clicked on Logout Button");
             
             System.out.println("Apply validation");
             String expectedurl = "https://www.saucedemo.com/";
             String actualresult = driver.getCurrentUrl();
             
             if(expectedurl.equals(actualresult))
             {
            	 System.out.println("Test case is passed.");
             }
             else
             {
            	 System.out.println("Test case is failed.");
             }
             driver.quit();
             System.out.println("Browser is closed.");
		}
}
