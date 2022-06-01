package yahooApplication;

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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAccount 
{
static WebDriver driver;
	
	public static void screenshotmethod() throws IOException
	{
		Date d = new Date();
		  DateFormat  d1   = new SimpleDateFormat("MM-dd-yy& HH-mm-ss");
		  String date = d1.format(d);
		  
		  TakesScreenshot ts = (TakesScreenshot)driver;
		  File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		  File detifile = new File("D:\\screenshot\\YahooPP"+date+".jpg");
		  FileHandler.copy(sourcefile, detifile);
	}
              public static void main(String[] args) throws IOException 
                {
            	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
          		 driver=  new ChromeDriver();
          		System.out.println("Browser Open.");
          		driver.get("https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd%2F");
          		System.out.println("Yahoo Login Page Opened.");
          		screenshotmethod();
          		driver.manage().window().maximize();
          		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

      		  driver.findElement(By.xpath("//a[@id='createacc']")).click();
      		 // Thread.sleep(2000);
      		  driver.findElement(By.xpath("//input[@id='usernamereg-firstName']")).sendKeys("Dilip");
      	//	Thread.sleep(2000);
      		 driver.findElement(By.xpath("//input[@id='usernamereg-lastName']")).sendKeys("Wankhede");
      	//	Thread.sleep(2000);
      		driver.findElement(By.xpath("//input[@id='usernamereg-userId']")).sendKeys("w_dilip");
      	//	Thread.sleep(2000);
      		driver.findElement(By.xpath("//input[@id='usernamereg-password']")).sendKeys("W5d#6666");
      	      
      		driver.findElement(By.xpath("//input[@id='usernamereg-birthYear']")).sendKeys("1960");
      		
      		driver.findElement(By.xpath("//button[@id='reg-submit-button']")).click();
      		System.out.println("Create Account Page opened.");
      		screenshotmethod();
      		WebElement countrycode = driver.findElement(By.xpath("//select[@name='shortCountryCode']"));
      		countrycode.click();
         	Select s = new Select(countrycode);
      		s.selectByValue("IN");
      		driver.findElement(By.xpath("//input[@id='usernamereg-phone']")).sendKeys("9424364663");
      		driver.findElement(By.xpath("//button[@id='reg-submit-button']")).click();
      		
		    	}
}
