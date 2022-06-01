package com.SauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import com.SauceDemo.POMClasses.HomePagePOMClass;
import com.SauceDemo.POMClasses.LoginPagePOMClass;

public class Tc05MultiplePrductAddToCardFunctionality 
{
      public static void main(String[] args) throws InterruptedException 
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
            
          // multiple produtc selection
          HomePagePOMClass hp = new HomePagePOMClass(driver);
          hp.addallproduct();
           System.out.println("Add products are added to card.");
           
           //validation
           System.out.println("Applay the validation.");
           String actresult = hp.getTextFrmCardButton();
           String expresult = "6";
           
           if(expresult.equals(actresult))
           {
        	    System.out.println("Test case is passed.");
           }
           else
           {
        	   System.out.println("Test case is failed.");
           }
          
         // driver.quit();
          System.out.println("End of the product.");
          
          
          
          
          
          
	 }
}
