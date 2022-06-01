package testNgPractice;

import org.testng.annotations.Test;

public class MultipleTestCasesPractice2 
{
	@Test(enabled = false)  
	   public void testA()
	   {
		    System.out.println("Test A");
	   }
	   @Test(enabled = false) // 
	   public void testB()
	   {
		    System.out.println("Test B");
	   }
	   @Test()    // by default value always true
	   public void testC()
	   {
		    System.out.println("Test C");
	   }
	   @Test()
	   public void testD()
	   {
		    System.out.println("Test D");
	   }
	   @Test()
	   public void testE()
	   {
		    System.out.println("Test E");
	   }
}
