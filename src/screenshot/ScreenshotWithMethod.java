package screenshot;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotWithMethod 
{
	          static WebDriver driver;
	
	             public static void screenshotmethod() throws IOException
	             {
	            	 //  simple format
	            	 Date d = new Date();
	       		  DateFormat  d1   = new SimpleDateFormat("MM-dd-yy& HH-mm-ss");
	       		  String date = d1.format(d);
	       		
	       		 //Screenshot
//	       		  
//	       		TakesScreenshot ts = (TakesScreenshot)driver;
//	    		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
//	    		File destFile = new File("D:\\screenshot\\SaucefilePP"+date+".jpg");
//	    		FileHandler.copy(sourceFile, destFile);
//	    		System.out.println("login screenshot is taken");
	    	

				TakesScreenshot ts = (TakesScreenshot)driver;
	            	 File sourcefile =  ts.getScreenshotAs(OutputType.FILE);
	                 File destfile   =    new File("D:\\screenshot\\SaucefilePP"+date+".jpg");
	                 FileHandler.copy(sourcefile, destfile);
	                 System.out.println("Login Screenshot is taken.");
	          
	       		  }
              public static void main(String[] args) throws IOException 
              {
            	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
            	  driver = new ChromeDriver(); // open the url but not screenshot
                  driver.manage().window().maximize();
                  driver.get("https://www.saucedemo.com/");
                  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
                screenshotmethod();
               
            // username
               WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
               username.sendKeys("standard_user");
          
               
               // password
               WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
               password.sendKeys("secret_sauce");
           
               
               // Log In
               WebElement loginbutton = driver.findElement(By.xpath("//input[@id='login-button']"));
               loginbutton.click();
             screenshotmethod();
               
               
               // select product
               WebElement productutton = driver.findElement(By.xpath("//img[@class='inventory_item_img']"));
               productutton.click();
               screenshotmethod();
               
			 }
}
