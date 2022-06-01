package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomePagePOMClass;
import com.SauceDemo.POMClasses.LoginPagePOMClass;
import com.SauceDemo.UtilityClasses.MethodOfScreenShot;

public class TC006SingleProductTestNG  extends TestBaseClass
{  
       //  WebDriver driver;
         @Test
         public void singleProductAddToCard() throws InterruptedException, IOException 
         {
        	 HomePagePOMClass hp = new HomePagePOMClass(driver);            
             hp.clickaddtocardButtion();
             System.out.println("Clicked on add to card button.");
             Thread.sleep(2000);
             System.out.println("Apply the validation.");
             MethodOfScreenShot.screenshotmethod(driver);
             // take the screenshot
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
