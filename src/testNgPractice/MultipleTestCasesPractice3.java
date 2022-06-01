package testNgPractice;

import org.testng.annotations.Test;

public class MultipleTestCasesPractice3 
{
	@Test()  
	   public void testA()
	   {
		    System.out.println("Test A");
	   }
	   @Test(timeOut=2000)
	   public void testB() throws InterruptedException
	   {
		   Thread.sleep(10000);
		    System.out.println("Test B");
	   }
	 
}
