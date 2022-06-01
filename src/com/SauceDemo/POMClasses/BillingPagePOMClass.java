package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingPagePOMClass 
{
	private WebDriver driver;
	
    // cancel 
@FindBy(xpath="//button[@id='cancel']")
private  WebElement cancelbtn;

        public void clickcanbutton()
  {
        	cancelbtn.click();	
  }
        
        // finish 
        @FindBy(xpath="//button[@id='finish']")
        private  WebElement finishbutton;

                public void clickfinishbutton()
          {
                	finishbutton.click();
          }
               public BillingPagePOMClass(WebDriver driver)
               {
            	   this.driver = driver;
            	   PageFactory.initElements(driver, this);
               }
                
}
