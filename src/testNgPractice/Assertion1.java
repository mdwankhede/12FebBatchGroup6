package testNgPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion1
{
                       @Test
                       public void logIn()
                       {
                    	   String expectedresult = " Labs";
                    		String actualresult = "Swag Labs";
                    		
                    		// hard assert
                    		
                    		Assert.assertEquals(actualresult, expectedresult);
                    		
                    		// url check 
                    		String expectedURL = "www.saucedemo.com";
                    		String actualURL = "www.saucedemo.com";
                    		Assert.assertEquals(actualURL, expectedURL);
                    
                       }
                       
                       // if our 1st assertion failed then 2nd assertion is not run
                       
                       @Test
                       public void logoutTest()
                       {
                    	   Assert.assertTrue(true);
                       }
                       
                       
                       
                       
}
