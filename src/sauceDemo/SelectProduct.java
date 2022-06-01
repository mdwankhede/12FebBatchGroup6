package sauceDemo;

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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SelectProduct
{
static WebDriver driver;
	
	public static void screenshotmethod() throws IOException
	{
		Date d = new Date();
		  DateFormat  d1   = new SimpleDateFormat("MM-dd-yy& HH-mm-ss");
		  String date = d1.format(d);
		  
		  TakesScreenshot ts = (TakesScreenshot)driver;
		  File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		  File detifile = new File("D:\\screenshot\\SaucefilePP"+date+".jpg");
		  FileHandler.copy(sourcefile, detifile);
	}
                  public static void main(String[] args) throws IOException, InterruptedException 
                   {
                	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
                      driver=  new ChromeDriver();
                     System.out.println("Open the Browser.");
                     driver.manage().window().maximize();
                     driver.get("https://www.saucedemo.com/");
                     System.out.println("Open SauceDemo Website.");
                     screenshotmethod();
                     System.out.println("Open login page.");
                     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
                     
                     driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
                     System.out.println("Username is entered.");
                     driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
                     System.out.println("password is entered.");
                     driver.findElement(By.xpath("//input[@id='login-button']")).click();
                     System.out.println("Clicked on login Button.");
                     screenshotmethod();
                     System.out.println("Open Home page.");
                     driver.findElement(By.xpath("//img[@alt='Sauce Labs Backpack']")).click();
                     Thread.sleep(1000);
                     screenshotmethod();
                     String actualresult = "https://www.saucedemo.com/inventory-item.html?id=4";
                     String expextedresult = driver.getCurrentUrl();
                     
                     if(actualresult.equals(expextedresult))
                     {
                    	 System.out.println("Test Case is Passed.");
                     }
                     else
                     {
                    	 System.out.println("Test Case is failed.");
                     }
                     
                     System.out.println("Product is selected. ");
			    	}
}
