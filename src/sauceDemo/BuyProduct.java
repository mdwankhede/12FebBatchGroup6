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

public class BuyProduct 
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
                  public static void main(String[] args) throws InterruptedException, IOException 
                  {
                	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe\\");
                      driver=  new ChromeDriver();
                     System.out.println("Open the Browser.");
                     driver.manage().window().maximize();
                     driver.get("https://www.saucedemo.com/");
                     System.out.println("Open SauceDemo Website.");
                     screenshotmethod();
                     System.out.println("Open  login page.");
                     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
                     
                     driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
                     System.out.println(" Username is entered.");
                    
                     driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
                     System.out.println(" Password is entered.");
                    
                     driver.findElement(By.xpath("//input[@id='login-button']")).click();
                     System.out.println("Clicked on login Button.");
                     screenshotmethod();
                     System.out.println("Open Home page.");
                     
                     driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
                     Thread.sleep(3000);
                     screenshotmethod();
                     System.out.println("Product entered in card. ");
                     
                     driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
                     screenshotmethod();
                     System.out.println("Open  Your Card Page. ");
                     
                     driver.findElement(By.xpath("//button[@id='checkout']")).click();
                     screenshotmethod();
                     System.out.println("Open CHECKOUT: YOUR INFORMATION page.");
                    
                     driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Rani");
                    System.out.println("First name is entered.");
                     driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Dangre");
                     System.out.println("Last name is entered.");
                     driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("480654");
                     System.out.println("postal-code  is entered.");
                     driver.findElement(By.xpath("//input[@id='continue']")).click();
                     System.out.println("Clicked on continue button.");
                     screenshotmethod();
                     System.out.println("Open CHECKOUT: OVERVIEW page.");
                     
                     driver.findElement(By.xpath("//button[@id='finish']")).click();
                     System.out.println("Clicked on finish button.");
                     screenshotmethod();
                     System.out.println("Product is buy.");
                     String actualresult = "https://www.saucedemo.com/checkout-complete.html";
                     String expextedresult = driver.getCurrentUrl();
                     if(actualresult.equals(expextedresult))
                     {
                  	   System.out.println("Test Case is Passed");
                     }
                     else
                     {
                  	   System.out.println("Test Case  is Failed");
                     }
                     System.out.println("Product is buy.");

				 }
}
