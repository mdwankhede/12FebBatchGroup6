package com.SauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.SauceDemo.POMClasses.BillingPagePOMClass;
import com.SauceDemo.POMClasses.CardPagePOMClass;
import com.SauceDemo.POMClasses.CustomerInfoPOMClass;
import com.SauceDemo.POMClasses.HomePagePOMClass;
import com.SauceDemo.POMClasses.LoginPagePOMClass;

public class TC04CheckOutFunctionality 
{
                            public static void main(String[] args) throws InterruptedException 
                             {
                            	System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
                                WebDriver driver=  new ChromeDriver();
                                System.out.println("Browser is opened");
                                driver.get("https://www.saucedemo.com/");
                                System.out.println("URL is opened");
                                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
                                
                                // login
                                LoginPagePOMClass lp = new LoginPagePOMClass(driver);
                                lp.sendUsername();     // usernane
                                System.out.println("Enter the username.");
                                lp.sendPassword();      // password
                                System.out.println("Enter the password.");
                                lp.clickLoginButton();   // login
                                System.out.println("click on login button..");
                                
                               
                                // add to card
                                HomePagePOMClass hp = new HomePagePOMClass(driver);
                                hp.clickaddtocardButtion();
                                System.out.println("Clicked on add to card button.");
                                Thread.sleep(2000);
                                hp.clickshopingcard();
                                System.out.println("Clicked on add to card link .");
                                Thread.sleep(2000);
                                
                                //checkout  
                                CardPagePOMClass cpp = new CardPagePOMClass(driver);
                                cpp.clickcheckoutButtion();
                                
                                // your informatioin
                                CustomerInfoPOMClass cip = new CustomerInfoPOMClass(driver);
                                cip.sendFirstName();
                                System.out.println("First name is entered.");
                                cip.sendLasttName();
                                System.out.println("Last name is entered.");
                                cip.sendPostalCode();
                                System.out.println("Postal-code is entered.");
                                cip.clickcontinuelButn();
                                System.out.println("Clicked on continue button.");
                                
                                
                                // billing information
                                BillingPagePOMClass  bp =  new BillingPagePOMClass(driver);
                                bp.clickfinishbutton();
                                System.out.println("Clicked on finish button.");
                                
                                
                                System.out.println("Apply validation.");
                                String expURL = "https://www.saucedemo.com/checkout-complete.html";
                                String actURL = driver.getCurrentUrl();
                                if(expURL.equals(actURL))
                                 { 
                                	System.out.println("Test case is passed.");
                                 }
                                else
                                {
                                	System.out.println("Test case is Failed.");
                                }
                                //driver.quit();
                              System.out.println("Browser is closed.");
                                	
                                	
                                	
                                
                                
							 }
}
