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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ComposePage 
{              
	static  WebDriver driver;
    public static void screenshotmethod() throws IOException
    {
    	Date d = new Date();
    	DateFormat d1 = new SimpleDateFormat("MM-DD-YY & HH-MM-SS");
    	String date = d1.format(d);
    	
    	  TakesScreenshot ts =  (TakesScreenshot)driver;
          File sourcefile =	ts.getScreenshotAs(OutputType.FILE);
          File destifile    = new File("D:\\screenshot\\YahooPP"+date+".jpg");
          FileHandler.copy(sourcefile, destifile);
    }
               public static void main(String[] args) throws IOException, InterruptedException
                 {
            	   System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
             		 driver=  new ChromeDriver();
             		System.out.println("Browser open.");
             		driver.get("https://in.mail.yahoo.com/d/compose/3398331200?.intl=in&.lang=en-IN&pspid=2114723002&activity=header-mail");
             		System.out.println("Yahoo Login Page opened.");
             	//	screenshotmethod();
             		driver.manage().window().maximize();
             		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
             		
             		//login functionality
             		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("w_dilip");
               		System.out.println("Username entered.");
               		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
               		System.out.println("Clicked Next .");
               		Thread.sleep(2000);
               		screenshotmethod();
               		//password
               		driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("W5d#6666");
               		System.out.println("password entered.");
               		driver.findElement(By.xpath("//button[@id='login-signin']")).click();
               		System.out.println("Clicked Next .");
             		
             		//  compose  functionality
             		driver.findElement(By.xpath("//a[text()='Compose']")).click();
             		System.out.println("Clicked on compose.");   
             		driver.findElement(By.xpath("//input[@id='message-to-field']")).sendKeys("wankhede01divya@yahoo.com");
             		System.out.println(" Mail_id is entered."); 
             		driver.findElement(By.xpath("//input[@data-test-id='compose-subject']")).sendKeys("Document");
             		System.out.println( "Subject is entered."); 
             		driver.findElement(By.xpath("//div[@data-test-id='rte']")).sendKeys("Hello! Dear Tai.... Here your pdf");
             		System.out.println( "Message  is written."); 
             		driver.findElement(By.xpath("//span[text()='Send']")).click();
             		System.out.println("Send the mail.");
             		
             		
                          		
             		
             		
             		
             		
             		
             		
	            }
}
