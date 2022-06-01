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

public class SignOutPage 
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
                 public static void main(String[] args) throws InterruptedException, IOException 
                    {
                	 System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
             		 driver=  new ChromeDriver();
             		System.out.println("Browser open.");
             		driver.get("https://in.mail.yahoo.com/d/compose/3398331200?.intl=in&.lang=en-IN&pspid=2114723002&activity=header-mail");
             		System.out.println("Yahoo Login Page opened.");
             		screenshotmethod();
             		driver.manage().window().maximize();
             		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
             		
               		//username
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
               		System.out.println("Clicked Next.");
               		Thread.sleep(2000);
              	   screenshotmethod();
               		
               		// sign out
               		driver.findElement(By.xpath("//label[@id='ybarAccountMenuOpener']")).click();
             		System.out.println("Clicked on Account Menu Opener");
             		driver.findElement(By.xpath("//a[@id='profile-signout-link']")).click();
             		System.out.println("Clicked on signout");
             		screenshotmethod();
             		
             		String actualresult = "https://in.search.yahoo.com/?fr2=inr";
             		String expectedresult = driver.getCurrentUrl();
             		if(expectedresult.endsWith(actualresult))
             		{
             			System.out.println("Test case passed.");
             		}
             		else
             		{
             			System.out.println("test case failed.");
             		}
             		System.out.println("End of program.");
             		
             		
             		
             		
             		
             		
             		
			    	}
}
