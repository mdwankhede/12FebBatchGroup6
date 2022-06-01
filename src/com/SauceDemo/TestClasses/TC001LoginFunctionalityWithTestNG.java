package com.SauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC001LoginFunctionalityWithTestNG extends TestBaseClass
{
	//WebDriver driver;
      @Test
      public void verifyLoginFunctionality()
      {
    	  String expectedresult = "Swag Labs";
		String actualresult = driver.getTitle();
          System.out.println("Verify the test cases");   
          
          // hard ssert
         Assert.assertEquals(actualresult, expectedresult);
          

//          if(expectedresult.equals(actualresult))
//          {
//       	   System.out.println("Test Case is passed.");
//          }
//          else
//          {
//       	   System.out.println("Test Case is failed.");
//          }
      }
      
      //
     
}
