package testNgPractice;

import org.testng.annotations.Test;

public class MultipleTestCasesPractice 
{
   @Test(invocationCount =5)   // We Can run multiple time 
   public void testA()
   {
	    System.out.println("Test A");
   }
   @Test(priority =-1, invocationCount = -1) // if invocationCount = 0,-1 it will be not executed
   public void testB()
   {
	    System.out.println("Test B");
   }
   @Test(invocationCount =0)
   public void testC()
   {
	    System.out.println("Test C");
   }
   @Test(priority =1)
   public void testD()
   {
	    System.out.println("Test D");
   }
   @Test(priority =2)
   public void testE()
   {
	    System.out.println("Test E");
   }
   @Test()   
   public void testF()
   {
	    System.out.println("Test F");
   }
   @Test(priority =1)
   public void testG()
   {
	    System.out.println("Test G");
   }
}
