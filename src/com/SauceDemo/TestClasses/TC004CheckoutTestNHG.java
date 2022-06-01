package com.SauceDemo.TestClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.BillingPagePOMClass;
import com.SauceDemo.UtilityClasses.MethodOfScreenShot;

public class TC004CheckoutTestNHG  extends    TestBaseClass
{
	//  WebDriver driver;
           @Test
           public void Checkout() throws IOException
           {
        	   // billing information
               BillingPagePOMClass  bp =  new BillingPagePOMClass(driver);
               bp.clickfinishbutton();
               System.out.println("Clicked on finish button.");
            //   MethodOfScreenShot.screenshotmethod(driver);
               
               System.out.println("Apply validation.");
               String expURL = "https://www.saucedemo.com/checkout-complete.html";
            //   MethodOfScreenShot.screenshotmethod(driver);
               String actURL = driver.getCurrentUrl();
               if(expURL.equals(actURL))
                { 
               	System.out.println("Test case is passed.");
                }
               else
               {
               	System.out.println("Test case is Failed.");
               }
           }
}
