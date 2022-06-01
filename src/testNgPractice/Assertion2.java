package testNgPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion2 
{
	@Test
    public void logIn()
    {
 	   String expectedresult = "Swag  Labs";
 		String actualresult = "Swag Labs";
 		
 		// Soft assert
 		SoftAssert soft = new SoftAssert();
 		soft.assertEquals(actualresult, expectedresult);
 		soft.assertEquals(actualresult, expectedresult+" Title not matched.");
 		
 		// url check 
 		String expectedURL = "www.saucedemo.com";
 		String actualURL = "www.saucedemo.com";
 		soft.assertEquals(actualURL, expectedURL);
 		// accurate result applay this method
 		// compalsory
 		soft.assertAll();
    }
    
	@Test
	public void logOut()
	{
		Assert.assertTrue(false);
	}
   
}
