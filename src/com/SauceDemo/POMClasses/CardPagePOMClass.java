package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CardPagePOMClass 
{
	private WebDriver driver;
    // Remove Button
@FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")
private  WebElement Removebutton;

        public void clickRemoveButtion()
  {
        	Removebutton.click();
  }
	//continue
        @FindBy(xpath="//button[@id='continue-shopping']")
        private  WebElement continuebutton;

                public void clickcontinueButtion()
          {
                	continuebutton.click();
          }
                //checkout
                @FindBy(xpath="//button[@id='checkout']")
                private  WebElement checkoutbutton;
               
                //create constructor
                        public void clickcheckoutButtion()
                  {
                        	checkoutbutton.click();
                  }
                        public CardPagePOMClass (WebDriver driver)
                        {
                        	this.driver = driver;
                        	PageFactory.initElements(driver, this);
                        }
}
