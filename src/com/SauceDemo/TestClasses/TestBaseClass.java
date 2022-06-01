package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemo.POMClasses.HomePagePOMClass;
import com.SauceDemo.POMClasses.LoginPagePOMClass;
import com.SauceDemo.UtilityClasses.MethodOfScreenShot;

public class TestBaseClass
{
	WebDriver driver;
	@Parameters("browserName")
    @BeforeMethod
    public void setUp(String browserName) throws IOException
    {
    	
    	if(browserName.equals("chrome"))
    	{
     	 System.setProperty("webdriver.chrome.driver","E:\\newChromedriver_26\\chromedriver_win32\\chromedriver.exe\\");
           
         driver=  new ChromeDriver();
    	}
    	else
    	{
    		System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
    		 driver =  new FirefoxDriver();
    	}
        System.out.println("Browser open");
        driver.get("https://www.saucedemo.com/");
        System.out.println("URL open");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        MethodOfScreenShot.screenshotmethod(driver);
        // Login 
        LoginPagePOMClass lp = new LoginPagePOMClass(driver);
        lp.sendUsername();     // usernane
        System.out.println("Enter the username.");
        lp.sendPassword();      // password
        System.out.println("Enter the password.");
        lp.clickLoginButton();   // login
        System.out.println("click on login button..");
        MethodOfScreenShot.screenshotmethod(driver);
    }
    @AfterMethod
    public void tearDown()
    {
  	// log out
        HomePagePOMClass hp = new HomePagePOMClass(driver);
        hp.clickMenuButtion();
        System.out.println("Clicked on Menu Button");
        hp.clicklogoutButtion();
        System.out.println("Clicked on Logout Button");
       driver.close();
    }
}
