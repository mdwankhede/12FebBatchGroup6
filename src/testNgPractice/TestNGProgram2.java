package testNgPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGProgram2 
{
       @BeforeMethod                           //pre-comditions
       public  void setUpMethod()
       {
    	          System.out.println("Browser, URL, Login");
    	          System.out.println("---------------------------------");
       }
       
       @Test
       public void singleProductAddToCard()
       {
    	     System.out.println("Single product add to card is verified.");
    	     System.out.println("---------------------------------");
       }
       
       
       @Test                    // main test case
       public void verifyLoginFunctionality()
       {
    	    System.out.println("Login funtionality is verify");
    	    System.out.println("---------------------------------");
       }
       @AfterMethod             // post conditions
       public void tearDown()
       {
    	    System.out.println("Browser close");
    	    System.out.println("---------------------------------");
       }
}
