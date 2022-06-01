package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOMClass 
    {
            private  WebDriver driver;
            Actions act ;       

              @FindBy(xpath="//input[@id='user-name']")
            private  WebElement username;
              
              // actions on element - method
              
              public void sendUsername()
              {
              username.sendKeys("standard_user");
              }
              
              // password
              @FindBy(xpath="//input[@id='password']")
              private  WebElement password;
              
              public void sendPassword()
              {
            	  password.sendKeys("secret_sauce");
              }
              
              // Login
              @FindBy(xpath="//input[@id='login-button']")
              private  WebElement loginButton;
              
              public void clickLoginButton()
              {
            	  //loginButton.click();
            	  act.click(loginButton).perform();
              }
              // Constructor declar
              public LoginPagePOMClass(WebDriver  driver) 
              {
		               // global = local
                    this.driver =driver;
                    
                    // selenium class
                    PageFactory.initElements(driver, this);
                act    = new Actions(driver);
              }
             
              
              
              
              
              
              
              
              
              
              
	}
