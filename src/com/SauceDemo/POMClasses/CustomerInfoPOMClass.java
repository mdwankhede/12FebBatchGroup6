package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerInfoPOMClass 
{
	private WebDriver driver;
	
    // firstname 
@FindBy(xpath="//input[@id='first-name']")
private  WebElement firstname;

        public void sendFirstName()
  {
        	firstname.sendKeys("Pavan sir");
  }
        
        // lastname 
        @FindBy(xpath="//input[@id='last-name']")
        private  WebElement lastname;

                public void sendLasttName()
          {
                	lastname.sendKeys("Puri");
          }
                
                // postalcode 
                @FindBy(xpath="//input[@id='postal-code']")
                private  WebElement postalcode;

                        public void sendPostalCode()
                  {
                        	postalcode.sendKeys("123654");
                  }
                        
                        // cancel 
                        @FindBy(xpath="//button[@id='cancel']")
                        private  WebElement cancelButton;

                                public void clickcancelButton()
                          {
                                	cancelButton.click();
                          }
                                
                                // continuebutn
                                @FindBy(xpath="//input[@id='continue']")
                                private  WebElement continuebutn;

                                        public void clickcontinuelButn()
                                  {
                                        	continuebutn.click();
                                  }     
                                        
                                        public CustomerInfoPOMClass(WebDriver driver)
                                        {
                                        	this.driver = driver;
                                        	PageFactory.initElements(driver, this);
                                        }
   }
