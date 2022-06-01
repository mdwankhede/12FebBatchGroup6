package testNgPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Pratice1Program 
{
	//program is not run in sequence
	     // second run
          @Test
          public void LoginTestCase()
          {
        	  System.out.println("Main Test Case.");
          }
          //second run
          @BeforeMethod
          public void beforemethod()
          {
        	  System.out.println("Before Method");
          }
          //third run
          @AfterMethod
          public void aftermethod()
          {
        	  System.out.println("After  Method.");
          }
          
    // Execution will not happpen in sequence 
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
}
