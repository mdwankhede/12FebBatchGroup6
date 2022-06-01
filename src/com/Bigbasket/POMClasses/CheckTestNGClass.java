package com.Bigbasket.POMClasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CheckTestNGClass 
{
	@Test
	public void method1()
	{
		System.out.println("Hii");
	}

   @AfterMethod
   public void aftermethod()
   {
	   System.out.println("After Method");
   }
}
