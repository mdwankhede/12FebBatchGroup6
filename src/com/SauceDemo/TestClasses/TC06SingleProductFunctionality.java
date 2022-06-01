package com.SauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.SauceDemo.POMClasses.HomePagePOMClass;
import com.SauceDemo.POMClasses.LoginPagePOMClass;

public class TC06SingleProductFunctionality 
{
            public static void main(String[] args) throws InterruptedException 
             {
            	System.setProperty("webdriver.chrome.driver","E:\\newChromedriver_26\\chromedriver_win32\\chromedriver.exe");
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
                
               
                // add to card
                HomePagePOMClass hp = new HomePagePOMClass(driver);            
                hp.clickaddtocardButtion();
                System.out.println("Clicked on add to card button.");
                Thread.sleep(2000);
                System.out.println("Apply the validation.");
                
                String actualresut = hp.getTextFrmCardButton();
              String expresult = "1";
                if(expresult.equals(actualresut))
                {
                	System.out.println("Test is passed.");
                }
                else
                {
                	 System.out.println("Test case is failed.");
                }
			 }
}
