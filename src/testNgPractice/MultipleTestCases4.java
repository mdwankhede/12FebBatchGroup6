package testNgPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleTestCases4 
{
            @Test(priority =2)
            public void loginTest()
            {
            	System.out.println("Login-Test");
            	Assert.assertTrue(false);   //   userd to fail the test case
            }
            @Test(dependsOnMethods= {"loginTest"}, priority =1)
            public void singleProductSelect()
            {
            	System.out.println("Single Product Select.");
            }
}
//DependsOnMethod keyword override the priority keyword